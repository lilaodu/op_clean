package com.chainup.common.log.base;

/**
 * Appender
 *
 * @author Autorun
 */
public interface Appender {

    /**
     * This is where an appender accomplishes its work. Note that the argument
     * is of type Object.
     *
     * @param eventName
     * @param msg
     * @throws LogException
     */
    void doAppend(String eventName, String msg) throws LogException;
}
