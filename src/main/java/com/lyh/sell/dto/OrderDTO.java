package com.lyh.sell.dto;

import com.lyh.sell.dataobject.OrderDetail;
import com.lyh.sell.enums.OrderStatusEnum;
import com.lyh.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 刘元辉
 * @date 2020/2/24 11:14
 */
@Data
public class OrderDTO {

    /** 订单id */
    @Id
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家电话 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认0新下单 */
    private Integer orderStatus;

    /** 支付状态，默认0未支付 */
    private Integer payStatus;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
