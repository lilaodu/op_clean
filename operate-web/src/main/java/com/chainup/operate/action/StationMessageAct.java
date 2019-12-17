package com.chainup.operate.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.chainup.common.web.CommonContainer;
import com.chainup.common.web.FrontUtils;
import com.chainup.common.web.MyEConfig;
import com.chainup.common.exchange.entity.AdminActionConst;
import com.chainup.common.exchange.entity.StationMessage;
import com.chainup.common.exchange.entity.StationMessageExample;
import com.chainup.common.exchange.entity.StationMessageExample.Criteria;
import com.chainup.common.exchange.entity.StationMessageSendTask;
import com.chainup.common.exchange.entity.User;
import com.chainup.operate.jpage.JPage;
import com.chainup.operate.jpage.JPageConfig;
import com.chainup.operate.jpage.JPageException;
import com.chainup.operate.service.AdminOptLogService;
import com.chainup.operate.service.StationMessageService;
import com.chainup.operate.service.UserService;
import com.chainup.operate.timer.UserMessageScheduleTimer;
import com.chainup.operate.util.OperatePropertyUtil;
import com.chainup.common.util.StringTool;

@Controller
@Scope("prototype")
public class StationMessageAct extends BaseAct {
	private Thread handMsgThread = null;
	// 存放待处理的发送消息任务列表buffer1
	private static List<StationMessageSendTask> stationMessageSendTaskList_1 = new ArrayList<StationMessageSendTask>();
	// 存放需要处理的消息任务列表 buffer2
	private static List<StationMessageSendTask> stationMessageSendTaskList_2 = new ArrayList<StationMessageSendTask>();
	@Autowired
	private StationMessageService stationMessageService;
	@Autowired
	private UserService userService;

