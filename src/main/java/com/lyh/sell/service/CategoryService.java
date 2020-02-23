package com.lyh.sell.service;

import com.lyh.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author 刘元辉
 * @date 2020/2/22 18:23
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
