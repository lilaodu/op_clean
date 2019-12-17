package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExDeleteTime;
import com.chainup.common.exchange.entity.ExDeleteTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExDeleteTimeMapper extends SqlMapper {
    long countByExample(ExDeleteTimeExample example);

    int deleteByExample(ExDeleteTimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExDeleteTime record);

    int insertSelective(ExDeleteTime record);

    List<ExDeleteTime> selectByExample(ExDeleteTimeExample example);

    ExDeleteTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExDeleteTime record, @Param("example") ExDeleteTimeExample example);

    int updateByExample(@Param("record") ExDeleteTime record, @Param("example") ExDeleteTimeExample example);

    int updateByPrimaryKeySelective(ExDeleteTime record);

    int updateByPrimaryKey(ExDeleteTime record);
}