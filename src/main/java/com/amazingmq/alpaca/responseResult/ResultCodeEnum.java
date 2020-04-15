package com.amazingmq.alpaca.responseResult;

import lombok.Getter;

/**
 * 结果枚举类
 */
@Getter
public enum ResultCodeEnum {
    SUCCESS(true,20000,"成功"),
    UNKNOWN_ERROR(false,50000,"未知错误"),
    PARAM_ERROR(false,50001,"参数错误"),
    NULL_POINT(false,50002,"空指针异常"),
    HTTP_CLIENT_ERROR(false,50003,"Http客户端错误异常"),
    ACCESS_LIMIT_REACHED(false,50004,"超出访问次数"),
    ;
    //响应是否成功
    private Boolean success;
    //响应状态码
    private Integer code;
    //响应信息
    private String message;

    ResultCodeEnum(Boolean success, Integer code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }
}
