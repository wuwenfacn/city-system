package com.demo.entity.server;

import lombok.Data;

import java.util.Date;

@Data
public class Business {
    /**
     *
     */
    private Integer id;

    /**
     * 服务类型
     */
    private String businessType;

    /**
     * 服务分类
     */
    private String businessClassification;

    /**
     * 支持门店
     */
    private String store;

    /**
     * 基本信息-标题
     */
    private String title;

    /**
     * 基本信息-图片
     */
    private String picture;

    /**
     * 基本信息-标签
     */
    private String label;

    /**
     * 价格设置-上架时间
     */
    private Date uptime;

    /**
     * 价格设置-下架时间
     */
    private Date down;

    /**
     * 价格设置-结算费率
     */
    private String setprice;

    /**
     * 价格设置-价格
     */
    private String price;

    /**
     * 价格设置-销售价
     */
    private String soldRice;

    /**
     * 价格设置-结算价
     */
    private String settlement;

    /**
     * 价格设置-定金
     */
    private String deposit;

    /**
     * PC端优惠券说明
     */
    private String pcDis;

    /**
     * 手机端优惠券说明
     */
    private String phoneDis;

    /**
     *
     */
    private Integer num;


}

