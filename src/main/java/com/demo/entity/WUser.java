package com.demo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class WUser implements Serializable {
    /**
     * 主键
     */
    private Integer uId;

    /**
     * 用户名
     */
    private String uName;

    /**
     * 用户密码
     */
    private String uPassword;

    /**
     * 地区
     */
    private String uArea;

    /**
     * 手机
     */
    private String uPhone;

    /**
     * 职业
     */
    private String uJob;

    /**
     * 0是已删除,1是未删除
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}

