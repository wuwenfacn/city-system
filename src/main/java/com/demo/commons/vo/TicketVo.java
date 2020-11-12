package com.demo.commons.vo;

import lombok.Data;

import java.util.Date;

@Data
public class TicketVo {
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
    //商品名
    private String shopName;
    //数量
    private Integer num;
    //电话号码
    private Integer telephone;
    //收货地址
    private String location;
    //单价
    private Double price;
    //配送费
    private Double distribution;
    //总金额
    private double countMoney;

}
