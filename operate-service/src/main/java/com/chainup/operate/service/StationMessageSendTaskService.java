package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.StationMessageSendTask;
import com.chainup.common.exchange.entity.StationMessageSendTaskExample;

/**
 * 站内信发送任务记录服务接口类
 * 
 * @author lilp
 *
 */
public interface StationMessageSendTaskService {
    /**
     * 新增站内信发送任务记录
     * 
     * @param stationMessageSendTask
     */
    void add(StationMessageSendTask stationMessageSendTask);
    
    /**
     * 批量新增站内信发送任务记录
     * 
     * @param stationMessageSendTaskList
     */
    void batchAdd(List<StationMessageSendTask> stationMessageSendTaskList);

    /**
     * 根据条件统计站内信发送任务记录数量
     * 
     * @param example
     * @return
     */
    Integer count(StationMessageSendTaskExample example);
    
    /**
     * 根据条件查询站内信发送任务记录
     * 
     * @param example
     * @return
     */
    List<StationMessageSendTask> findAll(StationMessageSendTaskExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    StationMessageSendTask findById(Integer id);
    
    /**
     * 根据Id 删除
     * 
     * @param id
     */
    void deleteById(Integer id);
    
    /**
     * 更新站内信发送任务记录
     * 
     * @param stationMessageSendTask
     */
    void update(StationMessageSendTask stationMessageSendTask);
    
    /**
     * 批量更新发送任务记录状态
     * 
     * @param idList
     * @param sendStatus
     */
    void batchUpdateStatusById(List<Integer> idList, Byte sendStatus);
}
