package com.lyh.sell.exception;

import com.lyh.sell.enums.ResultEnum;

/**
 * @author 刘元辉
 * @date 2020/2/24 18:39
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMassge());

        this.code = resultEnum.getCode();
    }

    public SellException(ResultEnum resultEnum, String message){
        super(message);

        this.code = resultEnum.getCode();
    }
}
