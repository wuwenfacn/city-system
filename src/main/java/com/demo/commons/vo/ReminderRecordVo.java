package com.demo.commons.vo;
import lombok.Data;

import java.util.Date;

@Data
public class ReminderRecordVo {

    /**
     * 门店
     */
    private String store;

    /**
     * 订单号
     */
    private Integer orderNumber;
    /**
     * 联系人
     */
    private String contacts;

    /**
     * 联系电话
     */
    private Integer telephone;

    /**
     * 配送地址
     */
    private String location;

    /**
     * 催单时间
     */
    private Date reminderRecordTime;
}

