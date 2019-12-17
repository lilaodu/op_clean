package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.AdminOptLog;
import com.chainup.common.exchange.entity.AdminOptLogExample;

/**
 * 后台操作日志管理接口类
 * 
 * @author lzg
 *
 */
public interface AdminOptLogService {
	//操作日志类型
	public static Integer ADMIN_LOG_TYPE_ADD = 1;		//添加
	public static Integer ADMIN_LOG_TYPE_DEL = 2;		//删除
	public static Integer ADMIN_LOG_TYPE_EDIT = 3;		//修改
	public static Integer ADMIN_LOG_TYPE_LOGIN = 4;		//登录
	
    /**
     * 添加日志
     * 
     * @param uid 用户ID
     * @param table 操作表名
     * @param type 操作类型
     * @param ip IP地址
     * @param des 操作说明
     */
    Integer add(Integer uid,String table,Integer type,String ip,String des);

    /**
     * 根据条件查询日志
     * 
     * @param example
     * @return
     */
    Integer count(AdminOptLogExample example);
    
    /**
     * 根据条件查询日志列表
     * 
     * @param example
     * @return
     */
    List<AdminOptLog> findAll(AdminOptLogExample example);
    
    /**
     * 根据条件删除日志
     * 
     * @param example
     * @return
     */
    void delete(AdminOptLogExample example);
}
