package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.FUserAlterPasswordVo;
import com.demo.commons.vo.FUserAlterUserVo;
import com.demo.commons.vo.FUserLoginVo;
import com.demo.commons.vo.FUserRegisterVo;
import com.demo.entity.FUser;
import com.demo.mapper.FUserMapper;
import com.demo.service.FUserService;
import com.mysql.cj.Session;
import com.sun.deploy.security.WSeedGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class FUserServiceImpl implements FUserService {
    @Resource
    FUserMapper fUserMapper;

    @Override
    public FUserLoginVo login(FUserLoginVo fUserLoginVo,HttpServletRequest request) {
        HttpSession session = request.getSession();
        if(fUserLoginVo.getUUsername() == null || fUserLoginVo.getUUsername() == "" ||
                fUserLoginVo.getUPassword() == null || fUserLoginVo.getUPassword() == ""){
            throw new ServiceException(ResultCodeEnum.PARAMS_NOT_IS_BLANK);
        }
        if(fUserMapper.checkUserByName(fUserLoginVo.getUUsername()) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_EXIST);
        }
        FUser login = fUserMapper.login(fUserLoginVo);
        if(login == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_LOGIN_ERROR);
        }
        if(session.getAttribute("admin") == null){
            session.setAttribute("admin",fUserLoginVo.getUUsername());
            session.setMaxInactiveInterval(60*60);
        }else {
            throw new ServiceException(ResultCodeEnum.ACCOUNT_IS_LOGIN);
        }
        FUserLoginVo fUserLoginVo1 = BeanConvertUtils.convertTo(login, FUserLoginVo::new);
        return fUserLoginVo1;
    }

    @Override
    public String off(HttpServletRequest request){
        HttpSession session = request.getSession();
        if(session.getAttribute("admin") != null){
            session.invalidate();
        }
        return "session清除成功！";
    }

    @Override
    public int register(FUserRegisterVo fUserRegisterVo) {
        if(fUserMapper.checkUserByName(fUserRegisterVo.getUUsername()) != null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_IS_EXISTENT);
        }
        int num = fUserMapper.register(fUserRegisterVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return num;
    }

    @Override
    public int alterPassword(FUserAlterPasswordVo fUserAlterPasswordVo) {
        if(fUserMapper.checkUserByuId(fUserAlterPasswordVo.getUId()) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_EXIST);
        }
        int num = fUserMapper.alterPassword(fUserAlterPasswordVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    @Override
    public int alterUser(FUserAlterUserVo fUserAlterUserVo) {
        int num = fUserMapper.alterUser(fUserAlterUserVo);
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
