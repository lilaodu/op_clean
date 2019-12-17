package com.chainup.operate.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chainup.exchange.dao.SystemConfigMapper;
import com.chainup.common.exchange.entity.SystemConfig;
import com.chainup.common.web.Constants;
import com.chainup.operate.service.SystemConfigService;

@Service
public class SystemConfigServiceImpl implements SystemConfigService {
	private static final Logger logger = LoggerFactory.getLogger(SystemConfigServiceImpl.class);
	@Autowired
	private SystemConfigMapper systemConfigMapper;
	
	@Override
	public SystemConfig findSystemConfig() {
		List<SystemConfig> systemConfigs = systemConfigMapper.selectByExample(null);
		if (systemConfigs != null && systemConfigs.size() > 0) {
			return systemConfigs.get(0);
		}
		return null;
	}
	
	@Override
	public Integer systemConfigSetting(SystemConfig systemConfig) {
		try {
			SystemConfig systemConfigTemp = findSystemConfig();
			if (systemConfigTemp != null) { // 更新配置参数
				systemConfig.setId(systemConfigTemp.getId());
				systemConfigMapper.updateByPrimaryKeySelective(systemConfig);
				return Constants.SUCCESS_ONE;
			} else { // 第一次新增配置参数
				systemConfigMapper.insertSelective(systemConfig);
				return Constants.SUCCESS_ONE;
			}
		} catch (Exception e) {
			logger.error("systemConfigSetting Exception = {}",e);
			return Constants.EXCEPTION_999;
		}
	}
}