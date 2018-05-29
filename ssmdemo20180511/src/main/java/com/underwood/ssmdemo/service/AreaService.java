package com.underwood.ssmdemo.service;

import com.underwood.ssmdemo.entity.AreaPO;

import java.util.List;

public interface AreaService {

    /**
     * 列出区域列表
     * @return areaList
     */
    List<AreaPO> getAreaList();

    /**
     * 根据Id列出具体区域
     * @param areaId
     * @return
     */
    AreaPO getAreaById(int areaId);

    /**
     * 插入区域信息
     * @param areaPO
     * @return
     */
    boolean addArea(AreaPO areaPO);

    /**
     * 更新区域信息
     * @param areaPO
     * @return
     */
    boolean modifyArea(AreaPO areaPO);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
