package com.stewart.cloud.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class User implements Serializable {
    @ApiModelProperty(value = "表id")
    private Integer id;

    @ApiModelProperty(value = "真实姓名")
    private String name;

    @ApiModelProperty(value = "邮件")
    private String email;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "0 保密 1 男 2 女")
    private Boolean sex;

    @ApiModelProperty(value = "生日")
    private Integer birthday;

    @ApiModelProperty(value = "积分")
    private Integer points;

    @ApiModelProperty(value = "入职|入学时间")
    private Integer income;

    @ApiModelProperty(value = "注册时间")
    private Integer regTime;

    @ApiModelProperty(value = "最后登录时间")
    private Integer lastTime;

    @ApiModelProperty(value = "最后登录ip")
    private String lastIp;

    @ApiModelProperty(value = "QQ")
    private String qq;

    @ApiModelProperty(value = "手机号码")
    private String mobile;

    @ApiModelProperty(value = "是否验证手机")
    private Byte mobileValidated;

    @ApiModelProperty(value = "头像")
    private String headPic;

    @ApiModelProperty(value = "是否验证电子邮箱 0：没有验证  1：验证")
    private Boolean emailValidated;

    @ApiModelProperty(value = "第三方返回昵称")
    private String nickname;

    @ApiModelProperty(value = "会员等级")
    private Boolean level;

    @ApiModelProperty(value = "是否被锁定冻结")
    private Boolean isLock;

    @ApiModelProperty(value = "用于app 授权类似于session_id")
    private String token;

    @ApiModelProperty(value = "0 在校 1 离校 ")
    private Integer status;

    @ApiModelProperty(value = "合计义工时长")
    private Integer totalDuration;

    @ApiModelProperty(value = "0未认证，1认证")
    private Boolean isAuthentic;

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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public Integer getLastTime() {
        return lastTime;
    }

    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Byte getMobileValidated() {
        return mobileValidated;
    }

    public void setMobileValidated(Byte mobileValidated) {
        this.mobileValidated = mobileValidated;
    }

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public Boolean getEmailValidated() {
        return emailValidated;
    }

    public void setEmailValidated(Boolean emailValidated) {
        this.emailValidated = emailValidated;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public Boolean getIsLock() {
        return isLock;
    }

    public void setIsLock(Boolean isLock) {
        this.isLock = isLock;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Integer totalDuration) {
        this.totalDuration = totalDuration;
    }

    public Boolean getIsAuthentic() {
        return isAuthentic;
    }

    public void setIsAuthentic(Boolean isAuthentic) {
        this.isAuthentic = isAuthentic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", points=").append(points);
        sb.append(", income=").append(income);
        sb.append(", regTime=").append(regTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", qq=").append(qq);
        sb.append(", mobile=").append(mobile);
        sb.append(", mobileValidated=").append(mobileValidated);
        sb.append(", headPic=").append(headPic);
        sb.append(", emailValidated=").append(emailValidated);
        sb.append(", nickname=").append(nickname);
        sb.append(", level=").append(level);
        sb.append(", isLock=").append(isLock);
        sb.append(", token=").append(token);
        sb.append(", status=").append(status);
        sb.append(", totalDuration=").append(totalDuration);
        sb.append(", isAuthentic=").append(isAuthentic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}