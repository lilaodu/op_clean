package com.chainup.operate.parmas;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.chainup.common.enums.OrderSide;
import com.chainup.common.enums.OrderStatus;

public class OrderQuery implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	private String				symbol;
	private Integer				userId;
	private Long				orderId;
	private OrderSide			side;
	private OrderStatus			status ;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date				startDate;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date				endDate;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public OrderSide getSide() {
		return side;
	}

	public void setSide(OrderSide side) {
		this.side = side;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}
