package com.chainup.common.stats.entity;

import java.util.Date;

public class AbnormalDealTrade{
    private int id;
    private String startTime;//交易开始时间
    private String endTime;//交易结束时间
    private Double volume;//交易数量
    private Double volumeCount;//总交易数量
    private Integer userId;//买方userID
    private String tableName;
    private int limitStart;
    private int limitEnd;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Double getVolumeCount() {
		return volumeCount;
	}
	public void setVolumeCount(Double volumeCount) {
		this.volumeCount = volumeCount;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
}