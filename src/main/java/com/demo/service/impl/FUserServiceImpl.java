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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class FUserServiceImpl implements FUserService {
    @Resource
    FUserMapper fUserMapper;

    /*
     * 登录功能
     * */
    @Override
    public FUserLoginVo login(FUserLoginVo fUserLoginVo, HttpServletRequest request) {
        /*
        * 创建session
        * */
        HttpSession session = request.getSession();
        /*
        * 如果前端传来的数据是空的，就抛出异常 “参数不能为空”
        * */
        if(fUserLoginVo.getUUsername() == null || fUserLoginVo.getUUsername() == "" ||
                fUserLoginVo.getUPassword() == null || fUserLoginVo.getUPassword() == ""){
            throw new ServiceException(ResultCodeEnum.PARAMS_NOT_IS_BLANK);
        }
        /*if(fUserMapper.checkUserByName(fUserLoginVo.getUUsername()) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_EXIST);
        }*/
        FUser login = fUserMapper.login(fUserLoginVo);
        /*
        * 如果数据库返回的数据为空，则抛出异常 “账号或密码错误”
        * */
        if(login == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_LOGIN_ERROR);
        }
        /*
        * 将登录的账号保存到session
        * 如果session为空则保存
        * 如果session不为空则抛出异常 “用户已登录”
        * */
        if(session.getAttribute("admin") == null){
            session.setAttribute("admin",fUserLoginVo.getUUsername());
            session.setMaxInactiveInterval(60*60);
        }else {
            throw new ServiceException(ResultCodeEnum.ACCOUNT_IS_LOGIN);
        }
        FUserLoginVo fUserLoginVo1 = BeanConvertUtils.convertTo(login, FUserLoginVo::new);
        return fUserLoginVo1;
    }

    /*
     * 注销功能
     * */
    @Override
    public String off(HttpServletRequest request){
        HttpSession session = request.getSession();
        /*
        * 清除session
        * */
        if(session.getAttribute("admin") != null){
            session.invalidate();
        }
        return "session清除成功！";
    }

    /*
     * 注册功能
     * */
    @Override
    @Transactional
    public int register(FUserRegisterVo fUserRegisterVo) {
        /*
        * 将注册的账号传到数据库中进行判断，存在则抛出异常 “账号已存在”
        * */
        if(fUserMapper.checkUserByName(fUserRegisterVo.getUUsername()) != null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_IS_EXISTENT);
        }
        int num = fUserMapper.register(fUserRegisterVo);
        /*
        * 注册失败抛出异常 “系统繁忙，请稍后重试”
        * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.SYSTEM_INNER_ERROR);
        }
        return num;
    }

    /*
     * 修改密码功能
     * */
    @Override
    @Transactional
    public int alterPassword(FUserAlterPasswordVo fUserAlterPasswordVo) {
        /*
        * 修改密码传入的是id和新密码
        * 如果id在数据库中不存在，则抛出异常 “账号不存在!”
        * */
        if(fUserMapper.checkUserByuId(fUserAlterPasswordVo.getUId()) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_EXIST);
        }
        int num = fUserMapper.alterPassword(fUserAlterPasswordVo);
        /*
        * 修改失败则抛出异常 “数据错误”
        * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }

    /*
     * 修改个人信息
     * */
    @Override
    @Transactional
    public int alterUser(FUserAlterUserVo fUserAlterUserVo) {
        int num = fUserMapper.alterUser(fUserAlterUserVo);
        /*
         * 修改失败则抛出异常 “数据错误”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
