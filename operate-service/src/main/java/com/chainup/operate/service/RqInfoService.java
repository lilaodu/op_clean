package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.RqInfo;
import com.chainup.common.exchange.entity.RqInfoExample;

/**
 * 问题工单服务接口类
 * 
 * @author lilp
 *
 */
public interface RqInfoService {
    /**
     * 添加问题工单
     * 
     * @param rqInfo
     * @return
     */
    Integer add(RqInfo rqInfo);

    /**
     * 根据条件统计问题工单数量
     * 
     * @param example
     * @return
     */
    Integer count(RqInfoExample example);
    
    /**
     * 根据条件查询问题工单列表
     * 
     * @param example
     * @return
     */
    List<RqInfo> findAll(RqInfoExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    RqInfo findById(Integer id);
    
    /**
     * 根据Id 删除
     * 
     * @param id
     * @return
     */
    void deleteById(Integer id);
    
    /**
     * 更新问题工单
     * 
     * @param rqInfo
     */
    void update(RqInfo rqInfo);
}
