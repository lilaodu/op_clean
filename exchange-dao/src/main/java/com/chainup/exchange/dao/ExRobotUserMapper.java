package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExRobotUser;
import com.chainup.common.exchange.entity.ExRobotUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExRobotUserMapper extends SqlMapper{
    long countByExample(ExRobotUserExample example);

    int deleteByExample(ExRobotUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExRobotUser record);

    int insertSelective(ExRobotUser record);

    List<ExRobotUser> selectByExample(ExRobotUserExample example);

    ExRobotUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExRobotUser record, @Param("example") ExRobotUserExample example);

    int updateByExample(@Param("record") ExRobotUser record, @Param("example") ExRobotUserExample example);

    int updateByPrimaryKeySelective(ExRobotUser record);

    int updateByPrimaryKey(ExRobotUser record);
}