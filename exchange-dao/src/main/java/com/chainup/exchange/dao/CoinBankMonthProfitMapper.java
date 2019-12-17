package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBankMonthProfit;
import com.chainup.common.exchange.entity.CoinBankMonthProfitExample;

public interface CoinBankMonthProfitMapper extends SqlMapper{
    long countByExample(CoinBankMonthProfitExample example);

    int deleteByExample(CoinBankMonthProfitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankMonthProfit record);

    int insertSelective(CoinBankMonthProfit record);

    List<CoinBankMonthProfit> selectByExample(CoinBankMonthProfitExample example);

    CoinBankMonthProfit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankMonthProfit record, @Param("example") CoinBankMonthProfitExample example);

    int updateByExample(@Param("record") CoinBankMonthProfit record, @Param("example") CoinBankMonthProfitExample example);

    int updateByPrimaryKeySelective(CoinBankMonthProfit record);

    int updateByPrimaryKey(CoinBankMonthProfit record);
}