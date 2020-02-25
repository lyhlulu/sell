package com.lyh.sell.service;

import com.lyh.sell.dto.OrderDTO;

/**
 * 买家
 * @author 刘元辉
 * @date 2020/2/25 21:20
 */
public interface BuyerService {

    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);

}
