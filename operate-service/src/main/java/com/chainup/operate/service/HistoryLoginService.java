package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.HistoryLogin;
import com.chainup.common.exchange.entity.HistoryLoginExample;
import com.chainup.common.exchange.entity.User;

/**
 * 后台管理用户登录历史接口类
 * 
 * @author cxb
 *
 */
public interface HistoryLoginService {
    /**
     * 添加
     * 
     * @param User
     */
    void add(HistoryLogin historyLogin);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(HistoryLoginExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<HistoryLogin> findAll(HistoryLoginExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    HistoryLogin findById(Integer id);
    
    int countByCtime(String lgtimeStart,String lgtimeEnd);
    
    List<HistoryLogin> listByPage(Integer start,Integer pageSize,String ctimeStart,String ctimeEnd);
}
