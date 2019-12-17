package com.chainup.operate.service;

import java.util.List;
import java.util.Map;

import com.chainup.common.exchange.entity.UserExt;
import com.chainup.common.exchange.entity.UserExtExample;

/**
 * 后台管理用户服务接口类
 * 
 * @author cxb
 *
 */
public interface UserExtService {
    /**
     * 添加
     * 
     * @param User
     */
    void add(UserExt User);

    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<UserExt> findAll(UserExtExample example);
    
    /**
     * 根据uid批量查找
     * 
     * @param example
     * @return
     */
    Map<Integer,UserExt> findId2UserExtByUIDS(List<Integer> uIDS);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    UserExt findById(Integer id);
}
