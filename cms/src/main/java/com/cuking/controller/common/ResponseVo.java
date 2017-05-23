package com.cuking.controller.common;


import com.cuking.core.exception.BusinessException;

/**
 * Created by cuking on 2017/4/17.
 */
public class ResponseVo<T> {

    private int status = 200;
    private String statusText = "success";
    private T data;

    public static final int SUCCESS_CODE = 200;
    public static final int ERROR_CODE = 500;
    public static final int NOT_LOGIN_CODE = 401;

    public static final String SUCCESS = "success";
    public static final String ERROR = "error";

    public ResponseVo(T data) {
        this.data = data;
    }


    public static <T> ResponseVo<T> ERROR() {
        return new ResponseVo<T>(ERROR_CODE, "服务器打瞌睡了");
    }
    public static <T> ResponseVo<T> SUCCESS() {
        return new ResponseVo<T>(SUCCESS_CODE, SUCCESS);
    }
    public static <T> ResponseVo<T> NOT_ALLOW() {
        return new ResponseVo<T>(403, "无权访问");
    }
    public static <T> ResponseVo<T> NEED_LOGIN() {
        return new ResponseVo<T>(NOT_LOGIN_CODE, "请先登录");
    }
    public static <T> ResponseVo<T> ERROR(BusinessException e) {
        return new ResponseVo<T>(e.getCode(), e.getMsg());
    }


    public static <T> ResponseVo<T> SUCCESS(T data) {
        return new ResponseVo<T>(SUCCESS_CODE, SUCCESS,data);
    }

    public ResponseVo() {

    }

    public ResponseVo(int status, String statusText) {
        this.status = status;
        this.statusText = statusText;
    }

    public ResponseVo(int status, String statusText, T data) {
        this.status = status;
        this.statusText = statusText;
        this.data = data;
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusText() {
        return statusText;
    }

    public void setStatusText(String statusText) {
        this.statusText = statusText;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
