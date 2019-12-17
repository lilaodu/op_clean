package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.stats.entity.AbnormalDealTrade;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface AbnormalDealTradeService {
	
	/**
	 * 根据条件查询异常价格交易列表
	 * @return
	 */
	List<AbnormalDealTrade> getAbnormalDealTradeList(AbnormalDealTrade trade);
	
	int getAbnormalDealTradeCount(AbnormalDealTrade trade);
}
