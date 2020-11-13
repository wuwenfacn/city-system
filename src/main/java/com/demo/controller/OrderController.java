package com.demo.controller;

import com.demo.commons.requestEntity.OrderRequest;
import com.demo.commons.result.BaseResult;
import com.demo.service.impl.OrderServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-09  19:45
 * Description:
 *        订单服务
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderServiceImpl orderService;

    /**
     * 分页查询订单
     * @param orderRequest 产品id 订单状态
     * @param page 当前页
     * @param size 条数
     * @return
        http://localhost:8080/api/order/list?id=1&status=1&type=1&page=2&size=3
     */
    @GetMapping("/list")
    public BaseResult getOrderList(
            OrderRequest orderRequest,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "3") int size
    ){
        List list = orderService.getList(orderRequest, page, size);
        BaseResult success = BaseResult.success(list);
        return success;
    }
}
