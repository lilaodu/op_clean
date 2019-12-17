package com.chainup.common.stats.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.chainup.common.util.PropertyUtil;

public class AbnormalTrade{
    private int id;
    private Double price; //交易价格
    private Double highest;//半小时内最高
    private Double lowest;//半小时内最低
    private Double prePrice; //上一笔交易价格
    private Double avgPrice; //其他平台平均价格
    private Date ctime;//交易时间
    private Boolean avgFlag;//平台平均异常标志
    private Boolean preFlag;//上一笔交易异常标志
    private Boolean highFlag;//最高波动异常标志
    private Boolean lowFlag;//最低波动异常标志
    private Integer bidUserId;//买方userID
    private Integer askUserId;//卖方userID
    private Integer tradeId;//交易表交易ID
    private Double volume;//交易数量
    private String tableName;
    
    private Integer maxId;//警告表最大ID
    private Integer countNum;//警告记录条数
    private int limitStart;
    private int limitEnd;
    private String ctimeStart;
    private String ctimeEnd;
    private String ctimeStr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getVolume() {
		return volume;
	}
	public void setVolume(Double volume) {
		this.volume = volume;
	}
	public Double getHighest() {
		return highest;
	}
	public void setHighest(Double highest) {
		this.highest = highest;
	}
	public Double getLowest() {
		return lowest;
	}
	public void setLowest(Double lowest) {
		this.lowest = lowest;
	}
	public Double getPrePrice() {
		return prePrice;
	}
	public void setPrePrice(Double prePrice) {
		this.prePrice = prePrice;
	}
	public Double getAvgPrice() {
		return avgPrice;
	}
	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}
	public Date getCtime() {
		return ctime;
	}
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	public Boolean getAvgFlag() {
		return avgFlag;
	}
	public void setAvgFlag(Boolean avgFlag) {
		this.avgFlag = avgFlag;
	}
	public Boolean getPreFlag() {
		return preFlag;
	}
	public void setPreFlag(Boolean preFlag) {
		this.preFlag = preFlag;
	}
	public Boolean getHighFlag() {
		return highFlag;
	}
	public void setHighFlag(Boolean highFlag) {
		this.highFlag = highFlag;
	}
	public Boolean getLowFlag() {
		return lowFlag;
	}
	public void setLowFlag(Boolean lowFlag) {
		this.lowFlag = lowFlag;
	}
	public Integer getBidUserId() {
		return bidUserId;
	}
	public void setBidUserId(Integer bidUserId) {
		this.bidUserId = bidUserId;
	}
	public Integer getAskUserId() {
		return askUserId;
	}
	public void setAskUserId(Integer askUserId) {
		this.askUserId = askUserId;
	}
	public Integer getTradeId() {
		return tradeId;
	}
	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public Integer getMaxId() {
		return maxId;
	}
	public void setMaxId(Integer maxId) {
		this.maxId = maxId;
	}
	public Integer getCountNum() {
		return countNum;
	}
	public void setCountNum(Integer countNum) {
		this.countNum = countNum;
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
	public String getCtimeStart() {
		return ctimeStart;
	}
	public void setCtimeStart(String ctimeStart) {
		this.ctimeStart = ctimeStart;
	}
	public String getCtimeEnd() {
		return ctimeEnd;
	}
	public void setCtimeEnd(String ctimeEnd) {
		this.ctimeEnd = ctimeEnd;
	}
	public String getCtimeStr() {
		String date_format = PropertyUtil.getProperties("system_date_format");
		SimpleDateFormat sdhmsf=new SimpleDateFormat(date_format);
		return sdhmsf.format(this.ctime);
	}
	public void setCtimeStr(String ctimeStr) {
		this.ctimeStr = ctimeStr;
	}
}