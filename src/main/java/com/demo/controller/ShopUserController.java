package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.*;
import com.demo.service.ShopUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.*;

@RestController
@RequestMapping("/user")
public class ShopUserController {
    @Resource
    ShopUserService shopUserService;

    /*
    * 登录功能
    * */
    @PostMapping("/login")
    public BaseResult login(@RequestBody ShopUserLoginVo shopUserLoginVo, HttpServletRequest request){
        Boolean flag = shopUserService.login(shopUserLoginVo, request);
        return BaseResult.success(flag);
    }

    /*
     * 注销功能
     * */
    @GetMapping("/off")
    public BaseResult off(HttpServletRequest request){
        String off = shopUserService.off(request);
        return BaseResult.success(off);
    }

    /*{
        "uusername": "3",
        "upassword": "3",
        "shopName": "3",
        "businessLicense": "3",
        "otherCertification": "3",
        "brand": "3",
        "shopImg": "3",
        "shopType": "3",
        "province": "3",
        "city": "3",
        "district": "3",
        "tradingArea": "3",
        "address": "3",
        "phone": "3",
        "contactName": "3",
        "businessTime": "3",
        "deleteStatus": 1
    }*/

    /*
    * 注册功能
    * */
    @PostMapping("/register")
    public BaseResult register(@RequestBody ShopUserRegisterVo shopUserRegisterVo){
        int num = shopUserService.register(shopUserRegisterVo);
        return BaseResult.success(num);
    }

    /*{
        "uid": 3,
        "upassword": "4"
    }*/

    /*
     * 修改密码功能
     * */
    @PutMapping("updatepassword")
    public BaseResult alterPassword(@RequestBody ShopUserAlterPasswordVo shopUserAlterPasswordVo){
        int num = shopUserService.alterPassword(shopUserAlterPasswordVo);
        return BaseResult.success(num);
    }

    /*{
        "uid": 3,
        "uusername": "4",
        "shopName": "3",
        "businessLicense": "3",
        "otherCertification": "3",
        "brand": "3",
        "shopImg": "3",
        "shopType": "3",
        "province": "3",
        "city": "3",
        "district": "3",
        "tradingArea": "3",
        "address": "3",
        "phone": "3",
        "contactName": "3",
        "businessTime": "3"
    }*/

    /*
    * 修改个人信息
    * */
    @PutMapping("updateuser")
    public BaseResult alterUser(@RequestBody ShopUserAlterUserVo shopUserAlterUserVo){
        int num = shopUserService.alterUser(shopUserAlterUserVo);
        return BaseResult.success(num);
    }
}
