package com.demo.commons.interceptor;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.ResultCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object attribute = request.getSession().getAttribute("admin");
        if(attribute != null){
            return true;
        }
        throw new ServiceException(ResultCodeEnum.ACCOUNT_NOT_LOGIN);
        /*return false;*/
    }
}
