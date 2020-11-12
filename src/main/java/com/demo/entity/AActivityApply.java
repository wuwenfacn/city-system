package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class AActivityApply implements Serializable {
    /**
     * 主键
     */
    private Integer aId;

    /**
     * 外键,活动id
     */
    private Integer actId;

    /**
     * 会员id
     */
    private Integer uId;

    /**
     * 门店名称
     */
    private String aShop;

    /**
     * 0未审核,1已审核
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}

