package com.demo.service.impl;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import com.demo.commons.utils.BeanConvertUtils;
import com.demo.commons.vo.ShopUserAlterPasswordVo;
import com.demo.commons.vo.ShopUserAlterUserVo;
import com.demo.commons.vo.ShopUserLoginVo;
import com.demo.commons.vo.ShopUserRegisterVo;
import com.demo.entity.ShopUser;
import com.demo.mapper.ShopUserMapper;
import com.demo.service.ShopUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Service
public class ShopUserServiceImpl implements ShopUserService {
    @Resource
    ShopUserMapper shopUserMapper;

    /*
     * 登录功能
     * */
    @Override
    public ShopUserLoginVo login(ShopUserLoginVo shopUserLoginVo, HttpServletRequest request) {
        /*
        * 创建session
        * */
        HttpSession session = request.getSession();
        /*
        * 如果前端传来的数据是空的，就抛出异常 “参数不能为空”
        * */
        if(shopUserLoginVo.getUsername() == null || shopUserLoginVo.getUsername() == "" ||
                shopUserLoginVo.getPassword() == null || shopUserLoginVo.getPassword() == ""){
            throw new ServiceException(ResultCodeEnum.PARAMS_NOT_IS_BLANK);
        }
        /*
        * 先验证账号是否存在，不存在则抛出异常 “账号或密码错误”
        * */
        if(shopUserMapper.checkUserByName(shopUserLoginVo.getUsername()) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_LOGIN_ERROR);
        }
        ShopUser login = shopUserMapper.login(shopUserLoginVo);
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
            session.setAttribute("admin", shopUserLoginVo.getUsername());
            session.setMaxInactiveInterval(60*60);
        }else {
            throw new ServiceException(ResultCodeEnum.ACCOUNT_IS_LOGIN);
        }
        /*FUserLoginVo fUserLoginVo1 = BeanConvertUtils.convertTo(login, FUserLoginVo::new);*/
        ShopUserLoginVo shopUserLoginVo1 = BeanConvertUtils.convertTo(login, ShopUserLoginVo::new);
        return shopUserLoginVo1;
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
    public int register(ShopUserRegisterVo shopUserRegisterVo) {
        /*
        * 将注册的账号传到数据库中进行判断，存在则抛出异常 “账号已存在”
        * */
        if(shopUserMapper.checkUserByName(shopUserRegisterVo.getUsername()) != null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_IS_EXISTENT);
        }
        int num = shopUserMapper.register(shopUserRegisterVo);
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
    public int alterPassword(ShopUserAlterPasswordVo shopUserAlterPasswordVo) {
        /*
        * 修改密码传入的是id和新密码
        * 如果id在数据库中不存在，则抛出异常 “账号不存在!”
        * */
        if(shopUserMapper.checkUserByuId(shopUserAlterPasswordVo.getUId()) == null){
            throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_EXIST);
        }
        int num = shopUserMapper.alterPassword(shopUserAlterPasswordVo);
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
    public int alterUser(ShopUserAlterUserVo shopUserAlterUserVo) {
        int num = shopUserMapper.alterUser(shopUserAlterUserVo);
        /*
         * 修改失败则抛出异常 “数据错误”
         * */
        if(num < 1){
            throw new ServiceException(ResultCodeEnum.DATA_IS_WRONG);
        }
        return num;
    }
}
