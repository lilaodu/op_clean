package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.stats.entity.SourceSymbol;

/**
 * 风控接口类
 * @author zhongjingyun 20170912
 */
public interface SourceSymbolService {
	
	/**
	 * 查询所有当前处于监控状态的来源站,进行抓取数据
	 * @param risk
	 * @return
	 */
	List<SourceSymbol> selectRiskList();
	
	/**
	 * 查询所有可能被监控的来源站
	 * @return
	 */
	List<SourceSymbol> selectSourceList();
	
	/**
	 * 查询所有可能被监控的来源站
	 * @return
	 */
	List<SourceSymbol> selectSymbolList();
	
}
