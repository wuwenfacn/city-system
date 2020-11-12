package com.demo.commons.vo;

import lombok.Data;

import java.util.Date;

@Data
public class BusinessVo {
    /**
     *
     */
    private Integer id;
    /**
     * 服务类型
     */
    private String businessType;
    /**
     * 基本信息-标签
     */
    private String label;
    /**
     * 价格设置-上架时间
     */
    private Date uptime;
    /**
     * 价格设置-价格
     */
    private String price;
    /**
     *
     */
    private Integer num;
}

