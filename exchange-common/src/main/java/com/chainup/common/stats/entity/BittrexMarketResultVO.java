package com.chainup.common.stats.entity;

public class BittrexMarketResultVO {

	private String TimeStamp;

	private Double Last;
	
	private Double Low;
	
	private Double High;
	
	private String MarketName;
	
	private Double Volume;

	public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

	public Double getLast() {
		return Last;
	}

	public void setLast(Double last) {
		Last = last;
	}

	public Double getLow() {
		return Low;
	}

	public void setLow(Double low) {
		Low = low;
	}

	public Double getHigh() {
		return High;
	}

	public void setHigh(Double high) {
		High = high;
	}

	public String getMarketName() {
		return MarketName;
	}

	public void setMarketName(String marketName) {
		MarketName = marketName;
	}

	public Double getVolume() {
		return Volume;
	}

	public void setVolume(Double volume) {
		Volume = volume;
	}

}
