package com.demo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class WOrder implements Serializable {
    /**
     * 主键
     */
    private Integer oId;

    /**
     * 订单描述
     */
    private String oDiscribe;

    /**
     * 订单编号
     */
    private String oNo;

    /**
     * 订单创建时间
     */
    private Date oCreatetime;

    /**
     * 1是普通订单,2是团购订单
     */
    private Integer oType;

    /**
     * 0是已删除,1是待支付,2是已支付待发货,3是已发货,4是已关闭,5是失效订单
     */
    private Integer status;

    /**
     * 订单总价
     */
    private BigDecimal oPrice;

    /**
     * 外键,用户id
     */
    private Integer uId;

    /**
     * 快递信息
     */
    private String oDiliver;

    private List<WProduct> wProductLis;

    private static final long serialVersionUID = 1L;
}

