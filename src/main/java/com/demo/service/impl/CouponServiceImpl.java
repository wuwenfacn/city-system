package com.demo.service.impl;
import com.demo.commons.exception.ServiceException;
import com.demo.commons.requestEntity.CouponRequest;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.entity.CouponRecord;
import com.demo.entity.WCoupon;
import com.demo.mapper.CouponRecordMapper;
import com.demo.mapper.WCouponMapper;
import com.demo.service.CouponService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-10  19:22
 * Description:
 */
@Service
public class CouponServiceImpl implements CouponService {
    @Resource
    WCouponMapper couponMapper;
    @Resource
    CouponRecordMapper couponRecordMapper;

    /**
     * 添加优惠券
     * @param couponRequest
     * @return  true是添加成功,false是添加失败
     */
    @Override
    public boolean addCoupon(CouponRequest couponRequest) {
        WCoupon wCoupon = new WCoupon();
        BeanUtils.copyProperties(couponRequest,wCoupon);
        int i = 0;
        try {
           i = couponMapper.insertSelective(wCoupon);
        }catch (RuntimeException e){
           throw new ServiceException(ResultCodeEnum.SQL_INSERT_ERROR);
        }
        return i>0;
    }

    /**
     * 根据优惠券id删除
     * @param couponId
     * @return
     */
    @Override
    public boolean deleteCoupon(Integer couponId) {
        int i = 0;
        try {
            i = couponMapper.deleteByPrimaryKey(couponId);
        }catch (RuntimeException e){
            throw new ServiceException(ResultCodeEnum.SQL_DELETE_ERROR);
        }
        return i>0;
    }

    /**
     * update优惠券
     * @param couponRequest
     * @return
     */
    @Override
    public boolean updateCoupon(CouponRequest couponRequest) {
        WCoupon wCoupon = new WCoupon();
        BeanUtils.copyProperties(couponRequest,wCoupon);
        int i = 0;
        try {
            i = couponMapper.updateByPrimaryKeySelective(wCoupon);
        }catch (RuntimeException e){
            throw new ServiceException(ResultCodeEnum.SQL_UPDATE_ERROR);
        }
        return i>0;
    }

    /**
     * 分页查询优惠券信息
     * @param couponRequest  id 状态 类型
     * @param page
     * @param size
     * @return
     */
    @Override
    public PageInfo selectCoupon(CouponRequest couponRequest, int page, int size) {
        WCoupon wCoupon = new WCoupon();
        BeanUtils.copyProperties(couponRequest,wCoupon);
        PageHelper.startPage(page,size);
        List<WCoupon> list = couponMapper.selectAll(wCoupon);
        if (list==null){
            throw new ServiceException(ResultCodeEnum.SQL_SELECT_ERROR);
        }
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    @Override
    public List selectCouponRecord(int page, int size) {
        PageHelper.startPage(page,size);
        List<CouponRecord> couponRecords = couponRecordMapper.selectAll();
        PageInfo pageInfo = new PageInfo(couponRecords);
        List list = pageInfo.getList();
        return list;


    }


}
