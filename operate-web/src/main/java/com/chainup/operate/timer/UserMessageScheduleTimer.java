package com.chainup.operate.timer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.util.CollectionUtils;

import com.chainup.common.web.Constants;
import com.chainup.common.exchange.entity.StationMessage;
import com.chainup.common.exchange.entity.StationMessageSendTask;
import com.chainup.common.exchange.entity.StationMessageSendTaskExample;
import com.chainup.common.exchange.entity.UserMessage;
import com.chainup.operate.service.StationMessageSendTaskService;
import com.chainup.operate.service.StationMessageService;
import com.chainup.operate.service.UserMessageService;

/**
 * 周期性处理站内信的发送 Timer
 * 
 * @author lilp
 */
public class UserMessageScheduleTimer {
	private static UserMessageScheduleTimer userMessageScheduleTimer;
	private static Timer insertMessageScheduletimer = null;
	private final static Integer TIMEOUT = 60000;	// 1分钟执行一次
	private static final Integer HANDLE_SENDTASK_SELECT_COUNT = 10000;	// 每次处理10000条- 加载处理发送消息任务记录
	private static final Integer HANDLE_SENDTASK_ADD_COUNT = 5000;	// 每次处理5000条- 批量插入处理发送消息任务记录
	private static final Integer HANDLE_USERMSG_COUNT = 500;	// 每次处理500条- 批量插入用户消息
	// 存放站内信内容列表
	private static HashMap<Integer, StationMessage> stationMessageMap = new HashMap<Integer, StationMessage>();
	// 存放待处理的发送消息任务列表
	private static List<StationMessageSendTask> stationMessageSendTaskList = new ArrayList<StationMessageSendTask>();
	// 存放需要发送给用户的消息列表
	private static List<UserMessage> userMessageList = new ArrayList<UserMessage>();
	
	public StationMessageSendTaskService stationMessageSendTaskService;
	public StationMessageService stationMessageService;
	public UserMessageService userMessageService;
	
	public synchronized static UserMessageScheduleTimer shareInstance() {
		if (null == userMessageScheduleTimer) {
			userMessageScheduleTimer = new UserMessageScheduleTimer();
		}
		return userMessageScheduleTimer;
	}
	
	private UserMessageScheduleTimer() {}
	
