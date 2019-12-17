package com.chainup.common.stats.entity;

/**
 * 异常价格配置
 * @author Administrator
 *
 */
public class AbnormalPrice {
	private int id; //ID
	private int symbolId; //币对ID
	private int platformPricePercent; //与平台平均价格偏离百分比
	private int platformPriceMins; //与平台平均价格偏离分钟发送消息
	private String platformPriceMobile; //与平台平均价格偏离接收消息手机号
	private int dealPricePercent; //与上一笔交易价格偏离百分比
	private int dealPriceMins; //与上一笔交易价格偏离分钟发送消息
	private String dealPriceMobile; //与上一笔交易价格偏离接收消息手机号
	private int priceVolatilityPercent; //半小时内价格波动百分比
	private int priceVolatilityMins; //半小时内价格波动分钟发送消息
	private String priceVolatilityMobile; //半小时内价格波动接收消息手机号
	private String sourceId; //风控对比来源站ID多个站,号隔开
	private String symbol;		  //币对
	private String symbolName;    //币对名称
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSymbolId() {
		return symbolId;
	}
	public void setSymbolId(int symbolId) {
		this.symbolId = symbolId;
	}
	public int getPlatformPricePercent() {
		return platformPricePercent;
	}
	public void setPlatformPricePercent(int platformPricePercent) {
		this.platformPricePercent = platformPricePercent;
	}
	public int getPlatformPriceMins() {
		return platformPriceMins;
	}
	public void setPlatformPriceMins(int platformPriceMins) {
		this.platformPriceMins = platformPriceMins;
	}
	public String getPlatformPriceMobile() {
		return platformPriceMobile;
	}
	public void setPlatformPriceMobile(String platformPriceMobile) {
		this.platformPriceMobile = platformPriceMobile;
	}
	public int getDealPricePercent() {
		return dealPricePercent;
	}
	public void setDealPricePercent(int dealPricePercent) {
		this.dealPricePercent = dealPricePercent;
	}
	public int getDealPriceMins() {
		return dealPriceMins;
	}
	public void setDealPriceMins(int dealPriceMins) {
		this.dealPriceMins = dealPriceMins;
	}
	public String getDealPriceMobile() {
		return dealPriceMobile;
	}
	public void setDealPriceMobile(String dealPriceMobile) {
		this.dealPriceMobile = dealPriceMobile;
	}
	public int getPriceVolatilityPercent() {
		return priceVolatilityPercent;
	}
	public void setPriceVolatilityPercent(int priceVolatilityPercent) {
		this.priceVolatilityPercent = priceVolatilityPercent;
	}
	public int getPriceVolatilityMins() {
		return priceVolatilityMins;
	}
	public void setPriceVolatilityMins(int priceVolatilityMins) {
		this.priceVolatilityMins = priceVolatilityMins;
	}
	public String getPriceVolatilityMobile() {
		return priceVolatilityMobile;
	}
	public void setPriceVolatilityMobile(String priceVolatilityMobile) {
		this.priceVolatilityMobile = priceVolatilityMobile;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getSymbolName() {
		return symbolName;
	}
	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
}
