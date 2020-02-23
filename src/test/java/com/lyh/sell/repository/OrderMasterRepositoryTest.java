package com.lyh.sell.repository;

import com.lyh.sell.dataobject.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 刘元辉
 * @date 2020/2/23 17:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository repository;

    final private String OPENID = "110110";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setBuyerAddress("慕课网");
        orderMaster.setBuyerName("师弟");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setBuyerPhone("18487388980");
        orderMaster.setOrderAmount(new BigDecimal(2.5));
        orderMaster.setOrderId("1234567");
        OrderMaster result = repository.save(orderMaster);

        Assert.assertNotNull(result);
    }

    @Test
    public void findByBuyerOpenid() {
        Pageable pageable = PageRequest.of(0,3);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID,pageable);
        Assert.assertNotEquals(0,result.getTotalElements());
    }
}