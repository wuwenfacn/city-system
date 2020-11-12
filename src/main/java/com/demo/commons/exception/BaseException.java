package com.demo.commons.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  10:32
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseException extends RuntimeException {
    /** 异常状态码*/
    private Integer status;
    private String msg;
    private String tips;
}
