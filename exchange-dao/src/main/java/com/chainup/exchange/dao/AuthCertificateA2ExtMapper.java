package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AuthCertificateA2Ext;
import com.chainup.common.exchange.entity.AuthCertificateA2ExtExample;

public interface AuthCertificateA2ExtMapper extends SqlMapper{
    int countByExample(AuthCertificateA2ExtExample example);

    int deleteByExample(AuthCertificateA2ExtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthCertificateA2Ext record);

    int insertSelective(AuthCertificateA2Ext record);

    List<AuthCertificateA2Ext> selectByExampleWithBLOBs(AuthCertificateA2ExtExample example);

    AuthCertificateA2Ext selectOnlyOneByExample(AuthCertificateA2ExtExample example);

    List<AuthCertificateA2Ext> selectByExample(AuthCertificateA2ExtExample example);

    AuthCertificateA2Ext selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthCertificateA2Ext record, @Param("example") AuthCertificateA2ExtExample example);

    int updateByExampleWithBLOBs(@Param("record") AuthCertificateA2Ext record, @Param("example") AuthCertificateA2ExtExample example);

    int updateByExample(@Param("record") AuthCertificateA2Ext record, @Param("example") AuthCertificateA2ExtExample example);

    int updateByPrimaryKeySelective(AuthCertificateA2Ext record);

    int updateByPrimaryKeyWithBLOBs(AuthCertificateA2Ext record);

    int updateByPrimaryKey(AuthCertificateA2Ext record);
}