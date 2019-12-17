package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.ExOrder;
import com.chainup.common.exchange.entity.ExOrderExample;

/**
 * 后台管理订单服务接口类
 * 
 * @author zhongjingyun 20170914
 *
 */
public interface ExOrderService{
    /**
     * 添加
     * 
     * @param
     * @param tradeSymbol 交易对编号
     */
    void add(ExOrder exOrder,String tradeSymbol);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @param tradeSymbol 交易对编号
     * @return
     */
    Integer count(ExOrderExample example,String tradeSymbol);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @param tradeSymbol 交易对编号
     * @return
     */
    List<ExOrder> findAll(ExOrderExample example,String tradeSymbol);
	
    
    /**
     * 根据条件查询订单和订单下面的流水信息
     * 
     * @param example
     * @param tradeSymbol 交易对编号
     * @return
     */
    List<ExOrder> findAllOrderAndTrade(ExOrderExample example,String tradeSymbol);
    
	/**
     * 根据Id 查找
     * 
     * @param id
     * @param tradeSymbol 交易对编号
     * @return
     */
    ExOrder findById(Long id,String tradeSymbol);

	/**
	 * 查询交易深度
	 * 订单状态为new、part_filled（暂时没有指定分批规则，先查询全部）
	 * @param side 交易方向
	 * @param tradeSymbol 交易对编号
	 * @return
	 */
    List<ExOrder> findOrderDepth(String side,String tradeSymbol);
    
    void cancleAllUserOrder(Integer userId)  throws Exception ;
    
    /**
     * 取消异常订单
     * @param userId
     * @throws Exception
     */
    public void cancleAllExpiredOrder(Integer userId) throws Exception;
    
    public int cancel(Long orderId,String tradeSymbol)  throws Exception ;
}