	/**
	 * 站内消息列表
	 * 
	 * @param pageSize
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/station_message.html")
	public String stationMessageList(String messageContent, Byte messageType, String ctimeEnd, String ctimeStart, Integer pageSize, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} else if(!this.validateAction(request, AdminActionConst.stationMessageManager)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			messageContent = (String) StringTool.parsentObjectNull(messageContent);
			messageType = (Byte) StringTool.parsentObjectNull(messageType);
			ctimeEnd = (String) StringTool.parsentObjectNull(ctimeEnd);
			ctimeStart = (String) StringTool.parsentObjectNull(ctimeStart);
			pageSize = (Integer) StringTool.parsentObjectNull(pageSize);
			if (pageSize == null)
				pageSize = CURRENT_PAGE_SIZE;
			JPageConfig jpc = null;
			try {
				jpc = new JPageConfig();
			} catch (JPageException e) {
				e.printStackTrace();
				return "view";
			}
			StationMessageExample example = new StationMessageExample();
			Criteria criteria = example.createCriteria();
			if (messageContent != null) {
				criteria.andSendContentLike("%" + messageContent.trim() + "%");
			}
			if (messageType != null) {
				criteria.andMessageTypeEqualTo(messageType);
			}
			String date_format = OperatePropertyUtil.getProperties("system_date_format");
			SimpleDateFormat sdhmsf = new SimpleDateFormat(date_format);
			if (ctimeStart != null) {
				criteria.andCtimeGreaterThanOrEqualTo(sdhmsf.parse(ctimeStart));
			}
			if (ctimeEnd != null) {
				criteria.andCtimeLessThanOrEqualTo(sdhmsf.parse(ctimeEnd));
			}
			jpc.setPageSize(pageSize);
			jpc.setRequest(request);
			int count = stationMessageService.count(example);
			jpc.setRecordTotal(count);
			jpc.commit();
			int start = jpc.getRecordStart();
			int length = jpc.getRecordLength();
			example.setLimitStart(start);
			example.setLimitEnd(length);
			example.setOrderByClause("ctime desc"); // 默认按创建时间倒序
			List<StationMessage> stationMessageList = stationMessageService.findAll(example);
			JPage jpage = jpc.getJpage();
			jpage.setUrlServlet(request.getContextPath() + "/station_message.html");
			request.setAttribute("jpage", jpage);
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			model.addAttribute("stationMessageList", stationMessageList);
			model.addAttribute("count", count);
			model.addAttribute("pageSize", pageSize);
			model.addAttribute("messageContent", messageContent);
			model.addAttribute("messageType", messageType);
			model.addAttribute("ctimeEnd", ctimeEnd);
			model.addAttribute("ctimeStart", ctimeStart);
			model.addAttribute("request", request);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "station_message");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 添加站内信, 打开添加页面
	 * 
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/station_message_add.html")
	public String station_message_add(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
		try {
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				response.sendRedirect("login.html");
				return null;
			} else if(!this.validateAction(request, AdminActionConst.stationMessageAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			MyEConfig config = CommonContainer.getSite();
			FrontUtils.frontData(request, model, config);
			return FrontUtils.getTplPath(config.getSolutionPath(), "", "station_message_add");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 添加站内信,提交请求
	 * 
	 * @param noticeInfo
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/station_message_add_submit.html")
	public String station_message_add_submit(StationMessage stationMessage, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		Integer result = 0;
		try {
			//验证token
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", EXCEPTION_ONE);
				writeJson(jsonStr.toString(), request, response);
				return null;
			} else if(!this.validateAction(request, AdminActionConst.stationMessageAdd)){
				MyEConfig config = CommonContainer.getSite();
				FrontUtils.frontData(request, model, config);
				model.addAttribute("error", getLocalMsg("noaction_error", request));
				return FrontUtils.getTplPath(config.getSolutionPath(), "", "error");
			}
			if (stationMessage != null) {
				// 获取正确的中文信息
				stationMessage.setSendContent(getSafeUtf8(stationMessage.getSendContent().trim(), request));
				String receiveUserIds = (String) StringTool.parsentObjectNull(stationMessage.getReceiveUid());
				stationMessage.setReceiveUid(receiveUserIds == null ? "0" : receiveUserIds); // 默认为空，发送给全部用户，用0代替
				stationMessage.setMessageType((byte) 1);
				stationMessage.setSendUid(adminUser.getId());
				stationMessage.setCtime(new Date());
				stationMessageService.add(stationMessage);
				Integer messageContentId = stationMessage.getId();
				
				// 新增消息任务队列
				addStationMessageSendTaskQueue(receiveUserIds, messageContentId);
				if (handMsgThread == null) {
					handMsgThread = new Thread(new Runnable() {
						@Override
						public void run() {
							handleStationMessageSendTaskQueue();
						}
					});
					handMsgThread.start();
				}
				result = SUCCESS_ONE;
				String desc = getLocalMsg("station.message.add.title", request) + "：id=" + messageContentId;
				writeLog(request, "station_message", AdminOptLogService.ADMIN_LOG_TYPE_ADD, desc);
			}
			jsonStr.put("result", result);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 根据id 获取站内信信息
	 * 
	 * @param id
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/find_station_message.html")
	public String find_station_message(Integer id, HttpServletRequest request, HttpServletResponse response,
			ModelMap model) {
		JSONObject jsonStr = new JSONObject();
		try {
			//验证token
			if(!this.validToken(request)) {
				jsonStr.put("result", FAIL_VALID_TOKEN);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			if (!this.execute(request, response, model).equals(AUTH_STATUS)) {
				jsonStr.put("result", -1);
				writeJson(jsonStr.toString(), request, response);
				return null;
			}
			StationMessage stationMessage = stationMessageService.findById(id);
			jsonStr.put("stationMessage", stationMessage);
			jsonStr.put("result", SUCCESS_ONE);
			writeJson(jsonStr.toString(), request, response);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 批量添加消息任务列表队列
	 * 
	 * @param receiveUserIds
	 * @param messageContentId
	 */
	private synchronized void addStationMessageSendTaskQueue(String receiveUserIds, Integer messageContentId) {
		try {
			if(receiveUserIds == null){ // 全部用户
				List<User> userList = userService.findAllUserList();
				for (User user : userList) {
					StationMessageSendTask messageSendTask = new StationMessageSendTask();
					messageSendTask.setReceiveUid(user.getId());
					messageSendTask.setMessageContentId(messageContentId);
					stationMessageSendTaskList_1.add(messageSendTask);
				}
			} else { // 特定用户
				List<String> userIds = StringTool.stringToList(receiveUserIds, ";");
				for(String userId : userIds){
					StationMessageSendTask messageSendTask = new StationMessageSendTask();
					messageSendTask.setReceiveUid(Integer.parseInt(userId));
					messageSendTask.setMessageContentId(messageContentId);
					stationMessageSendTaskList_1.add(messageSendTask);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 拷贝添加消息任务列表队列
	 * 
	 * @return
	 */
	private synchronized void copyStationMessageSendTaskQueue() {
		if (stationMessageSendTaskList_1 == null || stationMessageSendTaskList_1.size() == 0) {
			return;
		}
		try {
			stationMessageSendTaskList_2.addAll(stationMessageSendTaskList_1);
			stationMessageSendTaskList_1.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 处理批量插入发送消息队列
	 * 
	 * @return
	 */
	private void handleStationMessageSendTaskQueue() {
		try {
			while (true) {
				copyStationMessageSendTaskQueue();
				if (stationMessageSendTaskList_2.size() == 0) {
					Thread.sleep(5000);
					continue;
				}
				UserMessageScheduleTimer.shareInstance().batchInsertMessageSendTask(stationMessageSendTaskList_2);
				stationMessageSendTaskList_2.clear();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
