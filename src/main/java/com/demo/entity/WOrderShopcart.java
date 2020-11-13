package com.demo.entity;

import lombok.Data;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  17:16
 * Description:
 */
@Data
public class WOrderShopcart {
    private Integer id;

    /**
    * 订单id
    */
    private Integer orderId;

    /**
    * 产品id
    */
    private Integer cartId;
}