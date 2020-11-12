package com.demo.mapper;

import com.demo.entity.Groupbuying;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-11  19:36
 * Description:
 */
public interface GroupbuyingMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Groupbuying record);

    int insertSelective(Groupbuying record);

    List<Groupbuying> selectByPrimaryKey(Groupbuying groupbuying);

    int updateByPrimaryKeySelective(Groupbuying record);

    int updateByPrimaryKey(Groupbuying record);
}