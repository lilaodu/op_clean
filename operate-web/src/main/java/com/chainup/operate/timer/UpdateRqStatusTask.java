package com.chainup.operate.timer;

import java.util.Date;
import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.chainup.common.web.Constants;
import com.chainup.common.exchange.entity.RqInfo;
import com.chainup.common.exchange.entity.RqInfoExample;
import com.chainup.operate.service.RqInfoService;
import com.chainup.common.util.DateUtils;
import com.chainup.common.util.PropertyUtil;

public class UpdateRqStatusTask extends QuartzJobBean{
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	private RqInfoService rqInfoService;

	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		try {
			// 每天循环所有的工单数据，超过期限的-配置文件设置天数就进行关闭
			RqInfoExample example = new RqInfoExample();
			RqInfoExample.Criteria criteria = example.createCriteria();
			criteria.andRqTypeNotEqualTo(Constants.NUM_THREE); // 3-找到所有未关闭的工单
			List<RqInfo> rqInfoList = rqInfoService.findAll(example);
			if (rqInfoList != null && rqInfoList.size() > 0) {
				for (RqInfo rqInfo : rqInfoList) {
					int countDays = DateUtils.countDays(rqInfo.getCtime(), new Date());
					int rqExpiredDays = 15; // 默认15天
					String rq_expired_day = PropertyUtil.getProperties("rq_expired_day");
					if (rq_expired_day != null && !rq_expired_day.equals("")) {
						rqExpiredDays = Integer.parseInt(rq_expired_day);
					}
					if (countDays >= rqExpiredDays) { // 超过超时期限设置天数，则关闭
						rqInfo.setRqStatus(Constants.NUM_THREE); // 3-工单关闭状态
						rqInfo.setMtime(new Date());
						rqInfoService.update(rqInfo);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public RqInfoService getRqInfoService() {
		return rqInfoService;
	}

	public void setRqInfoService(RqInfoService rqInfoService) {
		this.rqInfoService = rqInfoService;
	}
}
