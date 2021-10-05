package com.stewart.cloud.params.ad;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author Stewart
 * @create 2021/10/5
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AdUpdateParams implements Serializable {
    @NotNull(message="广告位置ID不能为空")
    @ApiModelProperty(value = "广告位置ID")
    private Integer pid;

    @NotNull(message="广告类型不能为空")
    @ApiModelProperty(value = "广告类型")
    private Byte mediaType;

    @NotBlank(message="广告名称不能为空")
    @ApiModelProperty(value = "广告名称")
    private String adName;

    @NotBlank(message="链接地址不能为空")
    @ApiModelProperty(value = "链接地址")
    private String adLink;

    @NotNull(message="投放时间不能为空")
    @ApiModelProperty(value = "投放时间")
    private Integer startTime;

    @NotNull(message="结束时间不能为空")
    @ApiModelProperty(value = "结束时间")
    private Integer endTime;

    @NotBlank(message="添加人不能为空")
    @ApiModelProperty(value = "添加人")
    private String linkMan;

    @NotBlank(message="添加人邮箱不能为空")
    @ApiModelProperty(value = "添加人邮箱")
    private String linkEmail;

    @NotBlank(message="添加人联系电话不能为空")
    @ApiModelProperty(value = "添加人联系电话")
    private String linkPhone;

    @NotNull(message="是否显示不能为空")
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

    @NotBlank(message="图片地址不能为空")
    @ApiModelProperty(value = "图片地址")
    private String adCode;
}
