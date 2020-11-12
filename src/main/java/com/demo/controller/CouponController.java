package com.demo.controller;

import com.demo.commons.requestEntity.CouponRequest;
import com.demo.commons.result.BaseResult;
import com.demo.service.impl.CouponServiceImpl;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-10  17:40
 * Description:
 *      优惠券服务
 */
@RestController
@RequestMapping("/coupon")
public class CouponController {

    @Resource
    CouponServiceImpl couponService;

    /**
     * 添加优惠券
     * @param couponRequest
     * @return
     */
    @PostMapping("/add")
    public BaseResult addCoupon(@RequestBody CouponRequest couponRequest){
        if (couponService.addCoupon(couponRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * 删除优惠券
     * @param couponId
     * @return
     */
    @GetMapping("/delete")
    public BaseResult deleteCoupon(int couponId){

        if (couponService.deleteCoupon(couponId)) {
            return BaseResult.success();
        }

        return BaseResult.error();
    }

    /**
     *  修改优惠券
     * @param couponRequest
     * @return
     */
    @PutMapping("/update")
    public BaseResult updateCoupon(@RequestBody CouponRequest couponRequest){

        System.out.println(couponRequest);
        if (couponService.updateCoupon(couponRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * 分页查询优惠券
     * @return
     */
    @GetMapping("/list")
    public BaseResult selectCoupon(
            CouponRequest couponRequest,
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "3") int size
    ){
        PageInfo pageInfo = couponService.selectCoupon(couponRequest, page, size);
        return BaseResult.success(pageInfo);
    }

    /**
     * 分页查询优惠券领取和使用情况
     * @param page
     * @param size
     * @return
     */
    @GetMapping("/record")
    public BaseResult selectCouponRecord(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "3") int size
    ){
        List list = couponService.selectCouponRecord(page, size);
        return BaseResult.success(list);
    }


}
