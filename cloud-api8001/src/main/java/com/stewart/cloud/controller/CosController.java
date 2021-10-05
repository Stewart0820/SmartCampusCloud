package com.stewart.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.stewart.cloud.common.api.CommonResult;
import com.stewart.cloud.common.utils.TencentCOSUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author Stewart
 * @create 2021/10/2
 */
@Api(tags = "CosController", description = "文件模块")
@Controller
@RequestMapping("uploadImage")
@CrossOrigin
public class CosController {
    /**
     * 把文件上传到腾讯云存储服务器
     * @param multfile
     * @return
     * @throws Exception
     */
    @ApiOperation("上传图片")
    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult upload(@RequestParam("file") MultipartFile multfile)throws Exception{
        // 获取文件名
        String fileName = multfile.getOriginalFilename();
        // 获取文件后缀
        String prefix=fileName.substring(fileName.lastIndexOf("."));
        // 用uuid作为文件名，防止生成的临时文件重复
        final File excelFile = File.createTempFile("imagesFile-"+System.currentTimeMillis(), prefix);
        // 将MultipartFile转为File
        multfile.transferTo(excelFile);

        //调用腾讯云工具上传文件
        //返回图片名称
        String realName = TencentCOSUtils.uploadfile(excelFile);

        //程序结束时，删除临时文件
        deleteFile(excelFile);
        if(realName=="images/"){
            return CommonResult.failed("上传失败");
        }else{
            JSONObject jsonObject = new JSONObject();
            String realPath = "https://smart-1251531734.cos.ap-guangzhou.myqcloud.com/"+realName;
            jsonObject.put("path",realPath);
            System.out.println(jsonObject);
            return CommonResult.success(jsonObject);
        }
    }

    /**
     * 删除临时文件
     * @param files
     */
    private void deleteFile(File... files) {
        for (File file : files) {
            if (file.exists()) {
                file.delete();
            }
        }
    }
}
