package com.stewart.cloud.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class StoreAuthentication implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "store表的id关联，即店铺id")
    private Integer storeId;

    @ApiModelProperty(value = "身份证前面照片")
    private String identityCardFront;

    @ApiModelProperty(value = "身份证后面照片")
    private String identityCardEnd;

    @ApiModelProperty(value = "营业执照照片")
    private String license;

    @ApiModelProperty(value = "食品许可证照片")
    private String foodPermit;

    @ApiModelProperty(value = "店铺门脸照片")
    private String storeFrontFace;

    @ApiModelProperty(value = "店铺环境照片")
    private String storeInner;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getIdentityCardFront() {
        return identityCardFront;
    }

    public void setIdentityCardFront(String identityCardFront) {
        this.identityCardFront = identityCardFront;
    }

    public String getIdentityCardEnd() {
        return identityCardEnd;
    }

    public void setIdentityCardEnd(String identityCardEnd) {
        this.identityCardEnd = identityCardEnd;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getFoodPermit() {
        return foodPermit;
    }

    public void setFoodPermit(String foodPermit) {
        this.foodPermit = foodPermit;
    }

    public String getStoreFrontFace() {
        return storeFrontFace;
    }

    public void setStoreFrontFace(String storeFrontFace) {
        this.storeFrontFace = storeFrontFace;
    }

    public String getStoreInner() {
        return storeInner;
    }

    public void setStoreInner(String storeInner) {
        this.storeInner = storeInner;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", storeId=").append(storeId);
        sb.append(", identityCardFront=").append(identityCardFront);
        sb.append(", identityCardEnd=").append(identityCardEnd);
        sb.append(", license=").append(license);
        sb.append(", foodPermit=").append(foodPermit);
        sb.append(", storeFrontFace=").append(storeFrontFace);
        sb.append(", storeInner=").append(storeInner);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}