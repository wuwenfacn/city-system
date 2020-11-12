package com.demo.entity;


import lombok.Data;

import java.util.Date;
@Data
public class Corder {
    /**
     * 订单号
     */
    private Integer orderNumber;

    /**
     * 交易时间
     */
   /* @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")*/
    private Date transactionData;

    /**
     * 下单会员（用户名）
     */
    private String username;

    /**
     * 订单金额
     */
    private Double amount;

    /**
     * 0是未完成 1是完成 2是交易关闭 3是已接单 4是未接单
     */
    private Integer status;

    /**
     *
     */
    private Integer id;

}

