package com.chainup.common.enums;

/**
 * cms文章是否footer显示 cms_article表，1显示，0不显示
 * Created by zhongjingyun on 2017/11/6.
 */
public enum CmsArticleFooterFlag {
	show(1,"显示"),
	hide(0,"不显示");

    public int value;
    public String description;

    CmsArticleFooterFlag(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static CmsArticleFooterFlag fromValue(int value) {
        for (CmsArticleFooterFlag t : CmsArticleFooterFlag.values()) {
        	if (t.value==value) {
        		return t;
        	}
        }
        return null;
    }
    
    public static CmsArticleFooterFlag fromName(String name) {
    	for (CmsArticleFooterFlag t : CmsArticleFooterFlag.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
