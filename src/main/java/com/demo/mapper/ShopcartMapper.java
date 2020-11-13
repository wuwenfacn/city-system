package com.demo.mapper;

import com.demo.commons.requestEntity.ShopCartIdList;
import com.demo.entity.Shopcart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-13  14:24
 * Description:
 */
public interface ShopcartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(Shopcart record);

    int insertSelective(Shopcart record);

    Shopcart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Shopcart record);

    int updateByPrimaryKey(Shopcart record);

    int deleteByIds(List<Integer> list);
}