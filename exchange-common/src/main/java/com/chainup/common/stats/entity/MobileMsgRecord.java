package com.chainup.common.stats.entity;

import java.util.Date;

public class MobileMsgRecord {

	private int id; //ID
	private String symbolType;
	private String msgType;
	private int lastExecuteId; //上次处理的记录ID
	private Date lastUpdateTime; //上次处理的时间
	private String receiveMobile;
	private String content;
	
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
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public String getReceiveMobile() {
		return receiveMobile;
	}
	public void setReceiveMobile(String receiveMobile) {
		this.receiveMobile = receiveMobile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
