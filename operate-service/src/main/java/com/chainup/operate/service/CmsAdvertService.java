package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.CmsAdvert;
import com.chainup.common.exchange.entity.CmsAdvertExample;

/**
 * 首页轮播图设置相关服务接口类
 * 
 * @author lilp
 *
 */
public interface CmsAdvertService {
    /**
     * 添加
     * 
     * @param cmsAdvert
     * @return
     */
    Integer add(CmsAdvert cmsAdvert);

    /**
     * 根据条件查询列表
     * 
     * @param example
     * @return
     */
    List<CmsAdvert> findAll(CmsAdvertExample example);
    
    /**
     * 根据条件统计总数量
     * 
     * @param example
     * @return
     */
    Integer count(CmsAdvertExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    CmsAdvert findById(Integer id);
    
    /**
     * 根据id删除
     * 
     * @param id
     * @return
     */
    Integer deleteById(Integer id);
    
    /**
     * 编辑保存
     * 
     * @param cmsAdvert
     * @return
     */
    Integer update(CmsAdvert cmsAdvert);
}
