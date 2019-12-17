package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.StationMessage;
import com.chainup.common.exchange.entity.StationMessageExample;

public interface StationMessageMapper extends SqlMapper{
    int countByExample(StationMessageExample example);

    int deleteByExample(StationMessageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StationMessage record);

    int insertSelective(StationMessage record);

    List<StationMessage> selectByExampleWithBLOBs(StationMessageExample example);

    List<StationMessage> selectByExample(StationMessageExample example);

    StationMessage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StationMessage record, @Param("example") StationMessageExample example);

    int updateByExampleWithBLOBs(@Param("record") StationMessage record, @Param("example") StationMessageExample example);

    int updateByExample(@Param("record") StationMessage record, @Param("example") StationMessageExample example);

    int updateByPrimaryKeySelective(StationMessage record);

    int updateByPrimaryKeyWithBLOBs(StationMessage record);

    int updateByPrimaryKey(StationMessage record);
}