package com.demo.entity;

import java.util.Date;
import lombok.Data;

/*create table f_shop
        (
        s_id int auto_increment primary key comment '门店编号',
        s_name varchar(64) not null comment '门店名称',
        s_reserve int default 1 not null comment '外卖或预定，1表示外卖，0表示预定',
        s_serve int default 1 not null comment '是否开启上门服务，1表示开启，0表示不开启',
        s_label varchar(64) not null comment '门店标签',
        s_logo varchar(255) not null comment '供应商标志图片',
        s_back_img varchar(255) not null comment '门店背景图片',
        s_product_img varchar(255) not null comment '门店产品图库',
        s_environment_img varchar(255) not null comment '门店环境图库',
        s_else_img varchar(255) not null comment '门店其他图库',
        s_business varchar(64) not null comment '行业分类',
        s_province varchar(64) not null comment '所在省份',
        s_city varchar(64) not null comment '所在城市',
        s_district varchar(64) not null comment '所在区域',
        s_trading varchar(64) not null comment '商圈',
        s_address varchar(255) not null comment '详细地址',
        s_path varchar(255) not null comment '交通路线',
        s_linkman varchar(64) not null comment '联系人',
        s_phone varchar(11) not null comment '联系电话',
        s_business_hours datetime not null comment '营业时间',
        s_brief varchar(255) not null comment '门店简介',
        s_status int(1) default 1 not null comment '下架状态，1表示上线，0表示下线',
        delete_status int(1) default 1 not null comment '删除状态，1表示未删除，0表示已删除'
        )comment '门店信息表';*/

@Data
public class ShopShop {
    /**
     * 门店编号
     */
    private Integer sId;

    /**
     * 门店名称
     */
    private String sName;

    /**
     * 外卖或预定，1表示外卖，0表示预定
     */
    private Integer sReserve;

    /**
     * 是否开启上门服务，1表示开启，0表示不开启
     */
    private Integer sServe;

    /**
     * 门店标签
     */
    private String sLabel;

    /**
     * 供应商标志图片
     */
    private String sLogo;

    /**
     * 门店背景图片
     */
    private String sBackImg;

    /**
     * 门店产品图库
     */
    private String sProductImg;

    /**
     * 门店环境图库
     */
    private String sEnvironmentImg;

    /**
     * 门店其他图库
     */
    private String sElseImg;

    /**
     * 行业分类
     */
    private String sBusiness;

    /**
     * 所在省份
     */
    private String sProvince;

    /**
     * 所在城市
     */
    private String sCity;

    /**
     * 所在区域
     */
    private String sDistrict;

    /**
     * 商圈
     */
    private String sTrading;

    /**
     * 详细地址
     */
    private String sAddress;

    /**
     * 交通路线
     */
    private String sPath;

    /**
     * 联系人
     */
    private String sLinkman;

    /**
     * 联系电话
     */
    private String sPhone;

    /**
     * 营业时间
     */
    private Date sBusinessHours;

    /**
     * 门店简介
     */
    private String sBrief;

    /**
     * 下架状态，1表示上线，0表示下线
     */
    /*private Integer sStatus;*/

    /**
     * 删除状态，1表示未删除，0表示已删除
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

