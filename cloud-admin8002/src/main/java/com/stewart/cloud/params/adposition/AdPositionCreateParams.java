package com.stewart.cloud.params.adposition;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author Stewart
 * @create 2021/9/30
 */
public class AdPositionCreateParams implements Serializable {
    @ApiModelProperty(value = "表id")
    private Integer id;

    @NotBlank(message="广告位置名称参数不能为空")
    @Size(max=60,message="最大长度为60")
    @ApiModelProperty(value = "广告位置名称")
    private String name;

    @Size(max=5,message="广告位宽度最大长度为5")
    @NotBlank(message="广告位宽度不能为空")
    @ApiModelProperty(value = "广告位宽度")
    private String width;

    @Size(max=5,message="广告位高度最大长度为5")
    @NotBlank(message="广告位高度不能为空")
    @ApiModelProperty(value = "广告位高度")
    private String height;

    @NotBlank(message="广告描述不能为空")
    @ApiModelProperty(value = "广告描述")
    private String description;

    @Size(max=1,message="请传入0或1,0开启，1关闭")
    @ApiModelProperty(value = "0开启1关闭")
    private String isOpen;


    @ApiModelProperty(value = "模板")
    private String style;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
