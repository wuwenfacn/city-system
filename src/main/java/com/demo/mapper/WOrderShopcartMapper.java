package com.demo.mapper;

import com.demo.entity.WOrderShopcart;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  17:16
 * Description:
 */
public interface WOrderShopcartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WOrderShopcart record);

    int insertSelective(WOrderShopcart record);

    WOrderShopcart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WOrderShopcart record);

    int updateByPrimaryKey(WOrderShopcart record);
}