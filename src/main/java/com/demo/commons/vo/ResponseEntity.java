package com.demo.commons.vo;

import com.demo.commons.StatusCode;
import lombok.Data;

import java.util.List;

/*
* 响应的实体类
*   带状态 带提示信息 带一个集合
* */

@Data
public class ResponseEntity<T> {
    private int status;
    private String msg;
    private List<T> data;

    public static <T> ResponseEntity<T> error(StatusCode statusCode) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(statusCode.getStatus());
        entity.setMsg(statusCode.getMsg());
        return entity;
    }

    public static <T> ResponseEntity<T> error(int status, String msg) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(status);
        entity.setMsg(msg);
        return entity;
    }

    public static <T> ResponseEntity<T> success(int status) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setStatus(200);
        entity.setMsg("成功");
        return entity;
    }


}
