package com.demo.mapper;

import com.demo.entity.WCoupon;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-10  17:40
 * Description:
 */
public interface WCouponMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(WCoupon record);

    int insertSelective(WCoupon record);

    WCoupon selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(WCoupon record);

    int updateByPrimaryKey(WCoupon record);

    List<WCoupon> selectAll(WCoupon wCoupon);
}