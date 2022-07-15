package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.mapper.PropertyMapper;
import com.atschool.hdbasicserver.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ResourceController {
    @Autowired
    ResourceMapper resourceMapper;


    @PostMapping(value = "/insertResource")
    public String insert(@RequestParam("town")String town,
                         @RequestParam("village") String village,
                         @RequestParam("variety")String variety,
                         @RequestParam("position")String position,
                         @RequestParam("area")int area,
                         @RequestParam("charger")String charger){

        resourceMapper.addResource(town,village,variety,position,area,charger);
        return "Sourcetable";
    }
}
