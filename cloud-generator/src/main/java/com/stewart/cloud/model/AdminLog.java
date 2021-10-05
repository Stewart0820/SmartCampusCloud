package com.stewart.cloud.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AdminLog implements Serializable {
    @ApiModelProperty(value = "表id")
    private Long logId;

    @ApiModelProperty(value = "管理员id")
    private Integer adminId;

    @ApiModelProperty(value = "日志描述")
    private String logInfo;

    @ApiModelProperty(value = "ip地址")
    private String logIp;

    @ApiModelProperty(value = "url")
    private String logUrl;

    @ApiModelProperty(value = "日志时间")
    private Integer logTime;

    @ApiModelProperty(value = "1 学生  2 教师 3 普通用户 4 管理员")
    private Short usertype;

    private static final long serialVersionUID = 1L;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl;
    }

    public Integer getLogTime() {
        return logTime;
    }

    public void setLogTime(Integer logTime) {
        this.logTime = logTime;
    }

    public Short getUsertype() {
        return usertype;
    }

    public void setUsertype(Short usertype) {
        this.usertype = usertype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", adminId=").append(adminId);
        sb.append(", logInfo=").append(logInfo);
        sb.append(", logIp=").append(logIp);
        sb.append(", logUrl=").append(logUrl);
        sb.append(", logTime=").append(logTime);
        sb.append(", usertype=").append(usertype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}