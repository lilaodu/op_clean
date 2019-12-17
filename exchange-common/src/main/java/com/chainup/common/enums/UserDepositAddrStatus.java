package com.chainup.common.enums;

/**
 * Created by nob.
 */
public enum UserDepositAddrStatus {
    DISABLED(0),
    USEABLE(1);

    private int value;

    UserDepositAddrStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
