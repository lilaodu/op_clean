package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.stats.entity.AbnormalTrade;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface AbnormalTradeService {
	
	/**
	 * 根据条件查询异常价格交易列表
	 * @return
	 */
	List<AbnormalTrade> getAbnormalTradeList(AbnormalTrade trade);
	
	int getAbnormalTradeCount(AbnormalTrade trade);
}
