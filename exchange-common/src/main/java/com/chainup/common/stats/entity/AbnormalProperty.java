package com.chainup.common.stats.entity;

/**
 * 异常资产配置
 * @author Administrator
 *
 */
public class AbnormalProperty {
	private int id; //ID
	private Double unevenProperty; //帐目不平的资产
	private String receiveMobile; //接收异常信息手机号
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getUnevenProperty() {
		return unevenProperty;
	}
	public void setUnevenProperty(Double unevenProperty) {
		this.unevenProperty = unevenProperty;
	}
	public String getReceiveMobile() {
		return receiveMobile;
	}
	public void setReceiveMobile(String receiveMobile) {
		this.receiveMobile = receiveMobile;
	}
}
