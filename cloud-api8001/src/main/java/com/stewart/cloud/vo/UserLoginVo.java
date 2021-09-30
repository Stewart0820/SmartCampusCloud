package com.stewart.cloud.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Stewart
 * @create 2021/9/29
 */

public class UserLoginVo implements Serializable {
    @ApiModelProperty(value = "真实姓名")
    private String email;
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
