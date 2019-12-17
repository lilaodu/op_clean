package com.chainup.common.exchange.entity;

import java.math.BigDecimal;

public class sumDto {
	
	private Integer id;
	
	private String coinName;

	private BigDecimal amountSum;
	
	private BigDecimal feeSum;

	public BigDecimal getAmountSum() {
		return amountSum;
	}

	public void setAmountSum(BigDecimal amountSum) {
		this.amountSum = amountSum;
	}

	public BigDecimal getFeeSum() {
		return feeSum;
	}

	public void setFeeSum(BigDecimal feeSum) {
		this.feeSum = feeSum;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCoinName() {
		return coinName;
	}

	public void setCoinName(String coinName) {
		this.coinName = coinName;
	}

}