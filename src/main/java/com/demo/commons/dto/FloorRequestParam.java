package com.demo.commons.dto;

import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

//QO query object
@Data
public class FloorRequestParam {
    private Integer floorId;
    @Size(min =6, max=255,message = "输入有误,格式错误")
    private String name;
    private String number;
    private Integer userId;
    private BigDecimal area;
}
