package com.lyh.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * 类目
 * @author 刘元辉
 * @date 2020/2/21 12:39
 */
@Entity
@Proxy(lazy = false)
@DynamicUpdate//动态更新
@Data//自动get set toString
public class ProductCategory {

    /*类目ID*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*主键*/
    private Integer categoryId;
    /*类目名字*/
    private String categoryName;
    /*类目类型*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {}

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }


}
