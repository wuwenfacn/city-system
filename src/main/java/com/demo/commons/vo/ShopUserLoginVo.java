package com.demo.commons.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class ShopUserLoginVo {

    @NotNull
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]{4,16}$", message = "账号格式错误")
    private String username;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]{4,16}$", message = "密码格式错误")
    private String password;

}

