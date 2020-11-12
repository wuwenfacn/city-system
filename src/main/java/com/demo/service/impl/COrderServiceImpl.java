package com.demo.service.impl;

import com.demo.commons.vo.*;
import com.demo.entity.Corder;
import com.demo.entity.Corderdetails;
import com.demo.mapper.OrderMapper;
import com.demo.service.COrderService;
import com.fasterxml.jackson.annotation.JsonFormat;



import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service
public class COrderServiceImpl implements COrderService {

    @Resource
    OrderMapper orderMapper;

    /*
    *
    * 查询所有订单
    * */

    @Override
    public ResponseEntity<OrdersVo> getAllOrder(int page, int size) {
        ResponseEntity<OrdersVo> responseEntity = new ResponseEntity<>();
        //分页处理，显示page的size条数据
        List<Corder> corder = orderMapper.selectAllOrder();
        //用PageInfo包装List查询结果,查看PageInfo源码,
        List<OrdersVo> orderVos=new ArrayList<>();
        //对查询结果进行检查 如果为空，就向上抛出异常
        OrdersVo orderVo = new OrdersVo();
        //对查询结果进行遍历 给包装类复赋值
        for (Corder cor:corder
        ) {
            orderVo=new OrdersVo();
            BeanUtils.copyProperties(cor,orderVo);
            orderVos.add(orderVo);
        }
        responseEntity.setMsg("success");
        responseEntity.setStatus(200);
        responseEntity.setData(orderVos);
        return responseEntity;
    }

    /**
     * 查询订单详情
     */
    @Override
    public ResponseEntity<DetailedVo> getDetailedOrder(int orderNumber){
        //返回的实体类
        ResponseEntity<DetailedVo> responseEntity = new ResponseEntity<>();
        //创建包装对象
        DetailedVo detailedVo = new DetailedVo();
        //包装----创建一个集合List<包装类型>
        List<DetailedVo> detailedVos=new ArrayList<>();
        //获取查询结果
        List<Corderdetails> corderdetails = orderMapper.selectOrderDetails(orderNumber);
        //通过遍历 把查询的结果给包装对象
        for (Corderdetails cor:corderdetails
        ) {
            detailedVo=new DetailedVo();
            BeanUtils.copyProperties(cor,detailedVo);
            detailedVos.add(detailedVo);
        }
        responseEntity.setStatus(200);
        responseEntity.setMsg("success");
        responseEntity.setData(detailedVos);
        return responseEntity;
    }

    @Override
    public ResponseEntity<TicketVo> getTicket(int orderNumber) {
        //创建响应的实体类对象
        ResponseEntity<TicketVo> responseEntity=new ResponseEntity<>();
        //创建保存结果集的集合
        List<TicketVo> ticket = new ArrayList<>();
        //获取结果
        ticket = orderMapper.getTicket(orderNumber);
        responseEntity.setStatus(200);
        responseEntity.setMsg("success");
        responseEntity.setData(ticket);

        return responseEntity;
    }
}
