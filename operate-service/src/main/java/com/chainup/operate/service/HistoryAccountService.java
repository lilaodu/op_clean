package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.HistoryAccount;
import com.chainup.common.exchange.entity.HistoryAccountExample;

/**
 * 后台管理交易快照服务接口类
 * 
 * @author zhongjingyun 20170914
 *
 */
public interface HistoryAccountService{
    /**
     * 添加
     * 
     * @param HistoryAccount
     */
    void add(HistoryAccount historyAccount);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(HistoryAccountExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<HistoryAccount> findAll(HistoryAccountExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    HistoryAccount findById(Long id);
}