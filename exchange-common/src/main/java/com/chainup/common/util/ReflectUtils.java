package com.chainup.common.util;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 反射工具类
 *
 * @author Autorun
 * @date 2018年4月12日 12:14:58
 */
public final class ReflectUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflectUtils.class);
    private static final String UNKNOWN_METHOD_NAME = "UNKNOWN_METHOD_NAME";


    /**
     * 将list转换为map
     *
     * @param propertyName 对象属性名
     * @param datas        list 数据
     * @param isAppend     是否追加标记
     * @param isSequence   是否使用顺序加入
     * @param oldData      追加数据
     * @param <T>          实体类对象语法糖
     * @return
     * @date 2018年4月12日 12:16:25
     */
    public static <T> Map<String, T> listToMap(String propertyName, List<T> datas, boolean isAppend, boolean isSequence, Map<String, T> oldData) {
        if (StringUtils.isBlank(propertyName)) {
            throw new IllegalArgumentException("property name : " + propertyName + "is null , please check!");
        }
        if (datas == null || datas.size() == 0) {
            return null;
        }

        if (isSequence) {
            if (oldData == null) {
                oldData = new LinkedHashMap<>(datas.size());
            } else {
                oldData = new LinkedHashMap<>(oldData);
            }
        } else {
            if (!isAppend) {
                oldData = new HashMap<>(datas.size());
            } else {
                if (oldData == null) {
                    oldData = new HashMap<>(datas.size());
                }
            }
        }

        for (T t : datas) {
            try {
                String key = BeanUtils.getProperty(t, propertyName);
                oldData.put(key, t);
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error(e.getStackTrace().length > 0 ?
                        e.getStackTrace()[0].getMethodName() : UNKNOWN_METHOD_NAME, e);
            }
        }
        return oldData;
    }


    /**
     * 将list转换为map
     *
     * @param propertyName 对象属性名
     * @param datas        list 数据
     * @return map数据
     * @date 2018年4月12日 12:16:25
     */
    public static <T> Map<String, T> listToMap(String propertyName, List<T> datas) {
        return listToMap(propertyName, datas, false, false, null);
    }

}
