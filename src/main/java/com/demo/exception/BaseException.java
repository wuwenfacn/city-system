package com.demo.exception;



import com.demo.commons.StatusCode;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor// 生成一个无参数的构造方法
public class BaseException extends RuntimeException {
    private int status;
    private String msg;

    public BaseException(StatusCode statusCode) {
        this.status = statusCode.getStatus();
        this.msg = statusCode.getMsg();
    }
}
