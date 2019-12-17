package com.chainup.operate.service;

import com.chainup.common.stats.entity.AbnormalProperty;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface AbnormalPropertyService {
	
	/**
	 * 查询所有 被监控的来源站关于币对的设置信息集合
	 * @return
	 */
	AbnormalProperty selectAbnormalProperty();
	
	int insertAbnormalProperty(AbnormalProperty abnormalProperty);
	
	int updateAbnormalProperty(AbnormalProperty abnormalProperty);
}
