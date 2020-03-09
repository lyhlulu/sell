package com.lyh.sell.controller;

import com.lly835.bestpay.model.PayResponse;
import com.lyh.sell.dto.OrderDTO;
import com.lyh.sell.enums.ResultEnum;
import com.lyh.sell.exception.SellException;
import com.lyh.sell.service.OrderService;
import com.lyh.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 支付
 * @author 刘元辉
 * @date 2020/3/6 16:32
 */
@Controller
@RequestMapping("/pay")
@Slf4j
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public String create(@RequestParam("orderId") String orderId,
                         @RequestParam("returnUrl") String returnUrl){
        //1、查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        //2、发起支付
//        PayResponse payResponse = payService.create(orderDTO);

//        return new ModelAndView("pay/create");

        return "xxxx";
    }

}
