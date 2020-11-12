package com.demo.mapper;


import com.demo.commons.vo.TicketVo;
import com.demo.entity.Corder;
import com.demo.entity.Corderdetails;


import java.util.List;

public interface OrderMapper {
    /*
     * 查询所有订单
     * */
    List<Corder> selectAllOrder();
    /*
     * 查看订单详情  订单号 用户id
     * */
    List<Corderdetails> selectOrderDetails(int orderNumber);
    /*
    * 根据订单号生成小票
    * */
    List<TicketVo> getTicket(int orderNumber);
}
