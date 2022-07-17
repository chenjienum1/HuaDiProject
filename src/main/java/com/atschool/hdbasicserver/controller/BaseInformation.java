package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Affair;
import com.atschool.hdbasicserver.bean.Evaluate;
import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.service.AffairService;
import com.atschool.hdbasicserver.service.EvaluateService;
import com.atschool.hdbasicserver.service.HotspotService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseInformation {

    @Autowired
    HotspotService hotspotService;

    @Autowired
    AffairService affairService;

    @Autowired
    EvaluateService evaluateService;

    private static final int PAGESIZE=3;

    @RequestMapping("/Baseinformation")
    public String toBaseInformation(Model model)
    {
        PageInfo<Hotspot> hotspotPageInfo = hotspotService.listPage(1, PAGESIZE);
        model.addAttribute("hotspotPages",hotspotPageInfo);

        PageInfo<Affair> affairPageInfo=affairService.listPage(1,PAGESIZE);
        model.addAttribute("affairPages",affairPageInfo);

        PageInfo<Evaluate> evaluatePageInfo=evaluateService.listPage(1,PAGESIZE);
        model.addAttribute("evaluatePages",evaluatePageInfo);
        return "Baseinformation";

    }

}
