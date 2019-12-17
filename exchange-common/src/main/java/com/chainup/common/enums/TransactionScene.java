package com.chainup.common.enums;

/**
 * 财务流水场景
 *
 * transaction.scene 取值示例
 *
 * Created by nob.
 */
public enum TransactionScene {
	TRADE("trade","fund.transaction.scene.trade","交易,包括买入和卖出"),
	BUY("buy","trade.buy","买入,前台展示时使用"),
	SELL("sell","trade.sell","卖出,前台展示时使用"),
	DEPOSIT("deposit","fund.transaction.scene.deposit","充值"),
	WITHDRAW_SUCCESS("withdraw_success","fund.transaction.scene.withdraw.success","提现成功"),
	WITHDRAW("withdraw","fund.transaction.scene.withdraw","提现中"),
	WITHDRAW_CNACEL("withdraw_cnacel","fund.transaction.scene.withdraw.cnacel","取消提现"),
	CREATE_ORDER("create_order","fund.transaction.scene.create.order","下单"),
	CANCEL_ORDER("cancel_order","fund.transaction.scene.cancel.order","撤销订单"),
	PRESENT_COIN("present_coin","fund.transaction.scene.present","赠币"),
	CANCEL_EXPIRED_ORDER("cancel_expired_order","","撤销异常订单"),
	OPEN_API_CHARGE("open_api_charge", "", "Open API 充值"),
	OPEN_API_TRANSFER("open_api_tranfer", "", "Open API 转账"),
	OPEN_API_WITHDRAW("open_api_withdraw", "", "Open API 提现"),

	CREATE_SELL_AD("create_sell_ad","release.sales.advertisement","场外发布售卖广告"),
	OTC_TRANSFER_SELLAD("otc_transfer_sellad","transfer.coin.sellad","场外释放货币转账,出售广告"),
	OTC_ADVERT_CLOSE("otc_advert_close","transfer.advert.close","关闭广告,冻结账户余额解冻"),
	OTC_SELL_ORDER("otc_sell_order","otc.sell.order","生成出售订单,冻结出售方的账户余额"),
	OTC_TRANSFER_BUYAD("otc_transfer_buyad","transfer.coin.buyad","场外释放货币转账,求购广告"),
	OTC_INTERNAL_TRANSFER("otc_internal_transfer","otc.internal.transfer","场外资金划转到现货账户"),
	OTC_TRANSFER("otc_transfer", "otc.transfer","场外资金划转"),
    OTC_ADVERT_REFUSE("otc_advert_refuse","otc.advert.refuse","审核拒绝，场外冻结账户转到余额账户"),
	TRANSFER_COMMON("transfer_common","","通用转账");

    public String value;
    public String languageKey;
    public String description;

    private TransactionScene(String value, String languageKey, String description) {
		this.value = value;
		this.languageKey = languageKey;
		this.description = description;
	}

	public String getLanguageKey() {
		return languageKey;
	}

	public void setLanguageKey(String languageKey) {
		this.languageKey = languageKey;
	}

	public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public static TransactionScene fromValue(String value) {
        for (TransactionScene t : TransactionScene.values()) {
        	if (t.value.equalsIgnoreCase(value)) {
        		return t;
        	}
        }
        return null;
    }
    
    public static TransactionScene fromName(String name) {
    	for (TransactionScene t : TransactionScene.values()) {
    		if (t.name().equals(name)) {
    			return t;
    		}
    	}
    	return null;
    }
}
