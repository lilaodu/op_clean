package com.chainup.operate.service;

import com.chainup.common.exchange.entity.User;
import com.chainup.common.exchange.entity.UserLoginFail;

/**
 * 用户登录错误统计接口类
 * 
 * @author cxb
 *
 */
public interface UserLoginFailService {
    /**
     * 更新用户登录错误统计
     * 
     * @param User
     */
	UserLoginFail add(String username);

    /**
     * 查找用户登录错误统计
     * 
     * @param example
     * @return
     */
    UserLoginFail find(String username);
    
    /**
     * 删除用户登录错误统计
     * 
     * @param example
     * @return
     */
    void del(String username);
    
    boolean hasLocked(User user);
    void unlock(User user);
    
    //退出清除session
    void removeSession(String sessionId);
}
