package com.chainup.common.log.base;

/**
 * log factory
 *
 * @author Autorun
 */
public class LogFactory {

    public static Log getLog() {
        return new DefaultLog();
    }
}
