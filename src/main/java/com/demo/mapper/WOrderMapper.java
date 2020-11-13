package com.demo.mapper;

import com.demo.commons.requestEntity.OrderRequest;
import com.demo.commons.vo.OrderVo;
import com.demo.entity.Shopcart;
import com.demo.entity.WOrder;

import java.util.List;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-10  09:24
 * Description:
 */
public interface WOrderMapper {
    int deleteByPrimaryKey(Integer oId);

    int insert(WOrder record);

    int insertSelective(WOrder record);

    List<OrderVo> selectOrderByPid(OrderRequest orderRequest);

    int updateByPrimaryKeySelective(WOrder record);

    int updateByPrimaryKey(WOrder record);
}