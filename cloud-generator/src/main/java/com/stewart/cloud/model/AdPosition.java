package com.stewart.cloud.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AdPosition implements Serializable {
    @ApiModelProperty(value = "表id")
    private Integer id;

    @ApiModelProperty(value = "广告位置名称")
    private String name;

    @ApiModelProperty(value = "广告位宽度")
    private Short width;

    @ApiModelProperty(value = "广告位高度")
    private Short height;

    @ApiModelProperty(value = "广告描述")
    private String description;

    @ApiModelProperty(value = "0开启1关闭")
    private Boolean isOpen;

    @ApiModelProperty(value = "模板")
    private String style;

    private static final long serialVersionUID = 1L;

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

    public Short getWidth() {
        return width;
    }

    public void setWidth(Short width) {
        this.width = width;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", description=").append(description);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", style=").append(style);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}