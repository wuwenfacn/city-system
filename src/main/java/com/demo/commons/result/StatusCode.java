package com.demo.commons.result;

import lombok.Getter;

@Getter
public enum StatusCode {
    SUCCESS(200, "success"),
    ERROR(404, "error"),
    SYS_ERROR(40000, "系统错误!!! 请稍后再试"),
    SERVER_ERROR(5000, "服务器错误"),
    //用户相关
    ACCOUNT_EXIST_ERROR(40020, "账号已存在!"),

    //    订单相关的异常
    ORDER_PRODUCT_OUT(40010, "没有此订单相关信息"),

    ORDER_PRODUCT_PRICE_CHANGE(40011, "价格发送改变!! 请重新下单");

    private int status;
    private String msg;

    StatusCode(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
