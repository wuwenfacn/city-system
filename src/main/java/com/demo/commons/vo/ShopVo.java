package com.demo.commons.vo;

import lombok.Data;

@Data
public class ShopVo {
    /**
     * 商品id
     */
    private Integer id;

    /**
     * 商品名
     */
    private String shopName;

    /**
     * 商品价格
     */
    private Double price;

    /**
     * 打包费
     */
    private Double pack;

    /**
     * 配送费
     */
    private Double distribution;

}

