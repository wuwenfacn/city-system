package com.demo.entity;

import lombok.Data;

@Data
public class Address {
    /**
     * 每条地址记录都有一个唯一id
     */
    private Integer id;

    /**
     * 会员昵称
     */
    private String username;

    /**
     * 收货地址
     */
    private String location;

    /**
     * 联系电话
     */
    private Integer telephone;
}

