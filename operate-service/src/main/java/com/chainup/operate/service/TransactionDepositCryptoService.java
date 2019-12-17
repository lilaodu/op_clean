package com.chainup.operate.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.TransactionDepositCrypto;
import com.chainup.common.exchange.entity.TransactionDepositCryptoExample;
import com.chainup.common.exchange.entity.TransactionDepositExample;

public interface TransactionDepositCryptoService {
    /**
     * 添加
     * 
     * @param TransactionDepositCrypto
     */
    void add(TransactionDepositCrypto transactionDepositCrypto);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(TransactionDepositCryptoExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<TransactionDepositCrypto> findAll(TransactionDepositCryptoExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    TransactionDepositCrypto findById(Integer id);
    
    int updateByPrimaryKey(TransactionDepositCrypto record);
    
    /**
     * 根据币种查询法币充值统计信息数量
     * @param example
     * @return
     */
    int selectDeposetStatisticsCount(TransactionDepositCryptoExample example);
    
    /**
     * 根据币种查询法币充值统计信息
     * @param example
     * @return
     */
    List<Map<String,Object>> selectDeposetStatistics(TransactionDepositCryptoExample example);
    Map<Integer,TransactionDepositCrypto> uid2TransactionDepositCrypto(List<Integer> uids,Date createdAt);
    
}