package com.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/*create table f_takeout_appointment
        (
        a_id int auto_increment primary key comment '外卖预约表主键id',
        a_name varchar(64) not null comment '预约的名称',
        a_price double not null comment '定金',
        a_time datetime not null comment '预约的时间',
        a_number int not null comment '预约的数量',
        a_remark varchar(255) not null comment '备注',
        delete_status int(1) default 1 not null comment '是否删除，1表示正常，0表示已删除'
        )comment '外卖预约表';*/

/*外卖预约表*/

@Data
public class ShopTakeoutAppointment implements Serializable {
    /**
     * 外卖预约表主键id
     */
    private Integer aId;

    /**
     * 预约的名称
     */
    private String aName;

    /**
     * 定金
     */
    private Double aPrice;

    /**
     * 预约的时间
     */
    private Date aTime;

    /**
     * 预约的数量
     */
    private Integer aNumber;

    /**
     * 备注
     */
    private String aRemark;

    /**
     * 是否删除，1表示正常，0表示已删除
     */
    /*private Integer deleteStatus;*/

    private static final long serialVersionUID = 1L;
}

