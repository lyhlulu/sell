package com.lyh.sell.enums;

import lombok.Getter;

/**
 * @author 刘元辉
 * @date 2020/2/23 17:04
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功")
    ;

    private Integer code;

    private String mssage;

    PayStatusEnum(Integer code, String mssage) {
        this.code = code;
        this.mssage = mssage;
    }
}
