package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

/*create table f_user
        (
        u_id int auto_increment primary key comment '用户表主键id',
        u_username varchar(64) not null comment '账号',
        u_password varchar(64) not null comment '密码',
        shop_name varchar(64) not null comment '门店名称',
        business_license varchar(64) not null comment '营业执照',
        other_certification varchar(255) not null comment '其它资质',
        brand varchar(64) not null comment '商户商标',
        shop_img varchar(64) not null comment '门店图片',
        shop_type varchar(64) not null comment '门店分类',
        province varchar(20) not null comment '省',
        city varchar(20) not null comment '市',
        district varchar(20) not null comment '区',
        trading_area varchar(20) not null comment '商圈',
        address varchar(64)  not null comment '详细地址',
        phone varchar(11) not null comment '联系电话',
        contact_name varchar(10) not null comment '真实的名字',
        business_time varchar(20) not null comment '营业时间',
        delete_status int(1) default 1 not null comment '是否删除，1表示正常，0表示删除'
        )comment '用户表';*/

/*
* 用户信息表
* */

@Data
public class FUser implements Serializable {
    /**
     * 用户表主键id
     */
    private Integer uId;

    /**
     * 账号
     */
    private String uUsername;

    /**
     * 密码
     */
    private String uPassword;

    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 其它资质
     */
    private String otherCertification;

    /**
     * 商户商标
     */
    private String brand;

    /**
     * 门店图片
     */
    private String shopImg;

    /**
     * 门店分类
     */
    private String shopType;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;

    /**
     * 商圈
     */
    private String tradingArea;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 真实的名字
     */
    private String contactName;

    /**
     * 营业时间
     */
    private String businessTime;

    /**
     * 是否删除，1表示正常，0表示删除
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

