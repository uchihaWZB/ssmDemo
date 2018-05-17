package com.underwood.ssmdemo.service.impl;

import com.underwood.ssmdemo.dao.AreaDao;
import com.underwood.ssmdemo.entity.AreaPO;
import com.underwood.ssmdemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;

    @Override
    public List<AreaPO> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public AreaPO queryAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean insertArea(AreaPO areaPO) {
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

    @Override
    public boolean updateArea(AreaPO areaPO) {
        return true;
    }

    @Override
    public boolean deleteArea(int areaId) {
        return true;
    }
}
