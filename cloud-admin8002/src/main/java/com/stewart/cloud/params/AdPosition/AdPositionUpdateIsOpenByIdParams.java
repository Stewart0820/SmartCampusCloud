package com.stewart.cloud.params.AdPosition;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Stewart
 * @create 2021/9/30
 */
public class AdPositionUpdateIsOpenByIdParams implements Serializable {
    @Size(max=1,message="请传入0或1,0开启，1关闭")
    @ApiModelProperty(value = "0开启1关闭")
    private String isOpen;

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }
}
