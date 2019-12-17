package com.chainup.common.log.base;

/**
 * logger type
 * @author Autorun
 */
public enum LogType {
    AUTO(0, "AUTO"), JSON(1, "JSON");

    private int code;
    private String msg;

    LogType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
