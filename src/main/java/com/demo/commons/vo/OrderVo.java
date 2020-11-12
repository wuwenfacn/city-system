package com.demo.commons.vo;

import com.demo.entity.WProduct;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-09  20:35
 * Description:
 */
@Data
public class OrderVo {
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
     * 外键,产品id
     */
    private Integer pId;

    /**
     * 外键,用户id
     */
    private Integer uId;

    /**
     * 外键,优惠券id
     */
    private Integer cId;

    /**
     * 商品数量
     */
    private Integer oQuantity;

    /**
     * 快递信息
     */
    private String oDiliver;

    private List<WProduct> products;
}
