package com.demo.controller;

import com.demo.commons.vo.*;
import com.demo.service.COrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order")
public class AllOrderController {
    @Resource
    COrderService orderService;
    /*
    * 分页获取所有的订单
    * */
    @GetMapping("/all")
    public ResponseEntity<OrdersVo> allOrder(int page, int size){
        return orderService.getAllOrder(page,size);
    }
    /**
     * 订单详情
     */
    @GetMapping("/detailed")
    public  ResponseEntity<DetailedVo> detailedOrder(@RequestParam int orderNumber){
        return orderService.getDetailedOrder(orderNumber);
    }
    /*
    * 打印小票
    * */
    @GetMapping("/ticket")
    public ResponseEntity<TicketVo> Ticket(int orderNumber){
        return orderService.getTicket(orderNumber);
    }

}
