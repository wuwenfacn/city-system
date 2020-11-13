package com.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

@Data
public class Products implements Serializable {
    /**
     * 商品id
     */
    /*private Long productId;*/

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品描述
     */
    private String detail;

    /**
     * 标签
     */
    private String tag;

    /**
     * 现价
     */
    private BigDecimal price;

    /**
     * 原价
     */
    private BigDecimal oldPrice;

    /**
     * 图片
     */
    private String image;

    /**
     * 商品颜色
     */
    private String sex;

    /**
     * 内存容量
     */
    private String capacity;

    /**
     * 商品类型
     */
    private String type;

    /**
     * 删除状态：0->已删除；1->正常
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

