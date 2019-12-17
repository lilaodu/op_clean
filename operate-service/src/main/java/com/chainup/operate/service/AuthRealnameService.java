package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.AuthRealname;
import com.chainup.common.exchange.entity.AuthRealnameExample;

/**
 * 后台管理用户修改安全设置接口类
 * 
 * @author cxb
 *
 */
public interface AuthRealnameService {
    /**
     * 添加
     * 
     * @param User
     */
    void add(AuthRealname authRealname);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(AuthRealnameExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<AuthRealname> findAll(AuthRealnameExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    AuthRealname findById(Integer id);
    
    Map<Integer,AuthRealname> findId2AuthRealnameByUIDS(List<Integer> uids);
    
    int updateByPrimaryKey(AuthRealname authRealname);
    /**
     * 根据uId 查找
     * 
     * @param id
     * @return
     */
    AuthRealname findByUId(Integer uid);

    void updateStatus(AuthRealname authRealname,String userMessageContent);
    
    void updateStatusV2(AuthRealname authRealname);
    
    /**
     * 特殊处理韩国和中国一样走C2
     * @param authRealname
     */
    void updateStatusVZeniex(AuthRealname authRealname,String userMessageContent);

    /**
     *
     * 组装 authRealname 对象
     *
     * @param authRealname
     * @param authrealnameId
     * @param uid
     * @param authStatus
     * @param reason
     */
    void setAuthRealname(AuthRealname authRealname, Integer authrealnameId,Integer uid,Integer authStatus,String reason);
}
