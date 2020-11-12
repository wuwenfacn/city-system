package com.demo.mapper;

import com.demo.entity.WProduct;

import java.util.List;

/**
 * @Author qiaoshu
 * jdk8
 * Date: 2020-11-10  09:39
 * Description:
 */
public interface WProductMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(WProduct record);

    int insertSelective(WProduct record);

    WProduct selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(WProduct record);

    int updateByPrimaryKey(WProduct record);

    List<WProduct> selecAll(WProduct wProduct);
}