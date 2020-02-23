package com.lyh.sell.enums;

import lombok.Getter;

/**
 * @author 刘元辉
 * @date 2020/2/23 16:59
 */
@Getter
public enum OrderStatusEnum {
    NEw(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String mssage;

    OrderStatusEnum(Integer code, String mssage) {
        this.code = code;
        this.mssage = mssage;
    }
}
