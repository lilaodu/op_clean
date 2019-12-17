package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AuthCertificateA2;
import com.chainup.common.exchange.entity.AuthCertificateA2Example;
import com.chainup.common.exchange.entity.AuthCertificateA2WithBLOBs;

public interface AuthCertificateA2Mapper extends SqlMapper{
    int countByExample(AuthCertificateA2Example example);

    int deleteByExample(AuthCertificateA2Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthCertificateA2WithBLOBs record);

    int insertSelective(AuthCertificateA2WithBLOBs record);

    List<AuthCertificateA2WithBLOBs> selectByExampleWithBLOBs(AuthCertificateA2Example example);

    AuthCertificateA2WithBLOBs selectOnlyOneByExample(AuthCertificateA2Example example);

    List<AuthCertificateA2> selectByExample(AuthCertificateA2Example example);

    AuthCertificateA2WithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthCertificateA2WithBLOBs record, @Param("example") AuthCertificateA2Example example);

    int updateByExampleWithBLOBs(@Param("record") AuthCertificateA2WithBLOBs record, @Param("example") AuthCertificateA2Example example);

    int updateByExample(@Param("record") AuthCertificateA2 record, @Param("example") AuthCertificateA2Example example);

    int updateByPrimaryKeySelective(AuthCertificateA2WithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AuthCertificateA2WithBLOBs record);

    int updateByPrimaryKey(AuthCertificateA2 record);
}