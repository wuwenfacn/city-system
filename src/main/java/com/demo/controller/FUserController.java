package com.demo.controller;

import com.demo.commons.result.BaseResult;
import com.demo.commons.vo.*;
import com.demo.service.FUserService;
import com.demo.service.impl.FUserServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

@RestController
@RequestMapping("/fuser")
public class FUserController {
    @Resource
    FUserService fUserService;

    @GetMapping("/login")
    public BaseResult login(@RequestBody FUserLoginVo fUserLoginVo,HttpServletRequest request){
        FUserLoginVo login = fUserService.login(fUserLoginVo,request);
        return BaseResult.success(login);
    }

    @GetMapping("/off")
    public String off(HttpServletRequest request){
        return fUserService.off(request);
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

    @PostMapping("/register")
    public BaseResult register(@RequestBody FUserRegisterVo fUserRegisterVo){
        int num = fUserService.register(fUserRegisterVo);
        return BaseResult.success(num);
    }

    /*{
        "uid": 3,
        "upassword": "4"
    }*/

    @PutMapping("alterPassword")
    public BaseResult alterPassword(@RequestBody FUserAlterPasswordVo fUserAlterPasswordVo){
        int num = fUserService.alterPassword(fUserAlterPasswordVo);
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

    @PutMapping("alterUser")
    public BaseResult alterUser(@RequestBody FUserAlterUserVo fUserAlterUserVo){
        int num = fUserService.alterUser(fUserAlterUserVo);
        return BaseResult.success(num);
    }
}
