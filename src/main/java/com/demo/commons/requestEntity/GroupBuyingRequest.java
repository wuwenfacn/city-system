package com.demo.commons.requestEntity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  19:05
 * Description:
 *      团购请求对象
 */
@Data
public class GroupBuyingRequest {
    /**
     * 主键
     */
    private Integer gid;

    /**
     * 商品分类
     */
    private Integer proCls;

    /**
     * 团购支持门店
     */
    private String gshop;

    /**
     * 团购标题
     */
    private String gtitle;

    /**
     * 团购简称
     */
    private String gname;

    /**
     * 团购图片
     */
    private String gimage;

    /**
     * 团购标签
     */
    private String gtag;

    /**
     * 团购开始时间
     */
    private Date gstart;

    /**
     * 团购结束时间,不设置代表永久
     */
    private Date gend;

    /**
     * 团购成员数量
     */
    private Integer gnumber;

    /**
     * 优惠券id
     */
    private Integer couponId;

    /**
     * 团购商品id
     */
    private Integer productId;

    /**
     * 对某件商品的折扣
     */
    private BigDecimal discount;

    /**
     * 最大购买量
     */
    private Integer maxquantity;

    /**
     * 最小购买量
     */
    private Integer minquantity;

    /**
     * 虚拟购买量
     */
    private Integer inventedQuantity;

    /**
     * 1是未删除,0是已删除
     */
    private Integer status;

}
