package com.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/*create table f_merchant_type
        (
        m_id int auto_increment primary key comment '商家分类表主键id',
        m_type varchar(64) not null comment '外卖商家分类',
        m_office_time varchar(64) not null comment '开始营业时间',
        m_closing_time varchar(64) not null comment '结束营业时间',
        m_mode varchar(64) not null comment '外卖配送方式',
        m_shipping_information varchar(64) not null comment '外卖配送信息',
        m_notice varchar(255) not null comment '商家公告',
        delete_status int(1) default 1 not null comment '是否删除，1表示正常，0表示已删除'
        )comment '商家分类表';*/

/*外卖基础设置表*/

@Data
public class ShopMerchantType implements Serializable {
    /**
     * 商家分类表主键id
     */
    /*private Integer mId;*/

    /**
     * 外卖商家分类
     */
    private String mType;

    /**
     * 开始营业时间
     */
    private String mOfficeTime;

    /**
     * 结束营业时间
     */
    private String mClosingTime;

    /**
     * 外卖配送方式
     */
    private String mMode;

    /**
     * 外卖配送信息
     */
    private String mShippingInformation;

    /**
     * 商家公告
     */
    private String mNotice;

    /**
     * 是否删除，1表示正常，0表示已删除
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

