package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.*;
import com.atschool.hdbasicserver.service.*;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private static final int PAGENUM=3;

    @Autowired
    HotspotService hotspotService;

    @Autowired
    AffairService affairService;

    @Autowired
    FundsService fundsService;

    @Autowired
    PropertyService propertyService;

    @Autowired
    ResourceService resourceService;

    @Autowired
    EvaluateService evaluateService;

    @RequestMapping(value = {"/","/index"})
    public String index(Model model){
        PageInfo<Hotspot> hotspotPageInfo = hotspotService.listPage(1, PAGENUM);
        PageInfo<Affair> affairPageInfo = affairService.listPage(1, PAGENUM);
        PageInfo<Funds> fundsPageInfo = fundsService.listPage(1, PAGENUM);
        PageInfo<Property> propertyPageInfo = propertyService.listPage(1, PAGENUM);
        PageInfo<Resource> resourcePageInfo = resourceService.listPage(1, PAGENUM);
        PageInfo<Evaluate> evaluatePageInfo = evaluateService.listPage(1, PAGENUM);

        model.addAttribute("indexHot",hotspotPageInfo);
        model.addAttribute("indexAff",affairPageInfo);
        model.addAttribute("indexFunds",fundsPageInfo);
        model.addAttribute("indexPro",propertyPageInfo);
        model.addAttribute("indexRes",resourcePageInfo);
        model.addAttribute("indexEva",evaluatePageInfo);


        return "index";
    }
    @RequestMapping("/index")
    public String index2(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/boot")
    public String login2(){
        return "boot";
    }


    @RequestMapping("/Fundstable")
    public String login4(){
        return "Fundstable";
    }
    @RequestMapping("/evaluate")
    public String login5(){
        return "evaluate";
    }

    @RequestMapping("/Propertytable")
    public String login6(){
        return "Propertytable";
    }

    @RequestMapping("/Sourcetable")
    public String login7(){
        return "Sourcetable";
    }
    @RequestMapping("/affair")
    public String login8(){
        return "affair";
    }

    @RequestMapping("/Projecttable")
    public String login9(){
        return "Projecttable";
    }

    @RequestMapping("/Fundsxinxi")
    public String login10(){
        return "Fundsxinxi";
    }

    @RequestMapping("/Propertyxinxi")
    public String login11(){
        return "Propertyxinxi";
    }

    @RequestMapping("/Projectxinxi")
    public String login12(){
        return "Projectxinxi";
    }

    @RequestMapping("/Sourcexinxi")
    public String login13(){
        return "Sourcexinxi";
    }
    @RequestMapping("/affxinxi")
    public String login14(){
        return "affxinxi";
    }

    @RequestMapping("/evaxinxi")
    public String login15(){
        return "evaxinxi";
    }

    @RequestMapping("/wenzhang")
    public String login16(){
        return "wenzhang";
    }

    @RequestMapping("/show3z_zc")
    public String login17(){
        return "show3z_zc";
    }

    @RequestMapping("/show3z_zj")
    public String login18(){
        return "show3z_zj";
    }

    @RequestMapping("/show3z_zy")
    public String login19(){
        return "show3z_zy";
    }



}
