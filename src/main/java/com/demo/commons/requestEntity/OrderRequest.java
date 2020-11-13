package com.demo.commons.requestEntity;

import lombok.Data;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-09  20:18
 * Description:
 *      订单请求对象
 */
@Data
public class OrderRequest {

    private String name;
    /**
     * 订单状态
     */
    private int status;

    /**
     * 订单类型
     */
    private int otype;

}
