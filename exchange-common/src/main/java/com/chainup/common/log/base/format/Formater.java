package com.chainup.common.log.base.format;


import com.alibaba.fastjson.JSONObject;


/**
 * @author Autorun
 */
public interface Formater {

    /**
     * 格式化
     *
     * @param msg
     * @return
     */
    JSONObject format(String msg);
}
