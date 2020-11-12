package com.demo.controller;

import com.demo.commons.requestEntity.CouponRequest;
import com.demo.commons.requestEntity.GroupBuyingRequest;
import com.demo.commons.utils.BaseResult;
import com.demo.service.GroupBuyingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author qiaoshu
 * Date: 2020-11-10  17:34
 * Description:
 *      团购服务
 */
@RestController
@RequestMapping("/gb")
public class GroupBuyingController {
    @Resource
    GroupBuyingService groupBuyingService;

    /**
     * 添加团购
     * @param groupBuyingRequest
     * @return
     */
    @PostMapping("/add")
    public BaseResult addCoupon(@RequestBody GroupBuyingRequest groupBuyingRequest){
        if (groupBuyingService.addCoupon(groupBuyingRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * 删除团购
     * @param groupBuyingRequest
     * @return
     */
    @PutMapping("/delete")
    public BaseResult deleteCoupon(@RequestBody GroupBuyingRequest groupBuyingRequest){
        if (groupBuyingService.deleteCoupon(groupBuyingRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    /**
     * update团购
     * @param groupBuyingRequest
     * @return
     */
    @PutMapping("/update")
    public BaseResult updateCoupon(@RequestBody GroupBuyingRequest groupBuyingRequest){
        if (groupBuyingService.updateCoupon(groupBuyingRequest)) {
            return BaseResult.success();
        }
        return BaseResult.error();
    }

    @GetMapping("/list")
    public BaseResult selectCoupon(
            GroupBuyingRequest groupBuyingRequest,
              @RequestParam(defaultValue = "1") int page,
              @RequestParam(defaultValue = "3") int size
            ){
        List list = groupBuyingService.selectCoupon(groupBuyingRequest,page,size);
        return BaseResult.success(list);
    }






}