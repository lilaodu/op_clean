package com.chainup.common.enums;

/**
 * 开户行
 * Created by zhongjingyun on 2017/10/09.
 */
public enum Bank {

	ZhongGuo(1,"fund.ZhongGuo.bank","/res/img/bank/bank1.png","中国银行"),
	GongShang(1,"fund.GongShang.bank","/res/img/bank/bank2.png","中国工商银行"),
	ZhaoShang(1,"fund.ZhaoShang.bank","/res/img/bank/bank3.png","招商银行"),
	JianShe(1,"fund.JianShe.bank","/res/img/bank/bank4.png","中国建设银行");

    public Integer bankNo;
    public String languageKey;
    public String imgUrl;
    public String description;


	private Bank(Integer bankNo, String languageKey, String imgUrl, String description) {
		this.bankNo = bankNo;
		this.languageKey = languageKey;
		this.imgUrl = imgUrl;
		this.description = description;
	}




	public Integer getBankNo() {
		return bankNo;
	}




	public void setBankNo(Integer bankNo) {
		this.bankNo = bankNo;
	}




	public String getLanguageKey() {
		return languageKey;
	}




	public void setLanguageKey(String languageKey) {
		this.languageKey = languageKey;
	}




	public String getImgUrl() {
		return imgUrl;
	}




	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}




	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static Bank fromValue(Integer value) {
        for (Bank t : Bank.values()) {
        	if (t.bankNo.equals(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static Bank fromName(String name) {
    	for (Bank t : Bank.values()) {
    		if (t.name().equalsIgnoreCase(name)) {
    			return t;
    		}
    	}
    	return null;
    }
    
}
