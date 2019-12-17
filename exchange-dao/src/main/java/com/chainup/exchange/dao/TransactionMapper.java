package com.chainup.exchange.dao;


import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.Transaction;
import com.chainup.common.exchange.entity.TransactionExample;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TransactionMapper extends SqlMapper {
    int countByExample(TransactionExample example);

    int deleteByExample(TransactionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    Transaction selectOnlyOneByExample(TransactionExample example);

    List<Transaction> selectByExample(TransactionExample example);

    Transaction selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);

    /**
     * 用户统计，用户对账时调用
     * @param param
     * @return
     */
    Map<String,BigDecimal> selectBillingCheck(Map<String, Object> param);

    /**
     * 用户统计，用户对账时调用
     * @param param
     * @return
     */
    Map<String,BigDecimal> selectOtcBillingCheck(Map<String, Object> param);
    
    /**
     * 公司利润，成本统计
     *
     * @param param
     * @return
     */
    Map<String, BigDecimal> selectComTransactionSum(Map<String, Object> param);

    /**
     * 充值提现
     * @param param
     * @return
     */
    Map<String, BigDecimal> selectDepositAndWithdrawSum(Map<String, Object> param);

    /**
     * 买入卖出汇总
     * @param param
     * @return
     */
    Map<String, BigDecimal> selectTradeSumByCoin(Map<String, Object> param);
    /**
     * 场外买入卖出汇总
     * @param param
     * @return
     */
    Map<String, BigDecimal> selectTradeSumByCoinV2(Map<String, Object> param);
    
    List<Transaction> selectFinanceTransaction(Map<String,Object> param);
    
    int selectFinanceTransactionCount(Map<String,Object> param);

    BigDecimal selectComTransactionSumFee(Map<String,Object> param);

    /***
     *
     * 转账记录
     *
     * @param dateStart
     * @param dateEnd
     * @param pageStart
     * @param pageCount
     * @return List<Transaction>
     */
    List<Transaction> selectByCtime(@Param("dateStart") Date dateStart, @Param("dateEnd") Date dateEnd,
                                    @Param("pageStart") int pageStart, @Param("pageCount") int pageCount, @Param("scene") String scene);

    /***
     *
     * 转账记录数
     *
     * @param dateStart
     * @param dateEnd
     * @return int
     */
    int recordCount(@Param("dateStart") Date dateStart, @Param("dateEnd") Date dateEnd, @Param("scene") String scene);

}