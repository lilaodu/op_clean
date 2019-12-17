package com.chainup.common.exchange.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SymbolRate {
	private int id; //ID
	private String baseSymbol; //基础货币
	private String quoteSymbol; //换算目标货币
	private BigDecimal rate; //汇率
	private Date updateTime; //与平台平均价格偏离分钟发送消息
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBaseSymbol() {
		return baseSymbol;
	}
	public void setBaseSymbol(String baseSymbol) {
		this.baseSymbol = baseSymbol;
	}
	public String getQuoteSymbol() {
		return quoteSymbol;
	}
	public void setQuoteSymbol(String quoteSymbol) {
		this.quoteSymbol = quoteSymbol;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
