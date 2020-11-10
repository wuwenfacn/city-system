package com.demo.commons.exception;


import com.demo.commons.result.ResultCodeEnum;
import lombok.Data;

@Data
public class ServiceException extends BaseException {

    public ServiceException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum);
    }
}
