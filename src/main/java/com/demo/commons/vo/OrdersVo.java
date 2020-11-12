package com.demo.commons.vo;


import lombok.Data;

import java.util.Date;
/*
* 包装查询的订单表
*   实际上就是实体类
* */

@Data
public class OrdersVo {
    //订单号
    private Integer orderNumber;
    //交易时间
    private Date transactionData;
    //下单会员
    private String  username;
    //订单金额
    private double amount;
    //交易状态
    private Integer status;
    //用户id
    private Integer id;

}
