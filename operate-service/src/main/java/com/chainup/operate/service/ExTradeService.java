package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.ExOrderExample;
import com.chainup.common.exchange.entity.ExTrade;
import com.chainup.common.exchange.entity.ExTradeExample;

/**
 * 后台管理订单流水服务接口类
 * 
 * @author zhongjingyun 20170914
 *
 */
public interface ExTradeService{
    /**
     * 添加
     * 
     * @param ExTrade
     * @param tradeSymbol 交易对编号
     */
    void add(ExTrade exTrade,String tradeSymbol);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @param tradeSymbol 交易对编号
     * @return
     */
    Integer count(ExTradeExample example,String tradeSymbol);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @param tradeSymbol 交易对编号
     * @return
     */
    List<ExTrade> findAll(ExTradeExample example,String tradeSymbol);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @param tradeSymbol 交易对编号
     * @return
     */
    ExTrade findById(Long id,String tradeSymbol);
    
    /**
     * 分页查询用户交易排行
     * @param id
     * @param tradeSymbol 交易对编号
     */
    List<Map> selectTradeSortByExample(ExTradeExample example,String tradeSymbol);
    
    /**
     * 分页查询用户交易计算count
     * @param id
     * @param tradeSymbol 交易对编号
     */
    Integer selectTradeSortCountByExample(ExTradeExample example,String tradeSymbol);
    
    /**
     * 查询最后一条交易记录
     * @param tableName
     * @return
     */
    ExTrade selectLastOne(String tradeSymbol);

}