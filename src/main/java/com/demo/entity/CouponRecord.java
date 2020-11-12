package com.demo.entity;

import java.util.Date;
import lombok.Data;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  09:15
 * Description:
 */
/**
    * 优惠券记录表
    */
@Data
public class CouponRecord {
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
    * 0表示已消费,1表示未消费
    */
    private Integer status;
}