package com.huaface.hong.utils;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chen
 */
public class HongResponse extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public HongResponse() {
        put("code", 0);
        put("message", "成功");
    }

    public static HongResponse error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "未知异常，请联系管理员");
    }

    public static HongResponse error(String msg) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }

    public static HongResponse error(int code, String msg) {
        HongResponse hongResponse = new HongResponse();
        hongResponse.put("code", code);
        hongResponse.put("message", msg);
        return hongResponse;
    }

    public static HongResponse ok(String msg) {
        HongResponse hongResponse = new HongResponse();
        hongResponse.put("message", msg);
        return hongResponse;
    }

    public static HongResponse ok(Object data) {
        HongResponse hongResponse = new HongResponse();
        hongResponse.put("data", data);
        return hongResponse;
    }

    public static HongResponse ok() {
        return new HongResponse();
    }
}
