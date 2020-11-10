package com.demo.commons.exception;

import com.demo.commons.result.ResultCodeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class AccountException extends BaseException {
    private int status;
    private String msg;

    public AccountException(ResultCodeEnum resultCodeEnum) {
        this.status = resultCodeEnum.getRetCode();
        this.msg = resultCodeEnum.getRetMsg();
    }
}
