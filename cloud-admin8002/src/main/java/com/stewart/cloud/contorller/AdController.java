package com.stewart.cloud.contorller;

import com.stewart.cloud.common.api.CommonPage;
import com.stewart.cloud.common.api.CommonResult;
import com.stewart.cloud.model.Ad;
import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.params.ad.AdCreateParams;
import com.stewart.cloud.params.ad.AdUpdateParams;
import com.stewart.cloud.params.adposition.AdPositionCreateParams;
import com.stewart.cloud.params.adposition.AdPositionUpdateParams;
import com.stewart.cloud.service.AdPositionService;
import com.stewart.cloud.service.AdService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Stewart
 * @create 2021/10/5
 */
@Api(tags = "AdController", description = "广告模块")
@Controller
@RequestMapping("ad")
@CrossOrigin
public class AdController {

    @Autowired
    private AdService adService;

    @Autowired
    private AdPositionService adPositionService;

    @ApiOperation("分页查询广告列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Ad>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1")
                                                        @ApiParam("页码") Integer pageNum,
                                                  @RequestParam(value = "pageSize", defaultValue = "3")
                                                        @ApiParam("每页数量") Integer pageSize) {
        List<Ad> brandList = adService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }


    @ApiOperation("添加广告")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody @Valid AdCreateParams adCreateParams,
                                    BindingResult result) {
        CommonResult commonResult;
        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }

        AdPosition adPosition = adPositionService.findById(adCreateParams.getPid());
        if(adPosition==null){
            return CommonResult.failed("未找到传入的广告位置id");
        }
        int count = adService.create(adCreateParams);
        if (count == 1) {
            commonResult = CommonResult.success("添加成功");
        } else {
            commonResult = CommonResult.failed("添加失败");
        }
        return commonResult;
    }

    @ApiOperation("根据id更新广告")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id") Integer id,
                               @RequestBody @Valid AdUpdateParams adUpdateParams,
                               BindingResult result) {
        CommonResult commonResult;

        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }
        AdPosition adPosition = adPositionService.findById(adUpdateParams.getPid());
        if(adPosition==null){
            return CommonResult.failed("未找到传入的广告位置id");
        }
        int count = adService.update(id, adUpdateParams);
        if (count == 1) {
            commonResult = CommonResult.success("修改成功");
        } else {
            commonResult = CommonResult.failed("操作失败");
        }
        return commonResult;
    }

    @ApiOperation("删除指定id的广告位置")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult delete(@PathVariable("id") Integer id) {
        int count = adService.deleteById(id);
        if (count == 1) {
            return CommonResult.success("删除成功");
        } else {
            return CommonResult.failed("删除失败");
        }
    }








}
