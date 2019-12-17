package com.chainup.common.exchange.entity;

import java.io.Serializable;

/**
 * 国家区号表
 * @author zouyj
 *
 */
@SuppressWarnings("serial")
public class Country implements Serializable{
	
	private String enName;	//英文名
	private String cnName;	//中文名
	private String dialingCode;	//区号
	private String numberCode;    //国家数字代码
	private String showName;//用于展示的名字
	
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getEnName() {
		return enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}
	public String getCnName() {
		return cnName;
	}
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	public String getDialingCode() {
		return dialingCode;
	}
	public void setDialingCode(String dialingCode) {
		this.dialingCode = dialingCode;
	}
    public String getNumberCode() {
        return numberCode;
    }
    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode;
    }
}
