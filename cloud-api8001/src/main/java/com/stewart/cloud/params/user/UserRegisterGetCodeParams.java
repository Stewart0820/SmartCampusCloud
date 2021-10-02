package com.stewart.cloud.params.user;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Stewart
 * @create 2021/10/2
 */
public class UserRegisterGetCodeParams implements Serializable {

    @NotBlank(message="邮箱不能为空")
    @ApiModelProperty(value = "邮箱")
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
