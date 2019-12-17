package com.chainup.common.log.base;

public class RolloverFailure extends LogException {

    private static final long serialVersionUID = 1511621297952247391L;

    public RolloverFailure() {
        super();
    }

    public RolloverFailure(String message) {
        super(message);
    }

    public RolloverFailure(String message, Throwable cause) {
        super(message, cause);
    }

    public RolloverFailure(Throwable cause) {
        super(cause);
    }
}
