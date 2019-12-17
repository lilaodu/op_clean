package com.chainup.common.stats.entity;

/**
 * 异常提现警告设置
 * @author Administrator
 *
 */
public class AbnormalWithdrawal {
	private int id; //ID
	private int launderDealAmount; //洗钱累计委托交易笔数
	private Double launderProperty; //洗钱账户总资产折合
	private int launderLevel; //洗钱增加警告等级
	private int ipLoginPercent; //IP登录次数百分比
	private int ipLoginLevel; //IP登录异常增加警告等级
	private int addressLevel; //提现到的地址异常增加警告等级
	private int accountLevel; //两个不同的账户提现到同一个地址异常增加警告等级
	private int managerOneLevel; //处理措施1警告等级
	private int managerOneValue; //处理措施1选项值
	private int managerTwoLevel; //处理措施2警告等级
	private int managerTwoValue; //处理措施2选项值
	private int managerThreeLevel; //处理措施3警告等级
	private int managerThreeValue; //处理措施3选项值
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLaunderDealAmount() {
		return launderDealAmount;
	}
	public void setLaunderDealAmount(int launderDealAmount) {
		this.launderDealAmount = launderDealAmount;
	}
	public Double getLaunderProperty() {
		return launderProperty;
	}
	public void setLaunderProperty(Double launderProperty) {
		this.launderProperty = launderProperty;
	}
	public int getLaunderLevel() {
		return launderLevel;
	}
	public void setLaunderLevel(int launderLevel) {
		this.launderLevel = launderLevel;
	}
	public int getIpLoginPercent() {
		return ipLoginPercent;
	}
	public void setIpLoginPercent(int ipLoginPercent) {
		this.ipLoginPercent = ipLoginPercent;
	}
	public int getIpLoginLevel() {
		return ipLoginLevel;
	}
	public void setIpLoginLevel(int ipLoginLevel) {
		this.ipLoginLevel = ipLoginLevel;
	}
	public int getAddressLevel() {
		return addressLevel;
	}
	public void setAddressLevel(int addressLevel) {
		this.addressLevel = addressLevel;
	}
	public int getAccountLevel() {
		return accountLevel;
	}
	public void setAccountLevel(int accountLevel) {
		this.accountLevel = accountLevel;
	}
	public int getManagerOneLevel() {
		return managerOneLevel;
	}
	public void setManagerOneLevel(int managerOneLevel) {
		this.managerOneLevel = managerOneLevel;
	}
	public int getManagerOneValue() {
		return managerOneValue;
	}
	public void setManagerOneValue(int managerOneValue) {
		this.managerOneValue = managerOneValue;
	}
	public int getManagerTwoLevel() {
		return managerTwoLevel;
	}
	public void setManagerTwoLevel(int managerTwoLevel) {
		this.managerTwoLevel = managerTwoLevel;
	}
	public int getManagerTwoValue() {
		return managerTwoValue;
	}
	public void setManagerTwoValue(int managerTwoValue) {
		this.managerTwoValue = managerTwoValue;
	}
	public int getManagerThreeLevel() {
		return managerThreeLevel;
	}
	public void setManagerThreeLevel(int managerThreeLevel) {
		this.managerThreeLevel = managerThreeLevel;
	}
	public int getManagerThreeValue() {
		return managerThreeValue;
	}
	public void setManagerThreeValue(int managerThreeValue) {
		this.managerThreeValue = managerThreeValue;
	}
}
