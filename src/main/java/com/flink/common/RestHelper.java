package com.flink.common;

import com.alibaba.fastjson.JSONObject;

import java.util.concurrent.CompletableFuture;

public class RestHelper {

    public static JSONObject genResponse(int code, String msg, JSONObject data) {
        JSONObject response = new JSONObject();
        response.put("code", code);
        if (msg != null) {
            response.put("msg", msg);
        }
        if (data != null) {
            response.put("data", data);
        }
        return response;
    }

    public static JSONObject genResponse(int code, String msg) {
        return genResponse(code, msg, null);
    }

    public static String genResponseString(int code, String msg) {
        return genResponse(code, msg, null).toJSONString();
    }

    public static CompletableFuture<String> genResponseFuture(int code, String msg) {
        return CompletableFuture.completedFuture(genResponseString(code, msg));
    }
}
