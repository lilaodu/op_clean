package com.chainup.exchange.dao;

import java.util.List;

import com.chainup.common.dao.SqlMapper;
import com.chainup.common.exchange.entity.SrvVersion;

public interface SrvVersionMapper extends SqlMapper {
  
	/**
	 * 根据build版本号和系统类型systemType获取该build版本号后面的升级信息
	 * @param version
	 * @return
	 */
	List<SrvVersion> getVersionsByAfterBuild(SrvVersion version);
	
}