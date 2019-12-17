package com.chainup.operate.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.chainup.common.enums.VictoryStatus;
import com.chainup.otc.entity.OtcChat;
import com.chainup.otc.entity.OtcOrder;
import com.chainup.otc.entity.OtcUserComplaint;

public interface OtcOrderService {

	public List<OtcOrder> selectOrderByUser(int userId, int start, int end, String orderNumber) throws Exception;

	public long countOrderByUser(int userId, String orderNumber) throws Exception;

	public List<OtcChat> selectChatByOrder(String orderId, int start, int end) throws Exception;

	public long countChatByOrder(long orderId) throws Exception;

	public OtcUserComplaint saveOtcUserComplaint(OtcUserComplaint complaint,VictoryStatus victoryStatus ,OtcOrder order) throws Exception;
	
	public OtcOrder findById(Long id) throws Exception;
	
	/***
	 * 确认支付和打币时对ext更新
	 * @param turnover
	 * @param completeOrders
	 * @param trustScore
	 * @param lastTradeTime
	 * @param uid
	 * @param responseScore
	 * @return
	 * @throws Exception
	 */
	public boolean updateOtcExt(BigDecimal turnover, Integer completeOrders,
			Integer trustScore, Date lastTradeTime, Long uid) throws Exception;
}
