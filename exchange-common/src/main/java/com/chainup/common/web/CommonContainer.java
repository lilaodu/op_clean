package com.chainup.common.web;



/**
 * 获得会员信息,获得后台站点信息
 * 
 */
public class CommonContainer {
	static MyEConfig myeConfig = new MyEConfig();
	/**
	 * 获得站点
	 * 
	 * @param request
	 * @return
	 */
	public static MyEConfig getSite() {
		return CommonContainer.myeConfig;
	}

	/**
	 * 设置站点
	 * 
	 * @param request
	 * @param site
	 */
	public static void setSite(MyEConfig myeConfig) {
		CommonContainer.myeConfig = myeConfig;
	}


}
