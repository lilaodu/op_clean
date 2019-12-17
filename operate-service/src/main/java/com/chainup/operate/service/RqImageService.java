package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.RqImage;
import com.chainup.common.exchange.entity.RqImageExample;

/**
 * 问题工单提交/回复所需要上传的图片附件服务接口类
 * 
 * @author lilp
 *
 */
public interface RqImageService {
    /**
     * 添加问题工单图片附件
     * 
     * @param rqImage
     * @return
     */
    Integer add(RqImage rqImage);

    /**
     * 根据条件查询问题附件列表
     * 
     * @param example
     * @return
     */
    List<RqImage> findAll(RqImageExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    RqImage findById(Integer id);
}
