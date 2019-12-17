package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.TransactionWarningCryptoExample;
import com.chainup.common.stats.entity.TransactionWarningCrypto;

public interface TransactionWarningCryptoMapper extends SqlMapper {

    void insertRiskWarning(@Param("list")List<TransactionWarningCrypto> list);
    
    int countByExample(TransactionWarningCryptoExample example);

    int deleteByExample(TransactionWarningCryptoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TransactionWarningCrypto record);

    int insertSelective(TransactionWarningCrypto record);

    TransactionWarningCrypto selectOnlyOneByExample(TransactionWarningCryptoExample example);

    List<TransactionWarningCrypto> selectByExampleWithBLOBs(TransactionWarningCryptoExample example);

    List<TransactionWarningCrypto> selectByExample(TransactionWarningCryptoExample example);

    TransactionWarningCrypto selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TransactionWarningCrypto record, @Param("example") TransactionWarningCryptoExample example);

    int updateByExampleWithBLOBs(@Param("record") TransactionWarningCrypto record, @Param("example") TransactionWarningCryptoExample example);

    int updateByExample(@Param("record") TransactionWarningCrypto record, @Param("example") TransactionWarningCryptoExample example);

    int updateByPrimaryKeySelective(TransactionWarningCrypto record);

    int updateByPrimaryKeyWithBLOBs(TransactionWarningCrypto record);

    int updateByPrimaryKey(TransactionWarningCrypto record);

    TransactionWarningCrypto selectByCyId(Integer cy_id);
}