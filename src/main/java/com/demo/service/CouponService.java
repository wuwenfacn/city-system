package com.demo.service;

import com.demo.commons.requestEntity.CouponRequest;
import com.demo.entity.WCoupon;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-10  19:21
 * Description:
 */
public interface CouponService {

    boolean addCoupon(CouponRequest couponRequest);

    boolean deleteCoupon(Integer couponId);

    boolean updateCoupon(CouponRequest couponRequest);

    PageInfo selectCoupon(CouponRequest couponRequest, int page, int pagesize);

    List selectCouponRecord(int page, int size);
}
