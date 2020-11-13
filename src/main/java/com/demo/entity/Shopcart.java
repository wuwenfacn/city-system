package com.demo.entity;

import java.math.BigDecimal;
import lombok.Data;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  14:24
 * Description:
 */
@Data
public class Shopcart {
    /**
    * 主键
    */
    private Integer cartId;

    /**
    * 购物车标题
    */
    private String cartTitle;

    /**
    * 商品id
    */
    private Integer productId;

    /**
    * 数量
    */
    private Integer quantity;

    /**
    * 商品单价
    */
    private BigDecimal unitPrice;

    /**
    * 总价
    */
    private BigDecimal totalPrice;

    /**
    * 1表示未删除,0表示已删除,2表示已失效
    */
    private Integer status;
}