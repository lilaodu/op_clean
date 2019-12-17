package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.UserWithdrawAddr;
import com.chainup.common.exchange.entity.UserWithdrawAddrExample;

public interface UserWithdrawAddrMapper  extends SqlMapper {
    int countByExample(UserWithdrawAddrExample example);

    int deleteByExample(UserWithdrawAddrExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWithdrawAddr record);

    int insertSelective(UserWithdrawAddr record);

    UserWithdrawAddr selectOnlyOneByExample(UserWithdrawAddrExample example);

    List<UserWithdrawAddr> selectByExample(UserWithdrawAddrExample example);

    UserWithdrawAddr selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWithdrawAddr record, @Param("example") UserWithdrawAddrExample example);

    int updateByExample(@Param("record") UserWithdrawAddr record, @Param("example") UserWithdrawAddrExample example);

    int updateByPrimaryKeySelective(UserWithdrawAddr record);

    int updateByPrimaryKey(UserWithdrawAddr record);
}