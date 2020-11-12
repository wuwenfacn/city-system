package com.demo.commons.vo;
import lombok.Data;

import java.util.Date;

@Data
public class CorderdetailsVo {
    /**
     * 下单时间
     */
    private Date orderTime;

    /**
     * 下单会员
     */
    private String username;

    /**
     * 下单门店
     */
    private String store;

    /**
     * 配送方式
     */
    private String distributionMode;

    /**
     * 配送时间
     */
    private Date deliveryTime;

    /**
     * 商品名
     */
    private String shopName;

    /**
     * 商品数量
     */
    private Integer num;

    /**
     * 订单编号
     */
    private Integer orderNumber;

}
