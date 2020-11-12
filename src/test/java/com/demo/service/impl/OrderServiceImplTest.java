package com.demo.service.impl;

import com.demo.commons.requestEntity.OrderRequest;
import com.demo.commons.utils.BeanCopyUtil;
import com.demo.commons.vo.OrderVo;
import com.demo.entity.WOrder;
import com.demo.entity.WProduct;
import com.demo.mapper.WOrderMapper;
import com.demo.mapper.WProductMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-10  11:05
 * Description:
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml",
        "classpath:spring-mvc.xml",
        "classpath:spring-tx.xml",
        "classpath:spring-mybatis.xml",
                        })

public class OrderServiceImplTest {

    @Resource
    WOrderMapper wOrderMapper;
    @Resource
    WProductMapper wProductMapper;
    @Test
    public void getList() {

        OrderRequest orderRequest = new OrderRequest();
       /* orderRequest.setPId(1);
        orderRequest.setStatus(1);
        orderRequest.setOType(1);*/

        PageHelper.startPage(1,2);
        List<WOrder> wOrder = wOrderMapper.selectOrderByPid(orderRequest);
//        for (WOrder order : wOrder) {
//            System.out.println(order);
//        }
        PageInfo pageInfo = new PageInfo(wOrder);
        System.out.println(pageInfo);

    }

}