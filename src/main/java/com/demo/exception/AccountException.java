package com.demo.exception;

import com.demo.commons.StatusCode;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class AccountException extends BaseException {
    private int status;
    private String msg;

    public AccountException() {
    }

    public AccountException(StatusCode statusCode) {
        this.status = statusCode.getStatus();
        this.msg = statusCode.getMsg();
    }
}
