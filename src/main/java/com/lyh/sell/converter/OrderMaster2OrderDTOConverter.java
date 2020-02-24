package com.lyh.sell.converter;

import com.lyh.sell.dataobject.OrderMaster;
import com.lyh.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 刘元辉
 * @date 2020/2/24 21:46
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO conver(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> conver(List<OrderMaster> orderMasterList){
        return orderMasterList.stream()
                .map(e -> conver(e))
                .collect(Collectors.toList());
    }
}
