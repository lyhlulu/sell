package com.lyh.sell.service.impl;

import com.lyh.sell.dataobject.ProductInfo;
import com.lyh.sell.dto.CartDTO;
import com.lyh.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 刘元辉
 * @date 2020/2/22 23:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() throws Exception{
        ProductInfo productInfo = productService.findOne("1234");
        Assert.assertEquals("1234",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception{
        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception{
        Pageable pageable = PageRequest.of(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(pageable);
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception{
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(5.2));
        productInfo.setProductDescription("很好吃的虾");
        productInfo.setCategoryType(2);
        productInfo.setProductIcon("http://yyy.jpg");
        productInfo.setProductStock(200);
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());

        ProductInfo result = productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}