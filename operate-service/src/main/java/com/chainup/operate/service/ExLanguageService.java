package com.chainup.operate.service;

import java.util.List;

import com.chainup.common.exchange.entity.ExLanguageConfig;
import com.chainup.common.exchange.entity.ExSymbol;
import com.chainup.common.exchange.vo.OtcLanguage;

public interface ExLanguageService {

	/**
	 * 获取所有系统中使用的语言包
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ExLanguageConfig> getAllUsedLang() throws Exception;

	/**
	 * 获取指定key的语言包
	 * 
	 * @return
	 * @throws Exception
	 */
	public ExLanguageConfig getLangByKey(String key) throws Exception;

	/**
	 * 获取场外的语言包配置
	 * 
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public OtcLanguage getOtcLangByKey(String key) throws Exception;

	/**
	 * 获取场外支持的币种
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<ExSymbol> getOtcSymbols() throws Exception;
	
	/**
	 * 判断场外账户是否有这个币种
	 * @param symbol
	 * @return
	 * @throws Exception
	 */
	public boolean findSymbol(String symbol) throws Exception;
}
