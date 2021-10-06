package com.stewart.cloud.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Store implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "店铺名")
    private String name;

    @ApiModelProperty(value = "创建店铺的用户id")
    private Integer createUserId;

    @ApiModelProperty(value = "图标")
    private String icon;

    @ApiModelProperty(value = "店铺公告")
    private String storeNotice;

    @ApiModelProperty(value = "店铺介绍")
    private String description;

    @ApiModelProperty(value = "店铺分类")
    private Integer catId;

    @ApiModelProperty(value = "店铺电话")
    private String storePhone;

    @ApiModelProperty(value = "地址")
    private String address;

    private Integer createTime;

    @ApiModelProperty(value = "营业开始时间")
    private Integer beginTime;

    @ApiModelProperty(value = "营业结束时间")
    private Integer closeTime;

    @ApiModelProperty(value = "是否认证0：未认证，1：已认证")
    private Integer isAuthentication;

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

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStoreNotice() {
        return storeNotice;
    }

    public void setStoreNotice(String storeNotice) {
        this.storeNotice = storeNotice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Integer getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Integer closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getIsAuthentication() {
        return isAuthentication;
    }

    public void setIsAuthentication(Integer isAuthentication) {
        this.isAuthentication = isAuthentication;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", createUserId=").append(createUserId);
        sb.append(", icon=").append(icon);
        sb.append(", storeNotice=").append(storeNotice);
        sb.append(", description=").append(description);
        sb.append(", catId=").append(catId);
        sb.append(", storePhone=").append(storePhone);
        sb.append(", address=").append(address);
        sb.append(", createTime=").append(createTime);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", isAuthentication=").append(isAuthentication);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}