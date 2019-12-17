package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.CoinBankUserTransferFee;
import com.chainup.common.exchange.entity.CoinBankUserTransferFeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoinBankUserTransferFeeMapper extends SqlMapper {
    long countByExample(CoinBankUserTransferFeeExample example);

    int deleteByExample(CoinBankUserTransferFeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CoinBankUserTransferFee record);

    int insertSelective(CoinBankUserTransferFee record);

    List<CoinBankUserTransferFee> selectByExample(CoinBankUserTransferFeeExample example);

    CoinBankUserTransferFee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CoinBankUserTransferFee record, @Param("example") CoinBankUserTransferFeeExample example);

    int updateByExample(@Param("record") CoinBankUserTransferFee record, @Param("example") CoinBankUserTransferFeeExample example);

    int updateByPrimaryKeySelective(CoinBankUserTransferFee record);

    int updateByPrimaryKey(CoinBankUserTransferFee record);
}