package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.StationMessage;
import com.chainup.common.exchange.entity.StationMessageExample;

/**
 * 站内信服务接口类
 * 
 * @author lilp
 *
 */
public interface StationMessageService {
    /**
     * 新增站内信
     * 
     * @param stationMessage
     * @return id
     */
    Integer add(StationMessage stationMessage);

    /**
     * 根据条件统计站内信数量
     * 
     * @param example
     * @return
     */
    Integer count(StationMessageExample example);
    
    /**
     * 根据条件查询站内信列表
     * 
     * @param example
     * @return
     */
    List<StationMessage> findAll(StationMessageExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    StationMessage findById(Integer id);
    
    /**
     * 根据Id 删除
     * 
     * @param id
     */
    void deleteById(Integer id);
    
    /**
     * 更新站内信
     * 
     * @param stationMessage
     */
    void update(StationMessage stationMessage);
}
