package com.stewart.cloud.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class Ad implements Serializable {
    @ApiModelProperty(value = "广告id")
    private Integer id;

    @ApiModelProperty(value = "广告位置ID")
    private Integer pid;

    @ApiModelProperty(value = "广告类型")
    private Byte mediaType;

    @ApiModelProperty(value = "广告名称")
    private String adName;

    @ApiModelProperty(value = "链接地址")
    private String adLink;

    @ApiModelProperty(value = "投放时间")
    private Integer startTime;

    @ApiModelProperty(value = "结束时间")
    private Integer endTime;

    @ApiModelProperty(value = "添加人")
    private String linkMan;

    @ApiModelProperty(value = "添加人邮箱")
    private String linkEmail;

    @ApiModelProperty(value = "添加人联系电话")
    private String linkPhone;

    @ApiModelProperty(value = "点击量")
    private Integer clickCount;

    @ApiModelProperty(value = "是否显示")
    private Byte enabled;

    @ApiModelProperty(value = "排序")
    private Short orderby;

    @ApiModelProperty(value = "是否开启浏览器新窗口")
    private Boolean target;

    @ApiModelProperty(value = "背景颜色")
    private String bgcolor;

    @ApiModelProperty(value = "学校")
    private Integer school;

    @ApiModelProperty(value = "图片地址")
    private String adCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getMediaType() {
        return mediaType;
    }

    public void setMediaType(Byte mediaType) {
        this.mediaType = mediaType;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName;
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Byte getEnabled() {
        return enabled;
    }

    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    public Short getOrderby() {
        return orderby;
    }

    public void setOrderby(Short orderby) {
        this.orderby = orderby;
    }

    public Boolean getTarget() {
        return target;
    }

    public void setTarget(Boolean target) {
        this.target = target;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    public Integer getSchool() {
        return school;
    }

    public void setSchool(Integer school) {
        this.school = school;
    }

    public String getAdCode() {
        return adCode;
    }

    public void setAdCode(String adCode) {
        this.adCode = adCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pid=").append(pid);
        sb.append(", mediaType=").append(mediaType);
        sb.append(", adName=").append(adName);
        sb.append(", adLink=").append(adLink);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", linkMan=").append(linkMan);
        sb.append(", linkEmail=").append(linkEmail);
        sb.append(", linkPhone=").append(linkPhone);
        sb.append(", clickCount=").append(clickCount);
        sb.append(", enabled=").append(enabled);
        sb.append(", orderby=").append(orderby);
        sb.append(", target=").append(target);
        sb.append(", bgcolor=").append(bgcolor);
        sb.append(", school=").append(school);
        sb.append(", adCode=").append(adCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}