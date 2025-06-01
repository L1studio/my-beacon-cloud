package com.zlc.common.enums;

import lombok.Getter;

@Getter
public enum ExceptionEnums {

    ERROR_APIKEY(-1,"非法的apikey"),
    IP_NOT_WHITE(-2,"请求的ip不在白名单内"),
    ERROR_SIGN(-3,"无可用签名"),
    ERROR_TEMPLATE(-4,"无可用模板"),
    ERROR_MOBILE(-5,"手机号格式不正确"),
    BALANCE_NOT_ENOUGH(-6,"手客户余额不足"),
    PARAMETER_ERROR(-10,"参数不合法！");
    private Integer code;

    private String msg;

    ExceptionEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
