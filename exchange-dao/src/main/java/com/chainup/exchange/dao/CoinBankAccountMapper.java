package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CbIdsDto;
import com.chainup.common.exchange.entity.CoinBankAccount;
import com.chainup.common.exchange.entity.CoinBankAccountExample;
import com.chainup.common.exchange.entity.sumDto;

public interface CoinBankAccountMapper extends SqlMapper {
    long countByExample(CoinBankAccountExample example);

    int deleteByExample(CoinBankAccountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankAccount record);

    int insertSelective(CoinBankAccount record);

    List<CoinBankAccount> selectByExample(CoinBankAccountExample example);

    CoinBankAccount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankAccount record, @Param("example") CoinBankAccountExample example);

    int updateByExample(@Param("record") CoinBankAccount record, @Param("example") CoinBankAccountExample example);

    int updateByPrimaryKeySelective(CoinBankAccount record);

    int updateByPrimaryKey(CoinBankAccount record);
	List<CbIdsDto> selectAllAccount(Integer bankid);
	
	List<sumDto> countCoinbankDayProfit(String date);
	
	List<sumDto> countCoinbankAccountDayProfit(String date);
	
}