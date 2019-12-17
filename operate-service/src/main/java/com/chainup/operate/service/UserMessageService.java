package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.UserMessage;
import com.chainup.common.exchange.entity.UserMessageExample;

/**
 * 用户消息服务接口类
 * 
 * @author lilp
 *
 */
public interface UserMessageService {
	 /**
     * 批量新增站内信发送用户消息
     * 
     * @param userMessageList
     */
    void batchAdd(List<UserMessage> userMessageList);
    
    /**
     * 新增用户消息
     * 
     * @param userMessage
     * @return id
     */
    Integer add(UserMessage userMessage);

    /**
     * 根据条件统计用户消息数量
     * 
     * @param example
     * @return
     */
    Integer count(UserMessageExample example);
    
    /**
     * 根据条件查询用户消息
     * 
     * @param example
     * @return
     */
    List<UserMessage> findAll(UserMessageExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    UserMessage findById(Integer id);
    
    /**
     * 根据Id 删除
     * 
     * @param id
     */
    void deleteById(Integer id);
    
    /**
     * 更新消息
     * 
     * @param userMessage
     */
    void update(UserMessage userMessage);

    /**
     *
     * 发送消息
     *
     * @param uid
     * @param messageCertificate
     */
    void sendMessage(Integer uid,String messageCertificate);
}
