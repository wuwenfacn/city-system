package com.demo.commons.requestEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author qiaoshu
 * Date: 2020-11-10  17:42
 * Description:
 *      消费券请求对象
 */
@Data
public class CouponRequest {


    /**
     * 主键
     */
    @JsonProperty(value = "cid")
    private Integer cId;
    /**
     * 优惠券名
     */
    @JsonProperty(value = "cname")
    private String cName;

    /**
     * 优惠券描述
     */
    @JsonProperty(value = "cdescribe")
    private String cDescribe;

    /**
     * 优惠券开始时间*/

    @JsonProperty(value = "cstart")
    private Date cStart;

    /**
     * 优惠券失效时间*/

    @JsonProperty(value = "cend")
    private Date cEnd;

  /*  *
     * 优惠券面额*/

    @JsonProperty(value = "cmoney")
    private BigDecimal cMoney;

    /**
     * 优惠券数量*/

    @JsonProperty(value = "cquantity")
    private Integer cQuantity;

   /**满多少可用*/

    @JsonProperty(value = "cminconsume")
    private Integer cMinConsume;

    /**
     * 可用门店*/

    @JsonProperty(value = "cshop")
    private String cShop;

    /**
     * 外键,优惠券适用服务类型*/

    @JsonProperty(value = "cuse")
    private Integer cUse;
/*
    *
     * 外键,产品id
     */
    @JsonProperty(value = "pid")
    private Integer pId;

   /* *
     * 2表示实体券,1表示电子券
     */
    @JsonProperty(value = "ctype")
    private Integer cType;

}


/*

    {
        "cid":1,
        "cname":"双11促销券",
        "cdescribe":"所有店铺可用",
        "cmoney":150,
        "cquantity":100,
        "cminConsume":300,
        "cshop":"天河店",
        "cuse":1,
        "pid":1,
        "ctype":2
    }
*/