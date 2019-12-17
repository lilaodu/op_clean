package com.chainup.operate.timer;

import java.util.Date;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.chainup.common.web.Constants;
import com.chainup.common.exchange.entity.RqInfo;
import com.chainup.common.exchange.entity.RqInfoExample;
import com.chainup.common.exchange.entity.User;
import com.chainup.operate.service.RqInfoService;
import com.chainup.operate.service.UserService;
import com.chainup.common.util.DateUtils;
import com.chainup.common.util.PropertyUtil;

public class UpdateUserStatusTask extends QuartzJobBean{
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	private UserService userService;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		try {
			List<User> userList = userService.findAllUserList();
			if(userList!=null && userList.size()>0){
				for(User user:userList){
					if(user.getWithdrawStatus()==0 && user.getWithdrawexpireTime().getTime()<=System.currentTimeMillis()){//冻结状态解除
						user.setWithdrawStatus((byte)1);
						userService.updateByPrimaryKey(user);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
