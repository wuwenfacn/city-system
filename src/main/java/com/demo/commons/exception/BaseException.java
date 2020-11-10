package com.demo.commons.exception;

import com.demo.commons.result.ResultCodeEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BaseException extends RuntimeException {
    private int status;
    private String msg;
    private String tips;

    public BaseException(ResultCodeEnum resultCodeEnum) {
        this.status = resultCodeEnum.getRetCode();
        this.msg = resultCodeEnum.getRetMsg();
        this.tips = resultCodeEnum.getTips();
    }
}
