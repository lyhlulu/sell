package com.lyh.sell.enums;

import lombok.Getter;

/**
 * @author 刘元辉
 * @date 2020/2/22 22:46
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在架"),
    DOWN(1,"下架");

    private Integer code;

    private String massge;

    ProductStatusEnum(Integer code, String massge) {
        this.code = code;
        this.massge = massge;
    }
}
