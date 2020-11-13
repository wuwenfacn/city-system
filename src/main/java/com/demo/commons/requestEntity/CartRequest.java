package com.demo.commons.requestEntity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  14:29
 * Description:
 *      购物车请求体
 */
@Data
public class CartRequest {
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
