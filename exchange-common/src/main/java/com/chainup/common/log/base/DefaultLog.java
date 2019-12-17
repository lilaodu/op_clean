package com.chainup.common.log.base;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.chainup.common.log.EventType;
import com.chainup.common.log.base.format.Formater;
import com.chainup.common.log.base.format.JSONFormater;
import com.chainup.common.util.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

/**
 * default log
 *
 * @author Autorun
 */
public class DefaultLog implements Log {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private static Appender appender;
    private static Formater formater;

    /**
     * 初始化
     */
    private static void init() {
        appender = new DefaultAppender();
        formater = new JSONFormater();
    }

    static {
        init();
    }

    @Override
    public void log(EventType eventType, final String msg) {
        log(eventType, msg, LogType.AUTO);
    }

    @Override
    public void log(EventType eventType, final String msg, final LogType logType) {
        String resultMsg;
        if (logType.getCode() == 1) {
            // 使用json序列化
            JSONObject format = formater.format(msg);
            if (format == null || format.size() <= 0) {
                return;
            }

            format.put("event_type", eventType.getEventType());
            format.put("current_time", System.currentTimeMillis());
            resultMsg = JSONObject.toJSONString(format, SerializerFeature.WriteNullStringAsEmpty,
                    SerializerFeature.WriteNullBooleanAsFalse, SerializerFeature.WriteNullNumberAsZero);
        } else {
            resultMsg = msg;
        }

        String eventName = eventType.getName();
        resultMsg += System.getProperty("line.separator");
        appender.doAppend(eventName, resultMsg);
    }
}
