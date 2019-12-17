package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.stats.entity.AbnormalDeal;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface AbnormalDealService {
	
	/**
	 * 查询所有 被监控的来源站关于币对的设置信息集合
	 * @return
	 */
	List<AbnormalDeal> selectAbnormalDealList();
	
	int insertAbnormalDeal(AbnormalDeal abnormalDeal);
	
	int updateAbnormalDeal(AbnormalDeal abnormalDeal);
}
