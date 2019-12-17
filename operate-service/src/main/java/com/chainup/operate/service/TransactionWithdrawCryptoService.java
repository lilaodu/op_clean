package com.chainup.operate.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.TransactionDeposit;
import com.chainup.common.exchange.entity.TransactionWithdrawCrypto;
import com.chainup.common.exchange.entity.TransactionWithdrawCryptoExample;

public interface TransactionWithdrawCryptoService {
    /**
     * 添加
     * 
     * @param TransactionWithdrawCrypto
     */
    void add(TransactionWithdrawCrypto transactionWithdrawCrypto);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(TransactionWithdrawCryptoExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<TransactionWithdrawCrypto> findAll(TransactionWithdrawCryptoExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    TransactionWithdrawCrypto findById(Integer id);
    
    int updateByPrimaryKey(TransactionWithdrawCrypto record);
    
    /**
     * 根据币种查询法币体现统计信息数量
     * @param example
     * @return
     */
    int selectDeposetStatisticsCount(TransactionWithdrawCryptoExample example);
    
    /**
     * 根据币种查询法币提现统计信息
     * @param example
     * @return
     */
    List<Map<String,Object>> selectDeposetStatistics(TransactionWithdrawCryptoExample example);
    Map<Integer,TransactionWithdrawCrypto> uid2TransactionWithdrawCrypto(List<Integer> uids,Date createdAt);
}