package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.entity.ShopMerchantType;
import com.demo.service.ShopMerchantTypeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/fmerchant")
public class ShopMerchantTypeController {
    @Resource
    ShopMerchantTypeService shopMerchantTypeService;

    /*
     * 添加外卖基础设置表信息
     * */

    /*{
        "mtype": "小炒",
            "mofficeTime": "10:00",
            "mclosingTime": "22:00",
            "mmode": "自动接单",
            "mshippingInformation":"5公里内免费",
            "mnotice":"xxx"
    }*/

    @PostMapping("/insertfmerchanttype")
    public BaseResult insertFMerchantType(@RequestBody ShopMerchantType shopMerchantType){
        int num = shopMerchantTypeService.insertFMerchantType(shopMerchantType);
        return BaseResult.success(num);
    }
}
