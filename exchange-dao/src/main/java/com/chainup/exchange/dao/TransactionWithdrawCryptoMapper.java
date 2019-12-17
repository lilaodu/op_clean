package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.TransactionWithdrawCryptoExample;
import com.chainup.common.exchange.entity.TransactionWithdrawCrypto;

public interface TransactionWithdrawCryptoMapper extends SqlMapper {

    List<TransactionWithdrawCrypto> willRiskWithdrawList(@Param("symbol")String symbol,@Param("id")int id);
    
    TransactionWithdrawCrypto getLastOneWithdraw(@Param("symbol")String symbol);
    
    /**
     * 查询某个用户的所有提现信息
     * @param uid
     * @return
     */
    List<TransactionWithdrawCrypto> getUserWithdraws(@Param("uid")int uid);
    
    int countByExample(TransactionWithdrawCryptoExample example);

    int deleteByExample(TransactionWithdrawCryptoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionWithdrawCrypto record);

    int insertSelective(TransactionWithdrawCrypto record);

    TransactionWithdrawCrypto selectOnlyOneByExample(TransactionWithdrawCryptoExample example);

    List<TransactionWithdrawCrypto> selectByExample(TransactionWithdrawCryptoExample example);

    TransactionWithdrawCrypto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionWithdrawCrypto record, @Param("example") TransactionWithdrawCryptoExample example);

    int updateByExample(@Param("record") TransactionWithdrawCrypto record, @Param("example") TransactionWithdrawCryptoExample example);

    int updateByPrimaryKeySelective(TransactionWithdrawCrypto record);

    int updateByPrimaryKey(TransactionWithdrawCrypto record);
    int selectWithdrawStatisticsCount(TransactionWithdrawCryptoExample example);
    List<Map<String,Object>> selectWithdrawStatistics(TransactionWithdrawCryptoExample example);
    
    Integer selectMaxAmountUserIdByDate(@Param("date") String date,@Param("symbol") String symbol);
    
    List<Map<String,Object>> selectSettleAmountByDate(@Param("list") List<String> dateList,@Param("symbol") String symbol);
    
    TransactionWithdrawCrypto selectByPrimaryKeyAndLock(Integer id);
}