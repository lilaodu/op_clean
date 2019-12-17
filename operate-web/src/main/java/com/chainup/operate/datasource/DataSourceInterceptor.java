package com.chainup.operate.datasource;

import org.aspectj.lang.JoinPoint;

public class DataSourceInterceptor {

	public void setdataSourceExchange(JoinPoint jp) {
		CustomerContextHolder.setCustomerType("dataSourceManage_exchange");
	}
	
	public void setdataSourceExchangeRisk(JoinPoint jp) {
		CustomerContextHolder.setCustomerType("dataSourceManage_exchange_risk");
	}
	public void setdataSourceExchangeOtc(JoinPoint jp) {
		CustomerContextHolder.setCustomerType("dataSourceManage_exchange_otc");
	}
	public void removedataSource(JoinPoint jp){
		CustomerContextHolder.clearCustomerType();
	}

}
