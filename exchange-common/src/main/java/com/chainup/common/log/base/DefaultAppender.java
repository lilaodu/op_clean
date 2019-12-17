package com.chainup.common.log.base;

import com.chainup.common.log.base.steram.BufferdFileOutputStream;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.Properties;

/**
 * @author Autorun
 */
public class DefaultAppender implements Appender {

    private Properties prop;

    private boolean append = true;

    private static final int DEFAULT_BUFFER_SIZE = 8192;

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final Properties systemProps;

    /**
     * 每间隔60秒新建一个文件
     */
    private static final int INTERVAL = 60000;

    private static final String DEFAULT_PREFIX = "{event}-{version}-{date}-{pid}";
    private static final String DEFAULT_SUBFFIX = ".security";

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public DefaultAppender() {
        systemProps = System.getProperties();
    }

    @Override
    public void doAppend(String eventName, final String msg) throws LogException {
        final String fileName = getCurrentFileName(eventName);
        try (BufferdFileOutputStream bfos = new BufferdFileOutputStream(new File(fileName), append, DEFAULT_BUFFER_SIZE)) {
            bfos.write(msg.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("write error", e);
        }
    }
    /**
     * 创建文件名
     */
    private String getCurrentFileName(String eventName) {
        String fileName = "";
        // 获取当前时间
        Date currDate = new Date();
        Long timeLong = (currDate.getTime() / INTERVAL + 1 )* INTERVAL;
        // 取配置
        String prefix = null;
        String suffix = null;
        if (prop != null) {
            prefix = prop.getProperty("log.prefix");
            suffix = prop.getProperty("log.suffix");
        }

        if (StringUtils.isBlank(prefix)) {
            prefix = DEFAULT_PREFIX;
        }

        if (StringUtils.isBlank(suffix)) {
            suffix = DEFAULT_SUBFFIX;
        }

        // 设置文件名
        prefix = prefix.replace("{pid}", getSystemPid());
        prefix = prefix.replace("{date}", String.valueOf(timeLong));
        prefix = prefix.replace("{version}", "1");
        prefix = prefix.replace("{event}", eventName);

        fileName += prefix;
        fileName += suffix;

        String userHome = systemProps.getProperty("user.home");
        String basePath = userHome + systemProps.getProperty("file.separator")
                + "agent"+systemProps.getProperty("file.separator")+"logs" + systemProps.getProperty("file.separator");

        File base = new File(basePath);
        if (!base.exists()) {
            base.mkdirs();
        }
        return basePath + fileName;
    }



    private String getSystemPid() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        return name.split("@")[0];
    }
}
