package com.demo.commons.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UserRequestParams {
    @NotNull
    private int uid;
    @NotNull
    @Pattern(regexp = "^[A-Z][a-zA-z0-9]{6,18}$", message = "用户不符合规范")
    private String username;
    @Pattern(regexp = "^1[3-9][0-9]{9}$")
    private String phone;
    @Size(min = 0, max = 100)
    private int age;
}
