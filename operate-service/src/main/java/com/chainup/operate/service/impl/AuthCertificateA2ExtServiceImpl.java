package com.chainup.operate.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.AuthCertificateA2ExtMapper;
import com.chainup.exchange.dao.AuthCertificateA2Mapper;
import com.chainup.common.exchange.entity.AuthCertificateA2;
import com.chainup.common.exchange.entity.AuthCertificateA2Example;
import com.chainup.common.exchange.entity.AuthCertificateA2Ext;
import com.chainup.common.exchange.entity.AuthCertificateA2ExtExample;
import com.chainup.common.exchange.entity.AuthCertificateA2WithBLOBs;
import com.chainup.common.exchange.entity.AuthCertificateExample;
import com.chainup.common.exchange.entity.AuthCertificateWithBLOBs;
import com.chainup.operate.service.AuthCertificateA2ExtService;
import com.chainup.operate.service.AuthCertificateA2Service;
import com.chainup.operate.service.AuthRealnameService;
import com.chainup.operate.service.UserService;
import com.chainup.common.util.ReflectionUtils;

@Service
public class AuthCertificateA2ExtServiceImpl implements AuthCertificateA2ExtService{

    @Autowired
    private AuthCertificateA2ExtMapper authCertificateA2ExtMapper;

    @Override
    public List<AuthCertificateA2Ext> findByAid(AuthCertificateA2ExtExample example) {
        // TODO Auto-generated method stub
        List<AuthCertificateA2Ext> acA2List = authCertificateA2ExtMapper.selectByExampleWithBLOBs(example);
        if(acA2List!=null && acA2List.size()>0){
            for(AuthCertificateA2Ext af:acA2List){
                af.setExtPh(new String(af.getExtPhoto()));
            }
        }
        ReflectionUtils.escapeHtml(acA2List);
        return acA2List;
    }
    
}