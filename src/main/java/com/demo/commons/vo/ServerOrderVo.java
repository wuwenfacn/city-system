package com.demo.commons.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ServerOrderVo {
    /**
     * 订单号
     */
    private String orderNumber;

    /**
     * 用户名
     */
    private String username;

    /**
     * 预约项目
     */
    private String project;

    /**
     * 服务地址
     */
    private String location;

    /**
     * 门店名称
     */
    private String store;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 预定服务时间
     */
    private Date scheduledTime;

    /**
     * 实际服务时间
     */
    private Date actualTime;

    /**
     * 支付尾款时间
     */
    private Date payTime;

    /**
     * 订单结算总额
     */
    private String countmoney;

    /**
     * 0表示待接单 1表示待服务 2表示服务中 3表示待付尾款 4表示待评价 5表示已完成
     */
    private Integer status;
}

