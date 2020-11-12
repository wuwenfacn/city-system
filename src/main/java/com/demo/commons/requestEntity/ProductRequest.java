package com.demo.commons.requestEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  11:28
 * Description:
 *      商品请求对象
 */
@Data
public class ProductRequest {
    /**
     * 主键
     */
    @JsonProperty(value = "pId")
    private Integer pId;

    /**
     * 商品名称
     */
    @JsonProperty(value = "pName")
    private String pName;

    /**
     * 商品描述
     */
    @JsonProperty(value = "pDescribe")
    private String pDescribe;

    /**
     * 可用门店
     */
    @JsonProperty(value = "pShop")
    private String pShop;

    /**
     * 标签
     */
    @JsonProperty(value = "pTag")
    private String pTag;

    /**
     * 上架时间
     */
    @JsonProperty(value = "onsaleTime")
    private Date onsaleTime;

    /**
     * 下架时间
     */
    @JsonProperty(value = "shelveTime")
    private Date shelveTime;

    /**
     * 商品单价
     */
    @JsonProperty(value = "pPrice")
    private BigDecimal pPrice;

    /**
     * 0是已删除,1是未删除
     */
    @JsonProperty(value = "status")
    private Integer status;

    /**
     * 商品类别
     */
    @JsonProperty(value = "pClassification")
    private Integer pClassification;

    /**
     * 1是用快递配送,0是无需配送
     */
    @JsonProperty(value = "pDiliver")
    private Integer pDiliver;

    /**
     * 商品详细描述
     */
    @JsonProperty(value = "pDetails")
    private String pDetails;




}
/*

 "pId":1,
 "pName":"华为mate30",
 "pDescribe":"手机描述",
 "pShop":"天河店",
 "pTag":"允许自提",
"onsaleTime":111214545,
"shelveTime":1254524554,
"pPrice":100.00,
 "pClassification":1,
 "pDiliver":1,
"pDetails":"这个描述"






*/