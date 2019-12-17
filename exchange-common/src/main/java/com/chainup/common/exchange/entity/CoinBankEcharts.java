package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.List;

public class CoinBankEcharts {
	 private String name;
/*	 private final String type="bar";
	 private final Integer barGap=0;
	 private final Object label=labelOption;*/
	 private List<BigDecimal> data;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public String getType() {
		return type;
	}
	public Integer getBarGap() {
		return barGap;
	}
	public String getLabel() {
		return label;
	}*/
	public List<BigDecimal> getData() {
		return data;
	}
	public void setData(List<BigDecimal> data) {
		this.data = data;
	}
	
	 
	 
	
}
