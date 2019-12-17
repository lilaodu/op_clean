package com.chainup.common.log.base.format;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Autorun
 */
public class JSONFormater implements Formater {

    @Override
    public JSONObject format(final String msg) {
        if (StringUtils.isBlank(msg)) {
            return null;
        }

        JSONObject result;
        try {
            result = JSONObject.parseObject(msg);
        } catch (Exception e) {
            result = null;
        }
        return result;
    }
}
