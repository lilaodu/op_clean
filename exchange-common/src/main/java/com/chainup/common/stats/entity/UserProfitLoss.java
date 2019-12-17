package com.chainup.common.stats.entity;

import java.math.BigDecimal;

public class UserProfitLoss {
	private int id; //ID
	private int uid; //用户ID
	private BigDecimal deposit;//充值
	private BigDecimal withdraw;//提现
	private BigDecimal balance;//余额
	private Double earningsRate;
	private String unit; //计价单位
    private int limitStart;
    private int limitEnd;
	private String orderStr; //排序
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
	public BigDecimal getDeposit() {
		return deposit;
	}
	public void setDeposit(BigDecimal deposit) {
		this.deposit = deposit;
	}
	public BigDecimal getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(BigDecimal withdraw) {
		this.withdraw = withdraw;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Double getEarningsRate() {
		return earningsRate;
	}
	public void setEarningsRate(Double earningsRate) {
		this.earningsRate = earningsRate;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
	public String getOrderStr() {
		return orderStr;
	}
	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
}
