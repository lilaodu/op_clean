package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.UserDepositAddr;
import com.chainup.common.exchange.entity.UserDepositAddrExample;

public interface UserDepositAddrMapper  extends SqlMapper {
    int countByExample(UserDepositAddrExample example);

    int deleteByExample(UserDepositAddrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDepositAddr record);

    int insertSelective(UserDepositAddr record);

    UserDepositAddr selectOnlyOneByExample(UserDepositAddrExample example);

    List<UserDepositAddr> selectByExample(UserDepositAddrExample example);

    UserDepositAddr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDepositAddr record, @Param("example") UserDepositAddrExample example);

    int updateByExample(@Param("record") UserDepositAddr record, @Param("example") UserDepositAddrExample example);

    int updateByPrimaryKeySelective(UserDepositAddr record);

    int updateByPrimaryKey(UserDepositAddr record);
}