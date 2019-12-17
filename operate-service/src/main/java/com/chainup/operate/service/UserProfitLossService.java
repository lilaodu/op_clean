package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.stats.entity.UserProfitLoss;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface UserProfitLossService {
		
	List<UserProfitLoss> getUserProfitLossList(UserProfitLoss userProfitLoss);
	
	int getUserProfitLossCount();
}
