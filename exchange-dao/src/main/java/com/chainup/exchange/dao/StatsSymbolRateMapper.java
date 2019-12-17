package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.stats.entity.StatsSymbolRate;
import com.chainup.common.stats.entity.StatsSymbolRateExample;

public interface StatsSymbolRateMapper extends SqlMapper{
    int countByExample(StatsSymbolRateExample example);

    int deleteByExample(StatsSymbolRateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StatsSymbolRate record);

    int insertSelective(StatsSymbolRate record);

    List<StatsSymbolRate> selectByExample(StatsSymbolRateExample example);

    StatsSymbolRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StatsSymbolRate record, @Param("example") StatsSymbolRateExample example);

    int updateByExample(@Param("record") StatsSymbolRate record, @Param("example") StatsSymbolRateExample example);

    int updateByPrimaryKeySelective(StatsSymbolRate record);

    int updateByPrimaryKey(StatsSymbolRate record);
}