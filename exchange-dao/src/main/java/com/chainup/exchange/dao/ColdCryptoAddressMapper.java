package com.chainup.exchange.dao;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.ColdCryptoAddress;
import com.chainup.common.exchange.entity.ColdCryptoAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColdCryptoAddressMapper extends SqlMapper{
    int countByExample(ColdCryptoAddressExample example);

    int deleteByExample(ColdCryptoAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColdCryptoAddress record);

    int insertSelective(ColdCryptoAddress record);

    ColdCryptoAddress selectOnlyOneByExample(ColdCryptoAddressExample example);

    List<ColdCryptoAddress> selectByExample(ColdCryptoAddressExample example);

    ColdCryptoAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColdCryptoAddress record, @Param("example") ColdCryptoAddressExample example);

    int updateByExample(@Param("record") ColdCryptoAddress record, @Param("example") ColdCryptoAddressExample example);

    int updateByPrimaryKeySelective(ColdCryptoAddress record);

    int updateByPrimaryKey(ColdCryptoAddress record);
}