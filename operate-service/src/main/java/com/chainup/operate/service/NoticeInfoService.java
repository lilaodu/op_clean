package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.NoticeInfo;
import com.chainup.common.exchange.entity.NoticeInfoExample;

/**
 * 公告服务接口类
 * 
 * @author lilp
 *
 */
public interface NoticeInfoService {
    /**
     * 添加公告
     * 
     * @param noticeInfo
     */
    void add(NoticeInfo noticeInfo);

    /**
     * 根据条件统计公告信息数量
     * 
     * @param example
     * @return
     */
    Integer count(NoticeInfoExample example);
    
    /**
     * 根据条件查询公告信息列表
     * 
     * @param example
     * @return
     */
    List<NoticeInfo> findAll(NoticeInfoExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    NoticeInfo findById(Integer id);
    
    /**
     * 根据Id 删除
     * 
     * @param id
     */
    void deleteById(Integer id);
    
    /**
     * 根据不同条件删除
     * 
     * @param example
     */
    void deleteByExample(NoticeInfoExample example);
    
    /**
     * 更新公告信息
     * 
     * @param noticeInfo
     */
    void update(NoticeInfo noticeInfo);
}
