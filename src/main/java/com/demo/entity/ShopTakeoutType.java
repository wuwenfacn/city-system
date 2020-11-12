package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

/*create table f_takeout_type
        (
        t_id int auto_increment primary key comment '外卖分类表主键id',
        t_name varchar(64) not null comment '分类名称',
        t_sort int default 10 not null comment '排序，默认为10，1最大',
        t_state int(1) default 1 not null comment '状态，1表示可用，0表示不可用',
        delete_status int(1) default 1 not null comment '是否删除，1表示正常，0表示已删除'
        )comment '外卖分类表';*/

/*外卖分类表*/

@Data
public class ShopTakeoutType implements Serializable {
    /**
     * 外卖分类表主键id
     */
    private Integer tId;

    /**
     * 分类名称
     */
    private String tName;

    /**
     * 排序，默认为10，1最大
     */
    private Integer tSort;

    /**
     * 状态，1表示可用，0表示不可用
     */
    private Integer tState;

    /**
     * 是否删除，1表示正常，0表示已删除
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

