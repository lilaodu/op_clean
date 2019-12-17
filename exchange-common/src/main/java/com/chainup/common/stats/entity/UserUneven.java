package com.chainup.common.stats.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserUneven {
	private int id; //ID
	private int uid; //用户ID
	private String symbol; //不平资产类型
	private String targetSymbol; //市价折合币种
	private BigDecimal amount;//不平资产数量
	private BigDecimal balance;//按市价折合 BTC
	private Boolean status;//不平资产状态(0未处理1已处理)
	private Date ctime;//交易时间	
	private int limitStart;
    private int limitEnd;
    private String ctimeStr; //不平资产类型
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public String getTargetSymbol() {
		return targetSymbol;
	}
	public void setTargetSymbol(String targetSymbol) {
		this.targetSymbol = targetSymbol;
	}
	public int getLimitStart() {
		return limitStart;
	}
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}
	public int getLimitEnd() {
		return limitEnd;
	}
	public void setLimitEnd(int limitEnd) {
		this.limitEnd = limitEnd;
	}
	public String getCtimeStr() {
		return ctimeStr;
	}
	public void setCtimeStr(String ctimeStr) {
		this.ctimeStr = ctimeStr;
	}
}
