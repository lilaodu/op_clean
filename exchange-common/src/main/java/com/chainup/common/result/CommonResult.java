package com.chainup.common.result;

import java.io.Serializable;

/**
 * 返回结果
 * Created by zhongjingyun on 20170927
 */
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = 7917345507074842804L;
    private String code;//0成功 非0具体错误原因
    private String msg;//具体错误描述or成功描述
    private T data;//存放业务数据

    public static class Builder {
        public static CommonResult SUCC() {
            CommonResult vo = new CommonResult();
            vo.setCode("0");
            return vo;
        }

        public static CommonResult FAIL() {
            CommonResult vo = new CommonResult();
            return vo;
        }
    }

    public CommonResult initErrCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }
    
    public CommonResult initErrCodeAndMsg(int code, String msg) {
        this.code = Integer.toString(code);
        this.msg = msg;
        return this;
    }

    public CommonResult initSuccCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public CommonResult initSuccData(T data) {
        this.data = data;
        return this;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getmsg() {
        return msg;
    }

    public void setmsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
