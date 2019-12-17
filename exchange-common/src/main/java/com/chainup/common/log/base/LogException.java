package com.chainup.common.log.base;

/**
 * exception
 * @author Autorun
 */
public class LogException extends RuntimeException {

    private static final long serialVersionUID = -2746016521742072814L;

    public LogException() {
    }

    public LogException(String message) {
        super(message);
    }

    public LogException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogException(Throwable cause) {
        super(cause);
    }

}
