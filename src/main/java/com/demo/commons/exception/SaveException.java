package com.demo.commons.exception;

import lombok.Data;

/**
 * @Author qiaoshu
 * Date: 2020-11-12  10:25
 * Description:
 */
@Data
public class SaveException extends BaseException{
    public SaveException(Integer status, String msg, String tips) {
        super(status, msg, tips);
    }
}
