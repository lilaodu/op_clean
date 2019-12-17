package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.RqInfo;
import com.chainup.common.exchange.entity.RqInfoExample;

public interface RqInfoMapper extends SqlMapper{
    int countByExample(RqInfoExample example);

    int deleteByExample(RqInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RqInfo record);

    int insertSelective(RqInfo record);

    List<RqInfo> selectByExample(RqInfoExample example);

    RqInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RqInfo record, @Param("example") RqInfoExample example);

    int updateByExample(@Param("record") RqInfo record, @Param("example") RqInfoExample example);

    int updateByPrimaryKeySelective(RqInfo record);

    int updateByPrimaryKey(RqInfo record);
}