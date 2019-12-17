package com.chainup.common.stats.entity;

/**
 * 异常交易配置
 * @author Administrator
 *
 */
public class AbnormalDeal {

	private int id; //ID
	private int symbolId; //币对ID
	private int intervalMins; //间隔统计分钟数
	private int dealAmountPercent; //单个用户交易量占比
	private String receiveMobile; //接收异常交易消息手机号
	private String symbol;		  //币对
	private String symbolName;    //币对名称
	
	private Double volumeCount;//设定时间的交易量总和
	
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
	public int getIntervalMins() {
		return intervalMins;
	}
	public void setIntervalMins(int intervalMins) {
		this.intervalMins = intervalMins;
	}
	public int getDealAmountPercent() {
		return dealAmountPercent;
	}
	public void setDealAmountPercent(int dealAmountPercent) {
		this.dealAmountPercent = dealAmountPercent;
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
	public String getReceiveMobile() {
		return receiveMobile;
	}
	public void setReceiveMobile(String receiveMobile) {
		this.receiveMobile = receiveMobile;
	}
	public Double getVolumeCount() {
		return volumeCount;
	}
	public void setVolumeCount(Double volumeCount) {
		this.volumeCount = volumeCount;
	}
}
