package com.chainup.exchange.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.HistoryLogin;
import com.chainup.common.exchange.entity.HistoryLoginExample;

public interface HistoryLoginMapper extends SqlMapper{
    int countByExample(HistoryLoginExample example);

    int deleteByExample(HistoryLoginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HistoryLogin record);

    int insertSelective(HistoryLogin record);

    List<HistoryLogin> selectByExample(HistoryLoginExample example);

    HistoryLogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HistoryLogin record, @Param("example") HistoryLoginExample example);

    int updateByExample(@Param("record") HistoryLogin record, @Param("example") HistoryLoginExample example);

    int updateByPrimaryKeySelective(HistoryLogin record);

    int updateByPrimaryKey(HistoryLogin record);
    
    int countByCtime(Map map);
    
    List<HistoryLogin> listByPage(Map map);
}