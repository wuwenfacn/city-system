package com.demo.commons.handler;

import com.demo.commons.exception.BaseException;
import com.demo.commons.exception.SaveException;
import com.demo.commons.utils.BaseResult;
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
        return BaseResult.error();
    }


    @ExceptionHandler(BindException.class)
    public BaseResult<Object> handleBindException(BindException exception) {
        List<FieldError> allErrors = exception.getFieldErrors();
        StringBuilder sb = new StringBuilder();
        for (FieldError errorMessage : allErrors) {
            sb.append(errorMessage.getField()).append(": ").append(errorMessage.getDefaultMessage()).append(", ");
        }
        return BaseResult.success(sb.toString());
    }
}
