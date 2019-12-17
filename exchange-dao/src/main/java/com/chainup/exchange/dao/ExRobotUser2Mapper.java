package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ExRobotUser2;
import com.chainup.common.exchange.entity.ExRobotUser2Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExRobotUser2Mapper extends SqlMapper {
    long countByExample(ExRobotUser2Example example);

    int deleteByExample(ExRobotUser2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExRobotUser2 record);

    int insertSelective(ExRobotUser2 record);

    List<ExRobotUser2> selectByExample(ExRobotUser2Example example);

    ExRobotUser2 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExRobotUser2 record, @Param("example") ExRobotUser2Example example);

    int updateByExample(@Param("record") ExRobotUser2 record, @Param("example") ExRobotUser2Example example);

    int updateByPrimaryKeySelective(ExRobotUser2 record);

    int updateByPrimaryKey(ExRobotUser2 record);
}