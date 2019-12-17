package com.chainup.operate.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.*;

/**
 * 财务对账接口类
 * @author zhongjingyun 20170912
 */
public interface AccountService {
	
	/**
	 * 
	 * @param scene 交易场景
	 * @param tradeParam 交易参数（一下参数不能为空：fromUid，fromType，toUid，toType，amount,refType,refId；其他参数可选）
	 * 					  一个场景下的多组交易一个事物完成
	 * @return 返回是否交易完成，true成功，false失败
	 * @throws Exception 
	 */
	boolean trade(String scene,List<Transaction>tradeParam) throws Exception;
	
    /**
     * 添加账户明细
     * 
     * @param Account
     */
    void add(Account account);

    /**
     * 根据条件统计账户明细记录数
     * 
     * @param example
     * @return
     */
    Integer count(AccountExample example);
    
    /**
     * 根据条件查询账户明细信息
     * 
     * @param example
     * @return
     */
    List<Account> findAll(AccountExample example);
	
	/**
     * 根据账户明细Id 查找
     * 
     * @param id
     * @return
     */
    Account findById(Integer id);
    
    /**
     * 查询用户净资产
     * @param uid
     * @param totalBalanceSymbol
     * @return
     */
    BigDecimal getTotalBalance(Integer uid,String totalBalanceSymbol);
    
    HashMap<Integer, BigDecimal> getUserAccountBalanceMap(Integer uid);
    
    Map<String, Map> getAllCoinInfo(HashMap<Integer, BigDecimal> accountMap);
    
    BigDecimal getTotalBalanceByAccountMap(HashMap<Integer, BigDecimal> accountMap,String totalBalanceSymbol);
    
    Account selectOnlyOneByExample(Integer uid,Integer type);
    
    Account selectByUidAndTypeAddLock(Account record);

    /**
     * 普通账户 + 场外交易账户
     * @param accountMap
     * @return
     */
    Map<String, Map> getAllCoinInfoForOtc(HashMap<Integer, BigDecimal> accountMap);

    List<ExSymbol> selectExSymbolByExample(ExSymbolExample example);
}
