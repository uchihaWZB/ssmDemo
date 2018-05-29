package com.underwood.ssmdemo.controller;

import com.underwood.ssmdemo.entity.AreaPO;
import com.underwood.ssmdemo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/superadmin")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listArea", method = RequestMethod.GET)
    private Map<String, Object> listArea() {
        Map<String, Object> modelMap = new HashMap<>();
        List<AreaPO> list = areaService.getAreaList();

        modelMap.put("areaList", list);

        return modelMap;
    }

    @RequestMapping(value = "/getAreaById", method = RequestMethod.GET)
    private Map<String, Object> getAreaById(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<>();

        AreaPO areaPO = areaService.getAreaById(areaId);

        modelMap.put("area", areaPO);

        return modelMap;
    }

    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    private Map<String, Object> addArea(@RequestBody AreaPO areaPO) {
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.addArea(areaPO));

        return modelMap;
    }

    @RequestMapping(value = "/modifyArea", method = RequestMethod.POST)
    private Map<String, Object> modifyArea(@RequestBody AreaPO areaPO) {
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.modifyArea(areaPO));

        return modelMap;
    }

    @RequestMapping(value = "/deleteArea", method = RequestMethod.GET)
    private Map<String, Object> removeArea(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", areaService.deleteArea(areaId));

        return modelMap;
    }
}
