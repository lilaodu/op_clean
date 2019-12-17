package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.UserWithdrawAddr;
import com.chainup.common.exchange.entity.UserWithdrawAddrExample;

/**
 * 后台管理用户服务接口类
 * 
 * @author zhongjingyun
 *
 */
public interface UserWithdrawAddrService {
    /**
     * 添加
     * 
     * @param UserWithdrawAddr
     */
    void add(UserWithdrawAddr userWithdrawAddr);

    /**
     * 根据条件统计记录数
     * 
     * @param example
     * @return
     */
    Integer count(UserWithdrawAddrExample example);
    
    /**
     * 根据条件查询信息
     * 
     * @param example
     * @return
     */
    List<UserWithdrawAddr> findAll(UserWithdrawAddrExample example);
	
	/**
     * 根据Id 查找
     * 
     * @param id
     * @return
     */
    UserWithdrawAddr findById(Integer id);

    void deleteById(Integer id);
    
    boolean verifyId(Integer id,Integer uid);
    
    void updateById(UserWithdrawAddr userWithdrawAddr);
}
