package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.AuthCertificateA2Ext;
import com.chainup.common.exchange.entity.AuthCertificateA2ExtExample;

/**
 * 
 * 
 * @author cxb
 *
 */
public interface AuthCertificateA2ExtService {
    
    List<AuthCertificateA2Ext> findByAid(AuthCertificateA2ExtExample example);
   
}
