package com.underwood.ssmdemo.dao;

import com.underwood.ssmdemo.entity.AreaPO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    @Ignore
    public void queryArea() {
        List<AreaPO> areaPOList = areaDao.queryArea();
        assertEquals(2,areaPOList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        AreaPO areaPO = areaDao.queryAreaById(1);
        assertEquals(2,areaPO.getPriority().intValue());
    }

    @Test
    //@Ignore
    public void insertArea() {
        AreaPO areaPO = new AreaPO();
        areaPO.setAreaName("南苑");
        areaPO.setPriority(3);
        int effectedNum = areaDao.insertArea(areaPO);

        assertEquals(1,effectedNum);
    }

    @Test
    @Ignore
    public void updateArea(){
        AreaPO areaPO = new AreaPO();
        areaPO.setAreaName("西苑");
        areaPO.setAreaId(3);
        areaPO.setLastEditTime(new Date());
        int effectedNum = areaDao.updateArea(areaPO);
        assertEquals(1,effectedNum);
    }


    @Test
    @Ignore
    public void deleteArea() {
        int effectedNum = areaDao.deleteArea(3);
        assertEquals(1,effectedNum);
    }
}