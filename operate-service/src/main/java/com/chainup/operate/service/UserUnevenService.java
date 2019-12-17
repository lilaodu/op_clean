package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.stats.entity.UserUneven;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface UserUnevenService {
		
    List<UserUneven> getUserUnevenList(UserUneven userUneven);
	
	int getUserUnevenCount();
}
