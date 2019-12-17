package com.chainup.common.util;

import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;




/**
 * 余额精确方法写在这里
 * @author zhongjingyun 
 * 
 */
public class ScaleUtils {
	public static final int BALANCE_ROUND_NUM_TWO = 2;
	public static final int BALANCE_ROUND_NUM_EIGHT = 8;
	public static final int BALANCE_ROUND_NUM_THREE = 3;
	
	//目前策略法币保留两位小数，虚拟币保留八位
	public static BigDecimal scaleBySymbol(BigDecimal balance, String symbol) {
		if (balance == null || StringUtils.isBlank(symbol) || balance.compareTo(new BigDecimal(0))==0) {
			
				return new BigDecimal("0.00");

		}else{
			return balance.setScale(BALANCE_ROUND_NUM_TWO, BigDecimal.ROUND_DOWN);
		}
		/*if (CoinSymbol.fromValue(symbol).isCurency==1 || symbol.equalsIgnoreCase("usdt") || symbol.equalsIgnoreCase("qf") ) {
			return balance.setScale(BALANCE_ROUND_NUM_TWO, BigDecimal.ROUND_DOWN);
		}else {
			return balance.setScale(BALANCE_ROUND_NUM_EIGHT, BigDecimal.ROUND_DOWN);
		}*/
	}
	

	
	//用此方法直接保留8位小数
	public static BigDecimal scaleByEight(BigDecimal balance) {
		if (balance == null || balance.compareTo(new BigDecimal(0))==0) {
			return new BigDecimal("0.00000000");
			
		}
		return balance.setScale(BALANCE_ROUND_NUM_EIGHT, BigDecimal.ROUND_DOWN);
	}
}
