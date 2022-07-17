package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Property;
import com.atschool.hdbasicserver.bean.Resource;
import com.atschool.hdbasicserver.service.PropertyService;
import com.atschool.hdbasicserver.service.ResourceService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sanZiController {

    @Autowired
    PropertyService propertyService;

    @Autowired
    ResourceService resourceService;

    private static final int PAGESIZE=3;

    @RequestMapping("/sanZiinformation")
    public String toSanZhiinformation(Model model){
        PageInfo<Property> propertyPageInfo = propertyService.listPage(1,PAGESIZE);
        model.addAttribute("propertyPages",propertyPageInfo);

        PageInfo<Resource> resourcePageInfo = resourceService.listPage(1,PAGESIZE);
        model.addAttribute("resourcePages",resourcePageInfo);
        return "sanZi";
    }

}
