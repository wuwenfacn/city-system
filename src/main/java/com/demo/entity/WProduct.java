package com.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class WProduct implements Serializable {
    /**
     * 主键
     */
    private Integer pId;

    /**
     * 商品名称
     */
    private String pName;

    /**
     * 商品描述
     */
    private String pDescribe;

    /**
     * 可用门店
     */
    private String pShop;

    /**
     * 标签
     */
    private String pTag;

    /**
     * 上架时间
     */
    private Date onsaleTime;

    /**
     * 下架时间
     */
    private Date shelveTime;

    /**
     * 商品单价
     */
    private BigDecimal pPrice;

    /**
     * 0是已删除,1是未删除
     */
    private Integer status;

    /**
     * 商品类别
     */
    private Integer pClassification;

    /**
     * 1是用快递配送,0是无需配送
     */
    private Integer pDiliver;

    /**
     * 商品详细描述
     */
    private String pDetails;

    private static final long serialVersionUID = 1L;
}

