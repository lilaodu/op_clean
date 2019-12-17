package com.chainup.operate.service;

import com.chainup.common.exchange.entity.SystemConfig;

/**
 * 系统参数设置相关服务接口类
 * 
 * @author lilp
 *
 */
public interface SystemConfigService {
	/**
     * 查找当前的系统设置，暂时system_config 就一条记录，不同配置，不同字段
     * 
     * @return
     */
    SystemConfig findSystemConfig();
    
    /**
     * 配置参数
     * 
     * @param systemConfig
     * @return
     */
    Integer systemConfigSetting(SystemConfig systemConfig);
}
