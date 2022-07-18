package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.mapper.HotspotMapper;
import com.atschool.hdbasicserver.service.HotspotService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HotspotController {

    private static final int PAGESIZE=5;

    @Autowired
    HotspotService hotspotService;

    @RequestMapping(value = "/addhotspot")
    public String jump(){
        return "hotspot";
    }



    @PostMapping(value = "/insertHotspot")
    public String insert(@RequestParam("title")String title,
                         @RequestParam("year")String time_year,
                         @RequestParam("month")String time_month,
                         @RequestParam("day")String time_day,
                         @RequestParam("picture")String picture,
                         @RequestParam("content")String content){

        String time = time_year + "-" + time_month + "-" + time_day;
        hotspotService.addHotspot(title,time,picture,content);
        return "hotspot";
    }



    @RequestMapping(value = "/hotspot/{pageNum}",method = RequestMethod.GET)
    public String listHotspot(Model model,@PathVariable("pageNum")int pageNum){
        PageInfo<Hotspot> hotspotPageInfo = hotspotService.listPage(pageNum, PAGESIZE);
        model.addAttribute("hotspotPages",hotspotPageInfo);
        return "xinxi";

    }


    @RequestMapping(value = "/hotspot/{pageNum}/{id}",method = RequestMethod.DELETE)
    public String deleteByID(Model model,@PathVariable("id")int id,@PathVariable("pageNum") int pageNum){
        hotspotService.deleteByID(id);
        System.out.println("删除"+id+"成功");
        return "redirect:/hotspot/"+pageNum;
    }

    @RequestMapping("hotspotadd")
    public String hotspotadd(){
        return "hotspot";
    }

    @RequestMapping("/showMessage/{id}")
    public String showMessage(Model model,@PathVariable("id")int id){
        Hotspot hotspotById = hotspotService.getHotspotById(id);
        model.addAttribute("Msg",hotspotById);
        return "wenzhang";
    }
}
