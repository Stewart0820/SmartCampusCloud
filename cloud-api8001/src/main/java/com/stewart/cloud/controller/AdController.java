package com.stewart.cloud.controller;

import com.stewart.cloud.common.api.CommonPage;
import com.stewart.cloud.common.api.CommonResult;
import com.stewart.cloud.model.Ad;
import com.stewart.cloud.service.AdService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Stewart
 * @create 2021/10/5
 */
@Api(tags = "AdController", description = "广告模块")
@Controller
@RequestMapping("user")
@CrossOrigin
public class AdController {
    @Autowired
    private AdService adService;


    @ApiOperation("查询首页的广告")
    @RequestMapping(value = "/selectHome", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Ad>> selectHome() {
        return CommonResult.success(adService.selectHome());
    }

    @ApiOperation("为广告添加点击量")
    @RequestMapping(value = "/addCilckCount/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult addCilckCount(@PathVariable("id") Integer id){
        int count = adService.addCilckCount(id);
        if(count==1){
            return CommonResult.success("添加点击量成功");
        } else {
            return CommonResult.failed("添加点击量失败");
        }
    }
}
