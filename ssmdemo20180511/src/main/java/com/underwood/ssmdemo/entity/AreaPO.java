package com.underwood.ssmdemo.entity;

import java.net.InetAddress;
import java.util.Date;

public class AreaPO {

    private Integer areaId;         // 主键id，区域id

    private String areaName;        //  区域名称

    private Integer priority;       //  权重，越大越排前面显示

    private Date createTime;        //  创建时间

    private Date lastEditTime;      //  更新时间

    public AreaPO() {
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    @Override
    public String toString() {
        return "AreaPO{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", priority=" + priority +
                ", createTime=" + createTime +
                ", lastEditTime=" + lastEditTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AreaPO)) return false;

        AreaPO areaPO = (AreaPO) o;

        if (getAreaId() != null ? !getAreaId().equals(areaPO.getAreaId()) : areaPO.getAreaId() != null) return false;
        if (getAreaName() != null ? !getAreaName().equals(areaPO.getAreaName()) : areaPO.getAreaName() != null)
            return false;
        if (getPriority() != null ? !getPriority().equals(areaPO.getPriority()) : areaPO.getPriority() != null)
            return false;
        if (getCreateTime() != null ? !getCreateTime().equals(areaPO.getCreateTime()) : areaPO.getCreateTime() != null)
            return false;
        return getLastEditTime() != null ? getLastEditTime().equals(areaPO.getLastEditTime()) : areaPO.getLastEditTime() == null;
    }

    @Override
    public int hashCode() {
        int result = getAreaId() != null ? getAreaId().hashCode() : 0;
        result = 31 * result + (getAreaName() != null ? getAreaName().hashCode() : 0);
        result = 31 * result + (getPriority() != null ? getPriority().hashCode() : 0);
        result = 31 * result + (getCreateTime() != null ? getCreateTime().hashCode() : 0);
        result = 31 * result + (getLastEditTime() != null ? getLastEditTime().hashCode() : 0);
        return result;
    }
}
