package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

/*create table f_takeout_commodity
        (
        c_id int auto_increment primary key comment '外卖商品表主键id',
        c_name varchar(64) not null comment'外卖商品名称',
        c_type varchar(64) not null comment '菜单分类',
        c_img varchar(64) not null comment '商品图片',
        c_price double not null comment '价格',
        delete_status int(1) default 1 not null comment '是否删除，1表示正常，0表示已删除'
        )comment '外卖商品表';*/

/*外卖商品表*/

@Data
public class ShopTakeoutCommodity implements Serializable {
    /**
     * 外卖商品表主键id
     */
    private Integer cId;

    /**
     * 外卖商品名称
     */
    private String cName;

    /**
     * 菜单分类
     */
    private String cType;

    /**
     * 商品图片
     */
    private String cImg;

    /**
     * 价格
     */
    private Double cPrice;

    /**
     * 是否删除，1表示正常，0表示已删除
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

