package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.stats.entity.AbnormalPrice;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface AbnormalPriceService {
	
	/**
	 * 查询所有 被监控的来源站关于币对的设置信息集合
	 * @return
	 */
	List<AbnormalPrice> selectAbnormalPriceList();
	
	int insertAbnormalPrice(AbnormalPrice abnormalPrice);
	
	int updateAbnormalPrice(AbnormalPrice abnormalPrice);
}