	public void setStationMessageSendTaskService(StationMessageSendTaskService stationMessageSendTaskService) {
		this.stationMessageSendTaskService = stationMessageSendTaskService;
		if(insertMessageScheduletimer == null){
			insertMessageScheduletimer = new Timer();
			insertMessageScheduletimer.schedule(new TimerTask() {
				@Override
				public void run() {
					try {
						loadData();
						insertUserMessage();
						updateMessageSendTaskStatus(Constants.NUM_ONE);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}, TIMEOUT, TIMEOUT);
		}
	    userMessageScheduleTimer = this;
	}
	
	public void setStationMessageService(StationMessageService stationMessageService) {
		this.stationMessageService = stationMessageService;
	}
	
	public void setUserMessageService(UserMessageService userMessageService) {
		this.userMessageService = userMessageService;
	}
	
	/**
	 * 批量插入消息发送任务列表
	 * 
	 * @param stationMessageSendTaskList
	 */
	public void batchInsertMessageSendTask(List<StationMessageSendTask> stationMessageSendTaskList) {
		if (stationMessageSendTaskList == null || stationMessageSendTaskList.size() == 0) {
			return;
		}
		try {
			if (stationMessageSendTaskList.size() < HANDLE_SENDTASK_ADD_COUNT) {
				stationMessageSendTaskService.batchAdd(stationMessageSendTaskList);
			} else {
				while (!CollectionUtils.isEmpty(stationMessageSendTaskList)) {
					List<StationMessageSendTask> newTaskList = new ArrayList<StationMessageSendTask>(HANDLE_SENDTASK_ADD_COUNT);
					if (stationMessageSendTaskList.size() > HANDLE_SENDTASK_ADD_COUNT) {
						newTaskList = stationMessageSendTaskList.subList(0, HANDLE_SENDTASK_ADD_COUNT);
						stationMessageSendTaskList = stationMessageSendTaskList.subList(HANDLE_SENDTASK_ADD_COUNT, stationMessageSendTaskList.size());
					} else {
						newTaskList.addAll(stationMessageSendTaskList);
						stationMessageSendTaskList.clear();
					}
					stationMessageSendTaskService.batchAdd(newTaskList);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 批量插入用户消息列表
	 * 
	 * @param userMessageList
	 */
	public void batchInsertUserMessageList(List<UserMessage> userMessageList) {
		if (userMessageList == null || userMessageList.size() == 0) {
			return;
		}
		try {
			if (userMessageList.size() < HANDLE_USERMSG_COUNT) {
				userMessageService.batchAdd(userMessageList);
			} else {
				while (!CollectionUtils.isEmpty(userMessageList)) {
					List<UserMessage> newMessageList = new ArrayList<UserMessage>(HANDLE_USERMSG_COUNT);
					if (userMessageList.size() > HANDLE_USERMSG_COUNT) {
						newMessageList = userMessageList.subList(0, HANDLE_USERMSG_COUNT);
						userMessageList = userMessageList.subList(HANDLE_USERMSG_COUNT, userMessageList.size());
					} else {
						newMessageList.addAll(userMessageList);
						userMessageList.clear();
					}
					userMessageService.batchAdd(newMessageList);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 程序加载需要处理的数据
	 */
	private void loadData() {
		try {
			StationMessageSendTaskExample sendTaskExample = new StationMessageSendTaskExample();
			StationMessageSendTaskExample.Criteria criteria = sendTaskExample.createCriteria();
			criteria.andSendStatusNotEqualTo(Constants.NUM_ONE); // 查找除了发送成功的，未发送及未发送成功的信息列表
			sendTaskExample.setOrderByClause("ctime asc"); // 默认按创建时间顺序处理
			sendTaskExample.setLimitStart(0);
			sendTaskExample.setLimitEnd(HANDLE_SENDTASK_SELECT_COUNT); // 每次加载条数
			List<StationMessageSendTask> list = stationMessageSendTaskService.findAll(sendTaskExample);
			for (StationMessageSendTask messageSendTask : list) {
				addUpdateMessageSendTaskList(messageSendTask);
				
				UserMessage userMessage = new UserMessage();
				userMessage.setReceiveUid(messageSendTask.getReceiveUid());
				StationMessage stationMessage = stationMessageMap.get(messageSendTask.getMessageContentId());
				if (stationMessage == null) {
					stationMessage = stationMessageService.findById(messageSendTask.getMessageContentId());
					stationMessageMap.put(messageSendTask.getMessageContentId(), stationMessage);
				}
				userMessage.setMessageContent(stationMessage.getSendContent());
				userMessage.setMessageType(Constants.NUM_ONE); // 1-系统消息
				userMessage.setStatus(Constants.NUM_ONE); // 1-未读
				addInsertUserMessageList(userMessage);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 添加需要插入的发送给用户的消息任务列表
	 * 
	 * @return
	 */
	private synchronized void addInsertUserMessageList(UserMessage userMessage) {
		if (userMessageList == null) {
			userMessageList = new ArrayList<UserMessage>();
		}
		userMessageList.add(userMessage);
	}
	
	/**
	 * 添加需要更新状态的发送消息任务列表
	 * 
	 * @return
	 */
	private synchronized void addUpdateMessageSendTaskList(StationMessageSendTask stationMessageSendTask) {
		if (stationMessageSendTaskList == null) {
			stationMessageSendTaskList = new ArrayList<StationMessageSendTask>();
		}
		stationMessageSendTaskList.add(stationMessageSendTask);
	}

	/**
	 * 批量处理发送用户消息任务列表任务
	 * 
	 * @param sendStatus
	 * @return
	 */
	private synchronized void insertUserMessage() {
		if (userMessageList == null || userMessageList.size() == 0) {
			return;
		}
		try {
			batchInsertUserMessageList(userMessageList);
			userMessageList.clear();
			// 针对map存储数据了大了，就清除下
			if (stationMessageMap != null && stationMessageMap.size() > 10) {
				stationMessageMap.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 批量更新任务列表状态
	 * 
	 * @param sendStatus
	 * @return
	 */
	private synchronized void updateMessageSendTaskStatus(Byte sendStatus) {
		if (stationMessageSendTaskList == null || stationMessageSendTaskList.size() == 0) {
			return;
		}
		try {
			List<Integer> idList = new ArrayList<Integer>();
			for (StationMessageSendTask messageSendTask : stationMessageSendTaskList) {
				idList.add(messageSendTask.getId());
			}
			stationMessageSendTaskService.batchUpdateStatusById(idList, sendStatus);
			stationMessageSendTaskList.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
