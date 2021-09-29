package com.stewart.cloud.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Admin implements Serializable {
    @ApiModelProperty(value = "用户id")
    private Short id;

    @ApiModelProperty(value = "用户名")
    private String adminName;

    @ApiModelProperty(value = "email")
    private String email;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "秘钥")
    private String ecSalt;

    @ApiModelProperty(value = "添加时间")
    private String addTime;

    @ApiModelProperty(value = "最后登录时间")
    private String lastLogin;

    @ApiModelProperty(value = "最后登录ip")
    private String lastIp;

    @ApiModelProperty(value = "1 启用 2 未启用")
    private Integer status;

    @ApiModelProperty(value = "tokenValue验证登录")
    private String tokenvalue;

    @ApiModelProperty(value = "1第一次登陆0不是第一次登陆")
    private Integer isfirst;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEcSalt() {
        return ecSalt;
    }

    public void setEcSalt(String ecSalt) {
        this.ecSalt = ecSalt;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTokenvalue() {
        return tokenvalue;
    }

    public void setTokenvalue(String tokenvalue) {
        this.tokenvalue = tokenvalue;
    }

    public Integer getIsfirst() {
        return isfirst;
    }

    public void setIsfirst(Integer isfirst) {
        this.isfirst = isfirst;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", adminName=").append(adminName);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", ecSalt=").append(ecSalt);
        sb.append(", addTime=").append(addTime);
        sb.append(", lastLogin=").append(lastLogin);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", status=").append(status);
        sb.append(", tokenvalue=").append(tokenvalue);
        sb.append(", isfirst=").append(isfirst);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}