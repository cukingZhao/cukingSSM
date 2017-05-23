package com.cuking.core.exception;


import java.io.Serializable;

public class BusinessException extends RuntimeException implements Serializable{

    private int code;

    private String msg;

    public BusinessException(int code, String msg) {
        this.code=code;
        this.msg= msg;
    }

    public BusinessException(String msg) {
        this.code=500;
        this.msg= msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
