package com.chainup.operate.service;

import com.chainup.common.exchange.entity.ExAssetAllocation;
/**
 * 账户配置抽离
 * @author Jennifer
 *
 */
public interface AssetAllocationService {

	/**
	 * 查找账户
	 * @param account_A
	 * @param account_BC
	 * @param coinSymbol
	 * @return
	 */
	ExAssetAllocation findAccount(String account_A, String account_BC, String coinSymbol);
	
	/**
	 * 查找手续费账户
	 * @param account_A
	 * @param account_BC
	 * @param coinSymbol
	 * @param symbol
	 * @return
	 */
	ExAssetAllocation findFeeAccount(String account_A, String account_BC, String coinSymbol, String symbol);
}
