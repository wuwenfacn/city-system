package com.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class WCoupon implements Serializable {
    /**
     * 主键
     */
    private Integer cId;

    /**
     * 优惠券名
     */
    private String cName;

    /**
     * 优惠券描述
     */
    private String cDescribe;

    /**
     * 优惠券开始时间
     */
    private Date cStart;

    /**
     * 优惠券失效时间
     */
    private Date cEnd;

    /**
     * 优惠券面额
     */
    private BigDecimal cMoney;

    /**
     * 优惠券数量
     */
    private Integer cQuantity;

    /**
     * 满多少可用
     */
    private Integer cMinConsume;

    /**
     * 可用门店
     */
    private String cShop;

    /**
     * 外键,优惠券使用id
     */
    private Integer cUse;

    /**
     * 外键,产品id
     */
    private Integer pId;

    /**
     * 2表示实体券,1表示电子券
     */
    private Integer cType;

    /**
     * 1表示未删除,0表示已删除
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}

