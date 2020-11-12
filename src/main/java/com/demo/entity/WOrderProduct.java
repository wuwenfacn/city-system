package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class WOrderProduct implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 订单id
     */
    private Integer oId;

    /**
     * 产品id
     */
    private Integer pId;

    /**
     * 产品数量
     */
    private Integer pQuantity;

    private static final long serialVersionUID = 1L;
}

