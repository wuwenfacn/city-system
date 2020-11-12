package com.demo.commons.requestEntity;

import java.util.Date;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  09:38
 * Description:
 */
public class ActivityRequest {
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
}
