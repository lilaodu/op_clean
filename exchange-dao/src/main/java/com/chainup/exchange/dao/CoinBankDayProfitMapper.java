package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBankDayProfit;
import com.chainup.common.exchange.entity.CoinBankDayProfitExample;
import com.chainup.common.exchange.entity.sumDto;

public interface CoinBankDayProfitMapper extends SqlMapper{
    long countByExample(CoinBankDayProfitExample example);

    int deleteByExample(CoinBankDayProfitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankDayProfit record);

    int insertSelective(CoinBankDayProfit record);

    List<CoinBankDayProfit> selectByExample(CoinBankDayProfitExample example);

    CoinBankDayProfit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankDayProfit record, @Param("example") CoinBankDayProfitExample example);

    int updateByExample(@Param("record") CoinBankDayProfit record, @Param("example") CoinBankDayProfitExample example);

    int updateByPrimaryKeySelective(CoinBankDayProfit record);

    int updateByPrimaryKey(CoinBankDayProfit record);
    
	List<sumDto> countProfitByDate( Map<String, Object> map);

	List<CoinBankDayProfit> selectListByCoinbank(@Param("map")Map<String, Object> map);

	long selectCountByCoinbank(@Param("map")Map<String, Object> map);
}