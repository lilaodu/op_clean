package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.TransactionDepositCryptoExample;
import com.chainup.common.exchange.entity.TransactionDepositCrypto;

public interface TransactionDepositCryptoMapper  extends SqlMapper {

	/**
	 * 查询所有充值的用户ID列表
	 * @return
	 */
	List<Integer> selectUserIdList();
	
	/**
	 * 查询所有充值的币种列表
	 * @return
	 */
	List<String> selectSymbolList();
	
	List<TransactionDepositCrypto> getUserDeposits(@Param("uid")int uid);
	
    int countByExample(TransactionDepositCryptoExample example);

    int deleteByExample(TransactionDepositCryptoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionDepositCrypto record);

    int insertSelective(TransactionDepositCrypto record);

    TransactionDepositCrypto selectOnlyOneByExample(TransactionDepositCryptoExample example);

    List<TransactionDepositCrypto> selectByExample(TransactionDepositCryptoExample example);

    TransactionDepositCrypto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionDepositCrypto record, @Param("example") TransactionDepositCryptoExample example);

    int updateByExample(@Param("record") TransactionDepositCrypto record, @Param("example") TransactionDepositCryptoExample example);

    int updateByPrimaryKeySelective(TransactionDepositCrypto record);

    int updateByPrimaryKey(TransactionDepositCrypto record);
    
    List<Map<String,Object>> selectDeposetStatistics(TransactionDepositCryptoExample example);
    
    List<Map<String,Object>> selectSettleAmountByDate(@Param("list") List<String> dateList,@Param("symbol")String symbol);
    
    int selectDeposetStatisticsCount(TransactionDepositCryptoExample example);
    
    Integer selectMaxAmountUserIdByDate(@Param("date") String date,@Param("symbol") String symbol);
	
}