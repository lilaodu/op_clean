package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.Transaction;
import com.chainup.common.exchange.entity.TransactionExample;

/**
 * 后台管理交易流水服务接口类
 * 
 * @author zhongjingyun 20170914
 *
 */
public interface TransactionService{
    /**
     * 添加
     * 
     * @param Transaction
     */
    void add(Transaction transaction);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(TransactionExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<Transaction> findAll(TransactionExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    Transaction findById(Long id);
}