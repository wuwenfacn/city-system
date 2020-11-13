package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.requestEntity.OrderRequest;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.vo.OrderVo;
import com.demo.entity.WOrder;
import com.demo.mapper.WOrderMapper;
import com.demo.service.OrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-09  21:06
 * Description:
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private WOrderMapper wOrderMapper;

    /**
     * 根据产品id和订单状态 分页 查 订单详情
     * @param orderRequest
     * @param page  当前页
     * @param size  条数
     * @return
     */
    @Override
    public List getList(OrderRequest orderRequest, int page, int size) {
        PageHelper.startPage(page,size);
        List<OrderVo> list1 = wOrderMapper.selectOrderByPid(orderRequest);
        if (list1.size()<1) {
            throw new ServiceException(ResultCodeEnum.SQL_SELECT_ERROR);
        }
        PageInfo info = new PageInfo(list1);
        List list = info.getList();
        return list;
    }
}
