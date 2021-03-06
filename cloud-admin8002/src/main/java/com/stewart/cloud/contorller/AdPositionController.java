package com.stewart.cloud.contorller;

import com.stewart.cloud.common.api.CommonResult;
import com.stewart.cloud.model.AdPosition;
import com.stewart.cloud.params.adposition.AdPositionCreateParams;
import com.stewart.cloud.params.adposition.AdPositionUpdateIsOpenByIdParams;
import com.stewart.cloud.params.adposition.AdPositionUpdateParams;
import com.stewart.cloud.service.AdPositionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * @author Stewart
 * @create 2021/9/30
 */
@Api(tags = "AdPositionController", description = "广告位置模块")
@Controller
@RequestMapping("adposition")
@CrossOrigin
public class AdPositionController {

    @Autowired
    private AdPositionService adPositionService;

    @ApiOperation("获取所有广告位置")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<AdPosition>> selectAll() {
        return CommonResult.success(adPositionService.selectAll());
    }

    @ApiOperation("添加广告位置")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody @Valid AdPositionCreateParams adPositionParams,
                                    BindingResult result) {
        CommonResult commonResult;

        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }
        int count = adPositionService.create(adPositionParams);
        if (count == 1) {
            commonResult = CommonResult.success("添加成功");
        } else {
            commonResult = CommonResult.failed("添加失败");
        }
        return commonResult;
    }

    @ApiOperation("更新指定id位置信息")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable("id") Integer id,
                               @RequestBody @Valid AdPositionUpdateParams adPositionUpdateParams,
                               BindingResult result) {
        CommonResult commonResult;

        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }
        int count = adPositionService.update(id, adPositionUpdateParams);
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
        int count = adPositionService.deleteById(id);


        if (count == 1) {
            return CommonResult.success("删除成功");
        } else {
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("根据id修改是否显示")
    @RequestMapping(value = "/updateIsOpenById/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateIsOpenById(@PathVariable("id") Integer id,
                                         @RequestBody @Valid AdPositionUpdateIsOpenByIdParams adPositionUpdateIsOpenByIdParams,
                                         BindingResult result) {
        if (result.hasErrors()) {
            return CommonResult.failed(result.getFieldError().getDefaultMessage());
        }
        if(adPositionUpdateIsOpenByIdParams.getIsOpen().equals("1")||
            adPositionUpdateIsOpenByIdParams.getIsOpen().equals("0")){
        }else{
            return CommonResult.failed("只能传入0或者1");
        }

        AdPosition byId = adPositionService.findById(id);
        if (byId==null){
            return CommonResult.failed("传入的id不存在");
        }
        int count = adPositionService.updateIsOpenById(id, adPositionUpdateIsOpenByIdParams);
        if (count == 1) {
            return CommonResult.success("修改成功");
        } else {
            return CommonResult.failed("操作失败");
        }
    }
}
