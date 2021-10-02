package com.stewart.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.stewart.cloud.annotation.UserLoginToken;
import com.stewart.cloud.common.api.CommonResult;
import com.stewart.cloud.common.service.RedisService;
import com.stewart.cloud.common.utils.CommonUtils;
import com.stewart.cloud.common.utils.EmailUtils;
import com.stewart.cloud.common.utils.SecurityUtils;
import com.stewart.cloud.model.User;
import com.stewart.cloud.params.user.UserRegisterGetCodeParams;
import com.stewart.cloud.params.user.UserRegisterParams;
import com.stewart.cloud.service.TokenService;
import com.stewart.cloud.service.UserService;
import com.stewart.cloud.params.user.UserLoginParams;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Stewart
 * @create 2021/9/29
 */
@Api(tags = "UserController", description = "用户模块")
@Controller
@RequestMapping("user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;
    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @ApiOperation("用户登陆")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody @Valid UserLoginParams user, BindingResult result) {

        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }

        JSONObject jsonObject = new JSONObject();
        User userForBase = userService.findByEmail(user);
        if (userForBase == null) {
            return CommonResult.failed("登录失败,用户不存在");
        } else {
            if (!SecurityUtils.matchesPassword(user.getPassword(), userForBase.getPassword())) {
                return CommonResult.failed("登录失败,密码错误");
            } else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return CommonResult.success(jsonObject);
            }
        }
    }

    @ApiOperation("用户注册通过邮箱获取验证码")
    @RequestMapping(value = "/registerGetCode", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult registerGetCode(@RequestBody @Valid UserRegisterGetCodeParams registerParams,
                                        BindingResult result) {
        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }
        //查询数据库该邮箱是否已经注册
        User existEmail = userService.findExistEmail(registerParams);
        if (existEmail != null) {
            return CommonResult.failed("该邮箱已经注册");
        }
        String code = CommonUtils.generateCode();
        //验证码绑定手机号并存储到redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + registerParams.getEmail(), code);
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + registerParams.getEmail(), AUTH_CODE_EXPIRE_SECONDS);
        //通过邮箱发送验证码
        boolean b = EmailUtils.sendEmail(registerParams.getEmail(), code);
        if (b == true) {
            return CommonResult.success("验证码发送成功,请在60秒內输入");
        } else {
            return CommonResult.failed("验证码发送失败,请重新发送");
        }
    }

    @ApiOperation("用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestBody @Valid UserRegisterParams registerParams,
                                 BindingResult result) {
        //验证数据是否全部输入
        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }
        //验证两次密码是否都相同
        System.out.println(registerParams.getPassword());
        System.out.println(registerParams.getRePassword());
        if (!registerParams.getPassword().equals(registerParams.getRePassword())) {
            return CommonResult.failed("两次输入的密码不相同,请重新输入");
        }

        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + registerParams.getEmail());
        if (realAuthCode == null) {
            return CommonResult.failed("该验证码已经过期,请重新获取");
        }
        boolean r = registerParams.getCode().equals(realAuthCode);
        if (r == false) {
            return CommonResult.failed("验证码不正确");
        }

        int register = userService.register(registerParams);

        if (register == 1) {
            return CommonResult.success("注册成功");
        } else {
            return CommonResult.failed("注册失败");
        }
    }


    @ApiOperation("jwt校验")
    @UserLoginToken
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    @ResponseBody
    public String getMessage() {
        return "你已通过验证";
    }
}
