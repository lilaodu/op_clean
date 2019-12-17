package com.chainup.exchange.dao;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CryptoAddress;

public interface CryptoAddressMapper extends SqlMapper {
    int deleteByPrimaryKey(@Param("tableName")String tableName, Integer id);

    int insert(CryptoAddress record);

    int insertSelective(CryptoAddress record);

    CryptoAddress selectByPrimaryKey(@Param("tableName")String tableName, Integer id);

    int updateByPrimaryKeySelective(CryptoAddress record);

    int updateByPrimaryKey(CryptoAddress record);

    int updateByAddress(CryptoAddress record);

    CryptoAddress selectByAddress(@Param("tableName")String tableName, @Param("address")String address);

    CryptoAddress selectOneByIsUsed(@Param("tableName")String tableName, @Param("isUsed")Byte isUsed);
}