package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.AdminAction;
import com.chainup.common.exchange.entity.AdminActionExample;

/**
 * 后台管理用户权限服务接口类
 * 
 * @author lzg
 *
 */
public interface AdminActionService {
    /**
     * 添加权限
     * 
     * @param AdminAction
     */
    void add(AdminAction AdminAction);

    /**
     * 根据条件统计权限记录数
     * 
     * @param example
     * @return
     */
    Integer count(AdminActionExample example);
    
    /**
     * 根据条件查询权限信息
     * 
     * @param example
     * @return
     */
    List<AdminAction> findAll(AdminActionExample example);
	
	/**
     * 根据权限Id 查找
     * 
     * @param id
     * @return
     */
    AdminAction findById(Integer id);
    
    /**
     * 根据条件删除权限
     * 
     * @param example
     * @return
     */
    void delete(AdminActionExample example);
    
    /**
     * 更新权限
     * 
     * @param AdminAction
     */
    void update(AdminAction AdminAction);
}
