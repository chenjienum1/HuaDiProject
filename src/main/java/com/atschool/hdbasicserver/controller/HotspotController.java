package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.service.HotspotService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HotspotController {

    private static final int PAGESIZE=5;

    @Autowired
    HotspotService hotspotService;

    @RequestMapping("/xinxi")
    public String listHotspot(Model model){
        int pageNum=1;
        PageInfo<Hotspot> hotspotPageInfo = hotspotService.listPage(pageNum, PAGESIZE);
        model.addAttribute("pages",hotspotPageInfo);
        System.out.println(hotspotPageInfo);
        List<Hotspot> list = hotspotPageInfo.getList();
        model.addAttribute("list",list);
        return "xinxi";

    }
}
