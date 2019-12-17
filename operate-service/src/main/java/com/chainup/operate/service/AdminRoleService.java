package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.AdminAction;
import com.chainup.common.exchange.entity.AdminActionExample;
import com.chainup.common.exchange.entity.AdminRole;
import com.chainup.common.exchange.entity.AdminRoleExample;

/**
 * 后台管理用户角色服务接口类
 * 
 * @author lzg
 *
 */
public interface AdminRoleService {
    /**
     * 添加角色
     * 
     * @param AdminRole
     */
    Integer add(AdminRole AdminRole);

    /**
     * 根据条件统计角色数
     * 
     * @param example
     * @return
     */
    Integer count(AdminRoleExample example);
    
    /**
     * 根据条件查询角色信息
     * 
     * @param example
     * @return
     */
    List<AdminRole> findAll(AdminRoleExample example);
	
	/**
     * 根据用户Id 查找
     * 
     * @param id
     * @return
     */
    AdminRole findById(Integer id);
    
    /**
     * 根据条件删除角色
     * 
     * @param example
     * @return
     */
    void delete(AdminRoleExample example);
    
    /**
     * 更新角色
     * 
     * @param AdminAction
     */
    void update(AdminRole adminRole);
}
