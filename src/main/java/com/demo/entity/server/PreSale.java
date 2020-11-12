package com.demo.entity.server;

import java.util.Date;
import lombok.Data;

@Data
public class PreSale {
    /**
     * 商品id
     */
    private Integer shopId;

    /**
     * 商品名
     */
    private String shopName;

    /**
     * 开始时间
     */
    private Date beginTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 预售销量
     */
    private Integer saleNum;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 0是已结束 1是未结束
     */
    private Integer status;
}

