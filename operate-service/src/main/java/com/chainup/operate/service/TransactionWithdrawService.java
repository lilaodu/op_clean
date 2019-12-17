package com.chainup.operate.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.TransactionWithdraw;
import com.chainup.common.exchange.entity.TransactionWithdrawCrypto;
import com.chainup.common.exchange.entity.TransactionWithdrawExample;

public interface TransactionWithdrawService {
    /**
     * 添加
     * 
     * @param TransactionWithdraw
     */
    void add(TransactionWithdraw transactionWithdraw);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(TransactionWithdrawExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<TransactionWithdraw> findAll(TransactionWithdrawExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    TransactionWithdraw findById(Integer id);
    
    int updateByPrimaryKey(TransactionWithdraw record);
    
    /**
     * 根据币种查询法币提现统计信息数量
     * @param example
     * @return
     */
    int selectDeposetStatisticsCount(TransactionWithdrawExample example);
    
    /**
     * 根据币种查询法币提现统计信息
     * @param example
     * @return
     */
    List<Map<String,Object>> selectDeposetStatistics(TransactionWithdrawExample example);
    Map<Integer,TransactionWithdraw> uid2TransactionWithdraw(List<Integer> uids,Date createdAt);
}