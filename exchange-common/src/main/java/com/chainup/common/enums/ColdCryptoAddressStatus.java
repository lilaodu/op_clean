package com.chainup.common.enums;

/**
 * 冷钱包地址状态
 * Created by nob
 */
public enum ColdCryptoAddressStatus {
    NEW(1, "finance.profit.not_enabled", "未启用"),
    USING(2, "finance.profit.in_use", "使用中"),
    ABANDON(3, "finance.profit.obsolete", "已废弃");


    public int value;
    public String description;
    public String languageKey;

    ColdCryptoAddressStatus(int value, String description, String languageKey) {
        this.value = value;
        this.description = description;
        this.languageKey = languageKey;
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

    public String getLanguageKey() {
        return languageKey;
    }

    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ColdCryptoAddressStatus fromValue(Integer value) {
        if (value == null) {
            return null;
        }
        for (ColdCryptoAddressStatus t : ColdCryptoAddressStatus.values()) {
            if (t.value == value) {
                return t;
            }
        }
        return null;
    }

    public static ColdCryptoAddressStatus fromName(String name) {
        if (name.equals("")) {
            return null;
        }
        for (ColdCryptoAddressStatus t : ColdCryptoAddressStatus.values()) {
            if (t.name().equals(name)) {
                return t;
            }
        }
        return null;
    }
}

