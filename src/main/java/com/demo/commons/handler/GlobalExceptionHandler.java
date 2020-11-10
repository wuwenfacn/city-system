package com.demo.commons.handler;

import com.demo.commons.exception.ServiceException;
import com.demo.commons.result.BaseResult;
import com.demo.commons.result.ResultCodeEnum;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public BaseResult<Object> handException(Exception ex) {
        ex.printStackTrace();
        if (ex instanceof ServiceException) {
            return BaseResult.error(((ServiceException) ex).getStatus(),
                    ((ServiceException) ex).getMsg(), ((ServiceException) ex).getTips());
        }
        return BaseResult.error();
    }

    @ExceptionHandler(BindException.class)
    public BaseResult<Object> handleBindException(BindException exception) {
        exception.printStackTrace();
        List<FieldError> allErrors = exception.getFieldErrors();
        StringBuilder sb = new StringBuilder();
        for (FieldError errorMessage : allErrors) {
            sb.append(errorMessage.getField()).append(": ").append(errorMessage.getDefaultMessage()).append(", ");
        }
        return BaseResult.success(sb.toString());
    }

}
