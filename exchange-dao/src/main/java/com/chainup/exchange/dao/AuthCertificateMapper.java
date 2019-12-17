package com.chainup.exchange.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.AuthCertificate;
import com.chainup.common.exchange.entity.AuthCertificateExample;
import com.chainup.common.exchange.entity.AuthCertificateWithBLOBs;

public interface AuthCertificateMapper extends SqlMapper{
    int countByExample(AuthCertificateExample example);

    int deleteByExample(AuthCertificateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthCertificateWithBLOBs record);

    int insertSelective(AuthCertificateWithBLOBs record);

    List<AuthCertificateWithBLOBs> selectByExampleWithBLOBs(AuthCertificateExample example);

    AuthCertificateWithBLOBs selectOnlyOneByExample(AuthCertificateExample example);

    List<AuthCertificate> selectByExample(AuthCertificateExample example);

    AuthCertificateWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthCertificateWithBLOBs record, @Param("example") AuthCertificateExample example);

    int updateByExampleWithBLOBs(@Param("record") AuthCertificateWithBLOBs record, @Param("example") AuthCertificateExample example);

    int updateByExample(@Param("record") AuthCertificate record, @Param("example") AuthCertificateExample example);

    int updateByPrimaryKeySelective(AuthCertificateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AuthCertificateWithBLOBs record);

    int updateByPrimaryKey(AuthCertificate record);
}