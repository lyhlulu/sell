package com.lyh.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.apache.catalina.LifecycleState;

import java.util.List;

/**
 * @author 刘元辉
 * @date 2020/2/23 14:52
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
