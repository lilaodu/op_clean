package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chainup.common.exchange.entity.AuthCertificateA2;
import com.chainup.common.exchange.entity.AuthCertificateA2Example;
import com.chainup.common.exchange.entity.AuthCertificateA2WithBLOBs;

/**
 * 后台管理用户修改安全设置接口类
 * 
 * @author cxb
 *
 */
public interface AuthCertificateA2Service {
    /**
     * 添加
     * 
     * @param User
     */
    void add(AuthCertificateA2WithBLOBs record);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(AuthCertificateA2Example example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<AuthCertificateA2WithBLOBs> findAllWithBlob(AuthCertificateA2Example example);
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<AuthCertificateA2> findAll(AuthCertificateA2Example example);
    
    /**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    AuthCertificateA2 findById(Integer id);
    int updateByExampleSelective(@Param("record") AuthCertificateA2WithBLOBs record, @Param("example") AuthCertificateA2Example example);
    Map<Integer,AuthCertificateA2> findId2AuthCertificateA2ByUIDS(List<Integer> uids);
    AuthCertificateA2WithBLOBs findByUId(Integer uid);
    int updateByPrimaryKeySelective(AuthCertificateA2WithBLOBs record,String userMessageContent);
}
