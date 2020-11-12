package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class WCouponProduct implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 优惠券id
     */
    private Integer cId;

    /**
     * 产品分类
     */
    private Integer pCate;

    /**
     * 产品id
     */
    private Integer pId;

    /**
     * 1是未删除,0是已删除
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}

