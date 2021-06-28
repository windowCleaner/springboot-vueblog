package com.ljp.vuelog.common.lang;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static Result success(int code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public static Result success(Object data) {
        return success(200, "操作成功", data);
    }

    public static Result failure(int code, String msg, Object data){
        return new Result(code,msg,data);
    }

    public static Result failure(String msg,Object data){
        return failure(400,msg,data);
    }

    public static Result failure(String msg){
        return failure(400,msg,null);
    }
}
