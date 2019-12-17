package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBankWeekProfit;
import com.chainup.common.exchange.entity.CoinBankWeekProfitExample;

public interface CoinBankWeekProfitMapper extends SqlMapper{
    long countByExample(CoinBankWeekProfitExample example);

    int deleteByExample(CoinBankWeekProfitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankWeekProfit record);

    int insertSelective(CoinBankWeekProfit record);

    List<CoinBankWeekProfit> selectByExample(CoinBankWeekProfitExample example);

    CoinBankWeekProfit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankWeekProfit record, @Param("example") CoinBankWeekProfitExample example);

    int updateByExample(@Param("record") CoinBankWeekProfit record, @Param("example") CoinBankWeekProfitExample example);

    int updateByPrimaryKeySelective(CoinBankWeekProfit record);

    int updateByPrimaryKey(CoinBankWeekProfit record);
}