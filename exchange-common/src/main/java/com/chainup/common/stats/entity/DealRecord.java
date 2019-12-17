package com.chainup.common.stats.entity;

import java.util.Date;

public class DealRecord {

	private int id; //ID
	private String symbolType;
	private int lastExecuteId; //上次处理的记录ID
	private Date lastUpdateTime; //上次处理的时间
	private Date lastTiming; //上一次定时器执行时间
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSymbolType() {
		return symbolType;
	}
	public void setSymbolType(String symbolType) {
		this.symbolType = symbolType;
	}
	public int getLastExecuteId() {
		return lastExecuteId;
	}
	public void setLastExecuteId(int lastExecuteId) {
		this.lastExecuteId = lastExecuteId;
	}
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public Date getLastTiming() {
		return lastTiming;
	}
	public void setLastTiming(Date lastTiming) {
		this.lastTiming = lastTiming;
	}
}
