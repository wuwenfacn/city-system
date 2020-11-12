package com.demo.controller;

import com.demo.commons.requestEntity.ActivityRequest;
import com.demo.commons.requestEntity.CouponRequest;
import com.demo.commons.utils.BaseResult;
import com.demo.service.impl.ActivityServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  09:31
 * Description:
 *          活动
 */
@RestController
@RequestMapping("/act")
public class ActivityController {
    @Resource
    ActivityServiceImpl activityService;

    /**
     * 添加活动
     * @param activityRequest
     * @return
     */
    @PostMapping("/add")
    public BaseResult addCoupon(@RequestBody ActivityRequest activityRequest){
        if (activityService.addActivity(activityRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * 删除活动
     * @param actid
     * @return
     */
    @GetMapping("/del")
    public BaseResult addCoupon(Integer actid){
        if (activityService.deleteActivity(actid)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * update活动
     * @param activityRequest
     * @return
     */
    @PostMapping("/update")
    public BaseResult updateCoupon(@RequestBody ActivityRequest activityRequest){
        if (activityService.updateActivity(activityRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    @GetMapping("/")
    public BaseResult selectActivity(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "3") int size
    ){
        List list = activityService.selectAll(page,size);
        return BaseResult.success(list);
    }

}
