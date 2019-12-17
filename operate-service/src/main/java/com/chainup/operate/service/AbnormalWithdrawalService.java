package com.chainup.operate.service;

import com.chainup.common.stats.entity.AbnormalWithdrawal;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface AbnormalWithdrawalService {
	
	AbnormalWithdrawal selectAbnormalWithdrawal();
	
	int insertAbnormalWithdrawal(AbnormalWithdrawal abnormalWithdrawal);
	
	int updateAbnormalWithdrawal(AbnormalWithdrawal abnormalWithdrawal);
}
