package com.demo.commons.interceptor;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
* 拦截器
* */
@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*
        * 判断session中是否存在名为 “admin” 的账号
        * */
        Object attribute = request.getSession().getAttribute("admin");
        /*
        * 如果不为空则返回true，允许通过
        * */
        if(attribute != null){
            return true;
        }
        /*
        * 如果为空则抛出异常 “用户未登录”，不允许通过
        * */
        throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_LOGIN);
        /*return false;*/
    }
}
