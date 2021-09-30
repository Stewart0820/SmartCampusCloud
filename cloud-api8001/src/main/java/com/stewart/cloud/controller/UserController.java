package com.stewart.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.stewart.cloud.annotation.UserLoginToken;
import com.stewart.cloud.common.api.CommonResult;
import com.stewart.cloud.common.utils.SecurityUtils;
import com.stewart.cloud.model.User;
import com.stewart.cloud.service.TokenService;
import com.stewart.cloud.service.UserService;
import com.stewart.cloud.vo.UserLoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Stewart
 * @create 2021/9/29
 */
@Api(tags = "UserController", description = "商品品牌管理")
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;


    //登录
    @ApiOperation("用户登陆")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestBody UserLoginVo user){
        System.out.println(SecurityUtils.encodePassword(user.getPassword()));
        System.out.println(SecurityUtils.matchesPassword(user.getPassword(),"$2a$10$yKIu69uZjMV32GU7m2fsgeAR2zdzsIjVU7qru2HFoCygP5tIJnigK"));
        JSONObject jsonObject=new JSONObject();
        User userForBase=userService.findByEmail(user);
        if(userForBase==null){
           return CommonResult.failed("登录失败,用户不存在");
        }else {
            if(!SecurityUtils.matchesPassword(user.getPassword(),userForBase.getPassword())){
                return CommonResult.failed("登录失败,密码错误");
            } else {
                String token = tokenService.getToken(userForBase);
                jsonObject.put("token", token);
                jsonObject.put("user", userForBase);
                return CommonResult.success(jsonObject);
            }
        }
    }
    @ApiOperation("jwt校验")
    @UserLoginToken
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    @ResponseBody
    public String getMessage(){
        return "你已通过验证";
    }
}
