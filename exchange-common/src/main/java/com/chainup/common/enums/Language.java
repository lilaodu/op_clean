package com.chainup.common.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 国际化语言包
 * ISO 639-1 语言规范
 * ISO 3166-1 国家规范
 * Created by zhongjingyun on 2017/11/3.
 */
public enum Language {
	Chinese("zh",1,"zh_CN","cnName",1,"简体中文","1,95","{familyName}{givenName}","中文","￥"),
	English("en",2,"en_US","enName",1,"English","107,108","{givenName}{familyName}","英文","$"),
	Korean("ko",3,"ko_KR","koName",1,"조선말","109,110","{familyName}{givenName}","韩文","");

    public String lang;//语言编码
    public int langTypeId;//多语言id（这个字段给cms系统使用）
    public String langType;//多语言和国家编码
    public String phoneCountryName;//电话号码国家编码名字
    public int status;//开启状态 1开启 0关闭
    public String showName;//页面展示名字
    public String cmsTypeId;//后台cms系统分类id
    public String nameOrder;//不同国家姓名顺序，familyName姓，givenName名
    public String description;
    public String moneySymbol;//货币符号
    

	private Language(String lang, int langTypeId, String langType, String phoneCountryName, int status, String showName,
                     String cmsTypeId, String nameOrder, String description, String moneySymbol) {
		this.lang = lang;
		this.langTypeId = langTypeId;
		this.langType = langType;
		this.phoneCountryName = phoneCountryName;
		this.status = status;
		this.showName = showName;
		this.cmsTypeId = cmsTypeId;
		this.nameOrder = nameOrder;
		this.description = description;
		this.moneySymbol = moneySymbol;
	}


	public String getPhoneCountryName() {
		return phoneCountryName;
	}


	public void setPhoneCountryName(String phoneCountryName) {
		this.phoneCountryName = phoneCountryName;
	}


	public String getCmsTypeId() {
		return cmsTypeId;
	}

	public void setCmsTypeId(String cmsTypeId) {
		this.cmsTypeId = cmsTypeId;
	}

	public String getNameOrder() {
		return nameOrder;
	}

	public void setNameOrder(String nameOrder) {
		this.nameOrder = nameOrder;
	}

	public int getLangTypeId() {
		return langTypeId;
	}

	public void setLangTypeId(int langTypeId) {
		this.langTypeId = langTypeId;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getLangType() {
		return langType;
	}

	public void setLangType(String langType) {
		this.langType = langType;
	}

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static Language fromValue(String lang) {
        for (Language t : Language.values()) {
        	if (t.lang.equalsIgnoreCase(lang)) {
        		return t;
        	}
        }
        return null;
    }
    
    //根据langTypeId获取枚举
    public static Language fromLangTypeId(int langTypeId) {
    	for (Language t : Language.values()) {
    		if (t.langTypeId==langTypeId) {
    			return t;
    		}
    	}
    	return null;
    }
    
  //获取已开通的语言 
    public static List<Language> getStartLanguage(){
    	ArrayList<Language> langList = new ArrayList<Language>();
    	for (Language t : Language.values()) {
        	if (t.status==1) {
        		langList.add(t);
        	}
        }
    	return langList;
    }
    
    public static Language fromName(String name) {
    	for (Language t : Language.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
