package com.chainup.common.enums;

/**
 * Created by nob.
 */
public enum UserWithdrawAddrStatus {
    DISABLED(0),
    USEABLE(1);

    private int value;

    UserWithdrawAddrStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
