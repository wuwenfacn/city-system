package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class WStock implements Serializable {
    /**
     *
     */
    private Integer sId;

    /**
     * 产品id
     */
    private Integer pId;

    /**
     * 库存数量
     */
    private Integer sQuantity;

    private static final long serialVersionUID = 1L;
}

