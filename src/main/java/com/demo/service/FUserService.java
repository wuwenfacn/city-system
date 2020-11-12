package com.demo.service;

import com.demo.commons.vo.FUserAlterPasswordVo;
import com.demo.commons.vo.FUserAlterUserVo;
import com.demo.commons.vo.FUserLoginVo;
import com.demo.commons.vo.FUserRegisterVo;
import com.demo.entity.FUser;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletRequest;

public interface FUserService {

    FUserLoginVo login(FUserLoginVo fUserLoginVo, HttpServletRequest request);

    String off(HttpServletRequest request);

    int register(FUserRegisterVo fUserRegisterVo);

    int alterPassword(FUserAlterPasswordVo fUserAlterPasswordVo);

    int alterUser(FUserAlterUserVo fUserAlterUserVo);
}
