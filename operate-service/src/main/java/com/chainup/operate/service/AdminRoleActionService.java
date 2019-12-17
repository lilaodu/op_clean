package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.AdminRole;
import com.chainup.common.exchange.entity.AdminRoleAction;
import com.chainup.common.exchange.entity.AdminRoleActionExample;
import com.chainup.common.exchange.entity.AdminRoleExample;

/**
 * 后台管理角色权限服务接口类
 * 
 * @author lzg
 *
 */
public interface AdminRoleActionService {
    /**
     * 添加角色权限
     * 
     * @param AdminRoleAction
     */
    void add(AdminRoleAction AdminRoleAction);

    /**
     * 根据条件统计角色权限数
     * 
     * @param example
     * @return
     */
    Integer count(AdminRoleActionExample example);
    
    /**
     * 根据条件查询角色权限信息
     * 
     * @param example
     * @return
     */
    List<AdminRoleAction> findAll(AdminRoleActionExample example);
	
	/**
     * 根据用户Id 查找
     * 
     * @param id
     * @return
     */
    AdminRoleAction findById(Integer id);
    
    /**
     * 根据条件删除角色权限
     * 
     * @param example
     * @return
     */
    void delete(AdminRoleActionExample example);
    
    /**
     * 更新角色权限
     * 
     * @param AdminAction
     */
    void update(AdminRoleAction adminRoleAction);
}
