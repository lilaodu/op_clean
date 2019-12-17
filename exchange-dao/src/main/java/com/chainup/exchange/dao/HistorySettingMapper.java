package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.HistorySetting;
import com.chainup.common.exchange.entity.HistorySettingExample;

public interface HistorySettingMapper extends SqlMapper {
    int countByExample(HistorySettingExample example);

    int deleteByExample(HistorySettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HistorySetting record);

    int insertSelective(HistorySetting record);

    HistorySetting selectOnlyOneByExample(HistorySettingExample example);

    List<HistorySetting> selectByExample(HistorySettingExample example);

    HistorySetting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HistorySetting record, @Param("example") HistorySettingExample example);

    int updateByExample(@Param("record") HistorySetting record, @Param("example") HistorySettingExample example);

    int updateByPrimaryKeySelective(HistorySetting record);

    int updateByPrimaryKey(HistorySetting record);
}