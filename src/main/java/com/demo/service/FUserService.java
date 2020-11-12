package com.demo.service;

import com.demo.commons.vo.FUserAlterPasswordVo;
import com.demo.commons.vo.FUserAlterUserVo;
import com.demo.commons.vo.FUserLoginVo;
import com.demo.commons.vo.FUserRegisterVo;

import javax.servlet.http.HttpServletRequest;

public interface FUserService {

    /*
     * 登录功能
     * */
    FUserLoginVo login(FUserLoginVo fUserLoginVo, HttpServletRequest request);

    /*
     * 注销功能
     * */
    String off(HttpServletRequest request);

    /*
     * 注册功能
     * */
    int register(FUserRegisterVo fUserRegisterVo);

    /*
     * 修改密码功能
     * */
    int alterPassword(FUserAlterPasswordVo fUserAlterPasswordVo);

    /*
     * 修改个人信息
     * */
    int alterUser(FUserAlterUserVo fUserAlterUserVo);
}
