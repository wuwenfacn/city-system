package com.demo.service;

import com.demo.commons.vo.DetailedVo;
import com.demo.commons.vo.OrdersVo;
import com.demo.commons.vo.ResponseEntity;
import com.demo.commons.vo.TicketVo;

public interface COrderService {
    /*
    * 查询所有订单
    * */
    ResponseEntity<OrdersVo> getAllOrder(int start, int size);
    /*
    * 查询订单详情
    * */
    ResponseEntity<DetailedVo> getDetailedOrder(int orderNumber);

    /*
    * 根据订单号获取
    * */
    ResponseEntity<TicketVo> getTicket(int orderNumber);
}
