package com.chainup.common.enums;

public class CoinConverUtil {
	
	
	/**
	 * 根据channel取币对
	 * @author han
	 * @param channel
	 * @return
	 */
	public static String getCoinSymbol(String channel){
		
		 int index = channel.indexOf("_");
		 if(index > 0){
			 String channleValue = channel.substring(index + 1);
			 int index1 = channleValue.indexOf("_");
			 if(index1 > 0){
				 String channelValue1 = channleValue.substring(0, index1);
				 return channelValue1;
			 }
			 
		 }
		 
		 return "";
		 
	}
	
	/**
	 * 根据channel取刻度
	 * @author han
	 * @param channel
	 * @return
	 */
	public static String getScale(String channel){
		int index = channel.lastIndexOf("_");
		if(index > 0){
			String channelValue = channel.substring(index + 1);
			return channelValue;
		}
		
		return "";
		
	}

}
