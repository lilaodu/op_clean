package com.chainup.common.log.base;

import com.chainup.common.log.EventType;

/**
 * 输出器
 *
 * @author Autorun
 */
public interface Log {

    /**
     * 根据默认格式输出日志
     *
     * @param eventType
     * @param msg
     */
    void log(EventType eventType, String msg);

    /**
     * 根据指定格式输出日志
     *
     * @param eventType
     * @param msg
     * @param type
     */
    void log(EventType eventType, String msg, LogType type);
}
