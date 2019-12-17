package com.chainup.common.exception;

import java.io.Serializable;

/**
 * Created by zhongjingyun 20170926.
 */
public class ExchangeException extends Exception implements Serializable {
	private int code;
	private String messageKey;//国际化时提示的key
    public static final int PARAM_ERROR = 701; //参数错误
    public static final int UNKOWN_ERROR = 702; //未知错误

    public ExchangeException() {
        super();
    }

    public ExchangeException(String message) {
        super(message);
    }

    public ExchangeException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ExchangeException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

    public ExchangeException(String messageKey,String message) {
        super(message);
        this.messageKey = messageKey;
    }
    
    public ExchangeException(int code, String messageKey, String message) {
        super(message);
        this.messageKey = messageKey;
        this.code = code;
    }
    
    public ExchangeException(Throwable cause) {
        super(cause);
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}
}
