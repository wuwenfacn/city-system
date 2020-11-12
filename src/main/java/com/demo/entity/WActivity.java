package com.demo.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class WActivity implements Serializable {
    /**
     *
     */
    private Integer aId;

    /**
     * 活动门店
     */
    private String aShop;

    /**
     * 活动名称
     */
    private String aName;

    /**
     * 图片
     */
    private String aImgs;

    /**
     * 开始时间
     */
    private Date aStart;

    /**
     * 结束时间
     */
    private Date aEnd;

    /**
     * 报名时间
     */
    private Date aStartapply;

    /**
     * 截止报名时间
     */
    private Date aEndapply;

    /**
     * 人数限制
     */
    private Integer aAmount;

    /**
     * 1是未删除,0是已删除
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}

