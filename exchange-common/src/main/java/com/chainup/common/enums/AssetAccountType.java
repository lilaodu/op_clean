package com.chainup.common.enums;

public enum AssetAccountType {

    //账户初始化类型(账户type值)
    ASSTES_ACCOUNT_FORMAT_THREE("%03d","资产类型格式"),

    //资产编号前缀
    ASSTES_NAME_PREFIX_REX("REX","资产名称rex前缀"),

    //资产名称初始化
    ASSTES_NAME_FORMAT("%04d","资产名称格式"),
    ;
    public String	value;
    public String	desc;

    AssetAccountType(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

    public String getDesc() { return desc; }

    public void setDesc(String desc) { this.desc = desc; }
}
