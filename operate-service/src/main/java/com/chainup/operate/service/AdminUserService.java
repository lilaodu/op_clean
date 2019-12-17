package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.AdminRoleUser;
import com.chainup.common.exchange.entity.AdminRoleUserExample;
import com.chainup.common.exchange.entity.AdminUser;
import com.chainup.common.exchange.entity.AdminUserExample;

/**
 * 后台管理用户管理服务接口类
 * 
 * @author lilp
 *
 */
public interface AdminUserService {
    /**
     * 添加用户
     * 
     * @param adminUser
     */
    void add(AdminUser adminUser);

    /**
     * 根据条件统计用户记录数
     * 
     * @param example
     * @return
     */
    Integer count(AdminUserExample example);
    
    /**
     * 根据条件查询用户信息
     * 
     * @param example
     * @return
     */
    List<AdminUser> findAll(AdminUserExample example);
	
	/**
     * 根据用户Id 查找
     * 
     * @param id
     * @return
     */
    AdminUser findById(Integer id);
    
    /**
     * 根据用户名-手机号码 查找是否存在该用户，用于校验
     * 
     * @param mobileNumber
     * @return
     */
    AdminUser findByMobileNumber(String mobileNumber);
    
    /**
     * 根据条件删除用户
     * 
     * @param example
     * @return
     */
    void delete(AdminUserExample example);
    
    /**
     * 更新用户
     * 
     * @param AdminAction
     */
    void update(AdminUser adminUser);
}
