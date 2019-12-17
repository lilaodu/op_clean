package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.StationMessageSendTask;
import com.chainup.common.exchange.entity.StationMessageSendTaskExample;

public interface StationMessageSendTaskMapper extends SqlMapper{
    int countByExample(StationMessageSendTaskExample example);

    int deleteByExample(StationMessageSendTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StationMessageSendTask record);

    int insertSelective(StationMessageSendTask record);
    
    int insertBatch(List<StationMessageSendTask> list);

    List<StationMessageSendTask> selectByExample(StationMessageSendTaskExample example);

    StationMessageSendTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StationMessageSendTask record, @Param("example") StationMessageSendTaskExample example);

    int updateByExample(@Param("record") StationMessageSendTask record, @Param("example") StationMessageSendTaskExample example);

    int updateByPrimaryKeySelective(StationMessageSendTask record);

    int updateByPrimaryKey(StationMessageSendTask record);
    
    int updateStatusByPrimaryKey(@Param("list") List<Integer> list, @Param("sendStatus") Byte sendStatus);
}