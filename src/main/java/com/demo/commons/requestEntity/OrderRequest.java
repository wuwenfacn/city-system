package com.demo.commons.requestEntity;

import com.fasterxml.jackson.annotation.JsonProperty;
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

    /**
     * 商品名
     */
    @JsonProperty("id")
    private int pId;

    /**
     * 订单状态
     */
    @JsonProperty("status")
    private int status;

    /**
     * 订单类型
     */
    @JsonProperty("type")
    private int oType;

}
