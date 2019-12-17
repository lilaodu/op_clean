package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.exchange.entity.AuthCertificate;
import com.chainup.common.exchange.entity.AuthCertificateExample;
import com.chainup.common.exchange.entity.AuthCertificateWithBLOBs;
import com.chainup.common.exchange.entity.AuthRealname;

/**
 * 后台管理用户修改安全设置接口类
 * 
 * @author cxb
 *
 */
public interface AuthCertificateService {
    /**
     * 添加
     * 
     * @param User
     */
    void add(AuthCertificateWithBLOBs record);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(AuthCertificateExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<AuthCertificate> findAll(AuthCertificateExample example);
    
    List<AuthCertificateWithBLOBs> findAllWithBlob(AuthCertificateExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    AuthCertificate findById(Integer id);
    
    Map<Integer,AuthCertificate> findId2AuthCertificateByUIDS(List<Integer> uids);
    
    int updateByPrimaryKey(AuthCertificateWithBLOBs record);
    
    int updateByExampleSelective(@Param("record") AuthCertificateWithBLOBs record, @Param("example") AuthCertificateExample example);
    /**
     * 根据uId 查找
     * 
     * @param id
     * @return
     */
    AuthCertificateWithBLOBs findByUId(Integer uid);
    void updateStatus(AuthCertificateWithBLOBs authCertificate,String userMessageContent);

    void updateStatusV2(AuthCertificateWithBLOBs authCertificate);

    /**
     *
     * 组装 authCertificate 对象
     *
     * @param authCertificate
     * @param authCertificateId
     * @param uid
     * @param authStatus
     * @param reason
     */
    void setAuthCertificate(AuthCertificateWithBLOBs authCertificate, Integer authCertificateId,Integer uid,Integer authStatus,String reason);
}
