package com.chainup.common.stats.entity;

public class OkexMarketResultVO {

	private Long createdDate;

	private Double open;
	
	private Double close;
	
	private Double low;
	
	private Double high;
	
	private int marketFrom;
	
	private int type;
	
	private Double volume;

	public Long getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}

	public Double getOpen() {
		return open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getClose() {
		return close;
	}

	public void setClose(Double close) {
		this.close = close;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public int getMarketFrom() {
		return marketFrom;
	}

	public void setMarketFrom(int marketFrom) {
		this.marketFrom = marketFrom;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}
}
