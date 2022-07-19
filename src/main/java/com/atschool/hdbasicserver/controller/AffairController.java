package com.atschool.hdbasicserver.controller;


import com.atschool.hdbasicserver.bean.Affair;
import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.mapper.AffairMapper;
import com.atschool.hdbasicserver.service.AffairService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AffairController {

    private static final int PAGESIZE=5;

    @Autowired
    AffairService affairService;

    @RequestMapping(value = "/addaffair")
    public String jump(){
        return "affair";
    }

    @PostMapping(value = "/insertAffair")
    public String insert(@RequestParam("title")String title,
                         @RequestParam("year")String time_year,
                         @RequestParam("month")String time_month,
                         @RequestParam("day")String time_day,
                         @RequestParam("laiyuan")String laiyuan,
                         @RequestParam("content")String content){

        String time = time_year + "-" + time_month + "-" + time_day;
        affairService.addAffair(title,time,laiyuan,content);
        return "affair";
    }

    @RequestMapping(value = "/affair/{pageNum}",method = RequestMethod.GET)
    public String listAffair(Model model, @PathVariable("pageNum")int pageNum){
        PageInfo<Affair> affairPageInfo = affairService.listPage(pageNum,PAGESIZE);
        model.addAttribute("affairPages",affairPageInfo);
        List<Affair> list = affairPageInfo.getList();
        model.addAttribute("list",list);
        return "affxinxi";
    }


    @RequestMapping(value = "/affair/{pageNum}/{id}",method = RequestMethod.DELETE)
    public String deleteByID(Model model,@PathVariable("id")int id,@PathVariable("pageNum")int pageNum){
        affairService.deleteByID(id);
        return "redirect:/affair/"+pageNum;
    }

    @RequestMapping("/showAffair/{id}")
    public String showMessage(Model model,@PathVariable("id")int id){
        Affair affairByID = affairService.getAffairByID(id);
        model.addAttribute("Msg",affairByID);
        return "wenzhang";
    }


}
