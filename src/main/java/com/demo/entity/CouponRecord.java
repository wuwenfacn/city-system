package com.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CouponRecord implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 领取会员的id
     */
    private Integer uid;

    /**
     * 领取时间
     */
    private Date claimTime;

    /**
     * 过期时间
     */
    private Date expiredDate;

    /**
     * 消费时间
     */
    private Date usedTime;

    /**
     * 消费门店
     */
    private String shop;

    /**
     * 0表示已消费,1表示未消费,2表示已过期
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}

