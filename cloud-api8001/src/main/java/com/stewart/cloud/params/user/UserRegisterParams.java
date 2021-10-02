package com.stewart.cloud.params.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author Stewart
 * @create 2021/10/2
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterParams implements Serializable {

    @NotBlank(message="邮箱不能为空")
    @ApiModelProperty(value = "邮箱")
    private String email;

    @NotBlank(message="密码不能为空")
    @ApiModelProperty(value = "密码")
    private String password;

    @NotBlank(message="确认密码不能为空")
    @ApiModelProperty(value = "确认密码")
    private String rePassword;

    @NotBlank(message="验证码不能为空")
    @ApiModelProperty(value = "验证码")
    private String code;
}
