package com.stewart.cloud.params.user;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Stewart
 * @create 2021/9/29
 */

public class UserLoginParams implements Serializable {

    @NotBlank(message="邮箱不能为空")
    @ApiModelProperty(value = "邮箱")
    private String email;

    @NotBlank(message="密码不能为空")
    @ApiModelProperty(value = "密码")
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
