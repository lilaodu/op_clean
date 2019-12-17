package com.chainup.common.enums;

/**
 * 交易对  ex_order_xxxxxx，ex_trade_xxxxxx 订单表
 * Created by zhongjingyun on 2017/10/07.
 */
public enum WarnInfo {
	KFHS(1,"要求客服回访用户后处理"),
	YC12(2,"延缓12小时处理"),
	YC24(3,"延缓24小时处理"),
	DJTX(4,"冻结用户提现"),
	DJDL(5,"冻结用户登录");
	
    public int value;
    public String description;
	
    private WarnInfo(int value, String description) {
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
    
    public static WarnInfo fromValue(int value) {
        for (WarnInfo t : WarnInfo.values()) {
        	if (t.value == value) {
        		return t;
        	}
        }
        
        if (value > 0 && value>WarnInfo.DJDL.value) {
			return WarnInfo.DJDL;
		}
        return null;
    }
}
