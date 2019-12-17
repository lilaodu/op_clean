package com.chainup.common.enums;

public enum OtcOrderStatus {
    PAY_PENDING(1,"otc.order.status.pay.pending","待支付"),
    PAID(2,"otc.order.status.paid","已支付"),
    COMPLETED(3,"otc.order.status.completed","交易完成"),
    CANCELLED(4,"otc.order.status.cancelled","已取消"),
    APPEAL(5,"otc.order.status.appeal.pending","申诉中"),
    PAY_COIN(6,"otc.order.status.pay.coin","释放中"),
    EXCEPTION_ORDER(7,"otc.order.status.exception.order","异常订单"),
    APPEAL_COMPLETED(8,"otc.order.status.appeal.completed","申诉处理完成"),
    APPEAL_COMPLETED_CANCELLED(9,"otc.order.status.appeal.cancelled","申诉取消");

    /**
     * 唯一值
     */
    public int value;
    /**
     * 国际化语言key
     */
    public String languageKey;
    /**
     * 描述
     */
    public String description;


    OtcOrderStatus(int value, String languageKey, String description) {
        this.value = value;
        this.languageKey = languageKey;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLanguageKey() {
        return languageKey;
    }

    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static OtcOrderStatus fromValue(int value) {
        for (OtcOrderStatus t : OtcOrderStatus.values()) {
            if (t.value==value) {
                return t;
            }
        }
        return null;
    }

    public static OtcOrderStatus fromName(String name) {
        for (OtcOrderStatus t : OtcOrderStatus.values()) {
            if (t.name().equals(name)) {
                return t;
            }
        }
        return null;
    }
}
