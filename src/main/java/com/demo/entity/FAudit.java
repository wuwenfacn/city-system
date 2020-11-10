package com.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/*create table f_audit
        (
        a_id int auto_increment primary key comment '审核主键id',
        s_id int not null comment '门店编号外键id',
        a_name varchar(64) not null comment '门店名称',
        a_reserve int default 1 not null comment '外卖或预定，1表示外卖，0表示预定',
        a_serve int default 1 not null comment '是否开启上门服务，1表示开启，0表示不开启',
        a_label varchar(64) not null comment '门店标签',
        a_business varchar(64) not null comment '行业分类',
        a_province varchar(64) not null comment '所在省份',
        a_city varchar(64) not null comment '所在城市',
        a_district varchar(64) not null comment '所在区域',
        a_trading varchar(64) not null comment '商圈',
        a_address varchar(255) not null comment '详细地址',
        a_submission_time timestamp comment '提交时间',
        a_type int default null comment '审核类型，1表示发布申请，2表示修改审核申请，3表示资料更新申请，4表示上架申请，5表示下架申请，6表示删除申请',
        a_status int default 2 comment '审核状态，0表示取消，1表示已审核，2表示未审核',
        a_pass int default null comment '是否通过，0表示未通过，1表示已通过',
        a_pass_reason varchar(255) default null comment '是否通过的理由'
        )comment '审核表';*/

@Data
public class FAudit implements Serializable {
    /**
     * 审核主键id
     */
    private Integer aId;

    /**
     * 门店编号外键id
     */
    private Integer sId;

    /**
     * 门店名称
     */
    private String aName;

    /**
     * 外卖或预定，1表示外卖，0表示预定
     */
    private Integer aReserve;

    /**
     * 是否开启上门服务，1表示开启，0表示不开启
     */
    private Integer aServe;

    /**
     * 门店标签
     */
    private String aLabel;

    /**
     * 行业分类
     */
    private String aBusiness;

    /**
     * 所在省份
     */
    private String aProvince;

    /**
     * 所在城市
     */
    private String aCity;

    /**
     * 所在区域
     */
    private String aDistrict;

    /**
     * 商圈
     */
    private String aTrading;

    /**
     * 详细地址
     */
    private String aAddress;

    /**
     * 提交时间
     */
    private Date aSubmissionTime;

    /**
     * 审核类型，1表示发布申请，2表示修改审核申请，3表示资料更新申请，4表示上架申请，5表示下架申请
     */
    private Integer aType;

    /**
     * 审核状态，0表示取消，1表示已审核，2表示未审核
     */
    private Integer aStatus;

    /**
     * 是否通过，0表示未通过，1表示已通过
     */
    private Integer aPass;

    /**
     * 是否通过的理由
     */
    private String aPassReason;

    private static final long serialVersionUID = 1L;
}

