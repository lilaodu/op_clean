package com.chainup.operate.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.TransactionDeposit;
import com.chainup.common.exchange.entity.TransactionDepositExample;

public interface TransactionDepositService {
    /**
     * 添加
     * 
     * @param TransactionDeposit
     */
    void add(TransactionDeposit transactionDeposit);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(TransactionDepositExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<TransactionDeposit> findAll(TransactionDepositExample example);
    
    /**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    TransactionDeposit findById(Integer id);
    
    int updateByPrimaryKey(TransactionDeposit record);
    
    /**
     * 根据币种查询法币充值统计信息数量
     * @param example
     * @return
     */
    int selectDeposetStatisticsCount(TransactionDepositExample example);
    
    /**
     * 根据币种查询法币充值统计信息
     * @param example
     * @return
     */
    List<Map<String,Object>> selectDeposetStatistics(TransactionDepositExample example);
    Map<Integer,TransactionDeposit> uid2TransactionDeposit(List<Integer> uids,Date createdAt);
}