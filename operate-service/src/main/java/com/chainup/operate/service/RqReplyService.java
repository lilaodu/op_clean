package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.RqReply;
import com.chainup.common.exchange.entity.RqReplyExample;

/**
 * 问题工单回复服务接口类
 * 
 * @author lilp
 *
 */
public interface RqReplyService {
    /**
     * 添加问题工单 回复记录
     * 
     * @param rqReply
     * @return
     */
    Integer add(RqReply rqReply);

    /**
     * 根据条件统计问题工单回复记录数量
     * 
     * @param example
     * @return
     */
    Integer count(RqReplyExample example);
    
    /**
     * 根据条件查询问题回复记录列表
     * 
     * @param example
     * @return
     */
    List<RqReply> findAll(RqReplyExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    RqReply findById(Integer id);
    
    /**
     * 根据Id 删除问题工单回复记录
     * 
     * @param id
     * @return
     */
    void deleteById(Integer id);
    
    /**
     * 更新问题工单回复信息
     * 
     * @param rqReply
     */
    void update(RqReply rqReply);
}
