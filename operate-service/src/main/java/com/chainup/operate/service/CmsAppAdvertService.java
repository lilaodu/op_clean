package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.CmsAppAdvert;
import com.chainup.common.exchange.entity.CmsAppAdvertExample;

/**
 * 首页轮播图设置相关服务接口类
 * 
 * @author lilp
 *
 */
public interface CmsAppAdvertService {
    /**
     * 添加
     * 
     * @param cmsAdvert
     * @return
     */
    Integer add(CmsAppAdvert cmsAdvert);

    /**
     * 根据条件查询列表
     * 
     * @param example
     * @return
     */
    List<CmsAppAdvert> findAll(CmsAppAdvertExample example);
    
    /**
     * 根据条件统计总数量
     * 
     * @param example
     * @return
     */
    Integer count(CmsAppAdvertExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    CmsAppAdvert findById(Integer id);
    
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
    Integer update(CmsAppAdvert cmsAdvert);
}
