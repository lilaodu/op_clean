package com.chainup.common.exception;

import java.io.Serializable;

public class OtcException extends RuntimeException implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	private String messageKey;// 国际化时提示的key
	public static final int PARAM_ERROR = 701; // 参数错误
	public static final int UNKOWN_ERROR = 702; // 未知错误

	public OtcException() {
		super();
	}

	public OtcException(String messageKey) {
		super(messageKey);
	}

	public OtcException(int code, String messageKey) {
		super(messageKey);
		this.code = code;
	}

	public OtcException(int code, String messageKey, Throwable cause) {
		super(messageKey, cause);
		this.code = code;
		this.messageKey = messageKey;
	}

	public OtcException(String messageKey, String message) {
		super(message);
		this.messageKey = messageKey;
	}

	public OtcException(Throwable cause) {
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
