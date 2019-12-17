package com.chainup.common.log.plugin;

/**
 * @param <T>
 * @author Autorun
 */
public interface Wapper<T> {

    /**
     * 包装对象
     *
     * @param t
     * @return
     */
    T wapper(T t);
}
