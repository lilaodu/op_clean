package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.AdminRole;
import com.chainup.common.exchange.entity.AdminRoleExample;
import com.chainup.common.exchange.entity.AdminRoleUser;
import com.chainup.common.exchange.entity.AdminRoleUserExample;
import com.chainup.common.exchange.entity.AdminUserExample;

/**
 * 后台管理角色用户接口类
 * 
 * @author lzg
 *
 */
public interface AdminRoleUserService {
    /**
     * 添加角色用户
     * 
     * @param AdminRoleUser
     */
    void add(AdminRoleUser AdminRoleUser);

    /**
     * 根据条件统计角色用户数
     * 
     * @param example
     * @return
     */
    Integer count(AdminRoleUserExample example);
    
    /**
     * 根据条件查询角色用户
     * 
     * @param example
     * @return
     */
    List<AdminRoleUser> findAll(AdminRoleUserExample example);
	
	/**
     * 根据用户Id 查找
     * 
     * @param id
     * @return
     */
    AdminRoleUser findById(Integer id);
    
    /**
     * 根据条件删除角色用户
     * 
     * @param example
     * @return
     */
    void delete(AdminRoleUserExample example);
    
    /**
     * 更新角色用户
     * 
     * @param AdminAction
     */
    void update(AdminRoleUser adminRoleUser);
}
