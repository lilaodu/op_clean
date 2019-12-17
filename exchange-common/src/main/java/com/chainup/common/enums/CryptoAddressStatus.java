package com.chainup.common.enums;

/**
 * 交易所钱包地址是否使用状态
 * Created by nob.
 */
public enum CryptoAddressStatus {
    UNUSED(0),
    USED(1);

    public int value;

    CryptoAddressStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
