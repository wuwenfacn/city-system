package com.demo.service;

import com.demo.commons.requestEntity.OrderRequest;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-09  19:50
 * Description:
 *      订单服务
 */
public interface OrderService {

    /**
     * 根据产品id和订单状态 分页 查 订单详情
     * @param orderRequest
     * @param page  当前页
     * @param size  条数
     * @return
     */
    List getList(OrderRequest orderRequest, int page, int size);


}
