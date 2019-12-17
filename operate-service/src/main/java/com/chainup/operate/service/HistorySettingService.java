package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.HistorySetting;
import com.chainup.common.exchange.entity.HistorySettingExample;

/**
 * 后台管理用户修改安全设置接口类
 * 
 * @author cxb
 *
 */
public interface HistorySettingService {
    /**
     * 添加
     * 
     * @param User
     */
    void add(HistorySetting historySetting);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(HistorySettingExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<HistorySetting> findAll(HistorySettingExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    HistorySetting findById(Integer id);
}
