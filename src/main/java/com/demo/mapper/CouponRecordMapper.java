package com.demo.mapper;

import com.demo.entity.CouponRecord;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  09:15
 * Description:
 */
public interface CouponRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CouponRecord record);

    int insertSelective(CouponRecord record);

    CouponRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponRecord record);

    int updateByPrimaryKey(CouponRecord record);

    List<CouponRecord> selectAll();
}