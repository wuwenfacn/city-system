package com.demo.service;

import com.demo.commons.vo.ShopUserAlterPasswordVo;
import com.demo.commons.vo.ShopUserAlterUserVo;
import com.demo.commons.vo.ShopUserLoginVo;
import com.demo.commons.vo.ShopUserRegisterVo;
import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.servlet.http.HttpServletRequest;

public interface ShopUserService {

    /*
     * 登录功能
     * */
    Boolean login(ShopUserLoginVo shopUserLoginVo, HttpServletRequest request);

    /*
     * 注销功能
     * */
    String off(HttpServletRequest request);

    /*
     * 注册功能
     * */
    int register(ShopUserRegisterVo shopUserRegisterVo);

    /*
     * 修改密码功能
     * */
    int alterPassword(ShopUserAlterPasswordVo shopUserAlterPasswordVo);

    /*
     * 修改个人信息
     * */
    int alterUser(ShopUserAlterUserVo shopUserAlterUserVo);
}
