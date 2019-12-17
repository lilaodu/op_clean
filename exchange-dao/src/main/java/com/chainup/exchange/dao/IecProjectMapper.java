package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.IecProject;
import com.chainup.common.exchange.entity.IecProjectExample;

public interface IecProjectMapper extends SqlMapper{
    long countByExample(IecProjectExample example);

    int deleteByExample(IecProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IecProject record);

    int insertSelective(IecProject record);

    List<IecProject> selectByExample(IecProjectExample example);

    IecProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IecProject record, @Param("example") IecProjectExample example);

    int updateByExample(@Param("record") IecProject record, @Param("example") IecProjectExample example);

    int updateByPrimaryKeySelective(IecProject record);

    int updateByPrimaryKey(IecProject record);
}