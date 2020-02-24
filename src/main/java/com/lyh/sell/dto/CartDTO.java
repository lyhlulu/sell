package com.lyh.sell.dto;

import lombok.Data;

/**
 * @author 刘元辉
 * @date 2020/2/24 19:16
 */
@Data
public class CartDTO {

    /** 商品id */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
