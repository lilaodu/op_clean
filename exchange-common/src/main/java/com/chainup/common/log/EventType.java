package com.chainup.common.log;

/**
 * 状态类型
 *
 * @author Autorun
 */
public enum EventType {

    EXCHANGE_CREATE_ORDER(0, "exchange", "new", 1),
    EXCHANGE_CANCEL_ORDER(1, "exchange", "cancel", 1),
    EXCHANGE_TRADE(2, "exchange", "fill", 1),

    USER_CREATE_USER(3, "user", "new", 1),
    USER_AUTH_USER(4, "user", "auth", 1),
    USER_LOGIN_USER(5, "user", "login", 1),
    USER_LOGOUT_USER(6, "user", "login", 1),

    FINANCE_TRANSACTION(7, "finance", "transaction", 1);

    private int code;
    private String name;
    private String eventType;
    private int status;


    EventType(int code, String name, String eventType, int status) {
        this.code = code;
        this.name = name;
        this.eventType = eventType;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getEventType() {
        return eventType;
    }

    public int getStatus() {
        return status;
    }
}
