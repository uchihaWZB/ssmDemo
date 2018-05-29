package com.underwood.ssmdemo.service.impl;

import com.underwood.ssmdemo.dao.AreaDao;
import com.underwood.ssmdemo.entity.AreaPO;
import com.underwood.ssmdemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.RelationNotFoundException;
import java.util.Date;
import java.util.List;

@Service("AreaService")
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<AreaPO> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public AreaPO getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(AreaPO areaPO) {
        if (areaPO.getAreaName() != null && "".equals(areaPO.getAreaName())) {
            areaPO.setCreateTime(new Date());
            areaPO.setLastEditTime(new Date());

            try {
                int effectedNum = areaDao.insertArea(areaPO);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败！");
                }
            } catch (Exception ex) {
                throw new RuntimeException("插入区域信息失败：" + ex.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Transactional
    @Override
    public boolean modifyArea(AreaPO areaPO) {
        // 控制判断，主要是areaId不能为空
        if (areaPO.getAreaId() != null && areaPO.getAreaId() > 0) {
            // 设置默认值
            areaPO.setLastEditTime(new Date());
            try {
                // 更新区域信息
                int effectedNum = areaDao.updateArea(areaPO);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新区域信息失败：" + e.toString());
            }
        } else {
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Transactional
    @Override
    public boolean deleteArea(int areaId) {
        if (areaId > 0) {
            try {
                // 删除区域信息
                int effectedNum = areaDao.deleteArea(areaId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败：" + e.toString());
            }
        } else {
            throw new RuntimeException("区域Id不能为空！");
        }
    }
}
