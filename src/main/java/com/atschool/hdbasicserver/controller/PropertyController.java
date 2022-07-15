package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.mapper.EvaluateMapper;
import com.atschool.hdbasicserver.mapper.PropertyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class PropertyController {
    @Autowired
    PropertyMapper propertyMapper;

    @PostMapping(value = "/insertProperty")
    public String insert(@RequestParam("town")String town,
                         @RequestParam("village") String village,
                         @RequestParam("name")String name,
                         @RequestParam("unit")String unit,
                         @RequestParam("amount")int amount,
                         @RequestParam("jinZhi")int jinZhi,
                         @RequestParam("year")String time_year,
                         @RequestParam("month")String time_month,
                         @RequestParam("day")String time_day,
                         @RequestParam("principal")String principal){

        String time = time_year + "-" + time_month + "-" + time_day;
        propertyMapper.addProperty(town,village,name,unit,amount,jinZhi,time,principal);
        return "Propertytable";
    }
}
