package com.underwood.ssmdemo.entity.DO;

import java.util.Date;

public class AreaDO {

    private Integer id;         // 主键id，区域id

    private String areaName;        //  区域名称

    private Integer priority;       //  权重，越大越排前面显示

    private Date createTime;        //  创建时间

    private Date lastEditTime;      //  更新时间
}
