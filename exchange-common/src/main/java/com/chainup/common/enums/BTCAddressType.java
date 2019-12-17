package com.chainup.common.enums;

/**
 * Created by nob.
 */
public enum BTCAddressType {
    NORMAL(1),
    MULTI_SIGNATURE(2);

    private int value;

    BTCAddressType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
