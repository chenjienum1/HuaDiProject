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

    @Autowired
    HotspotMapper hotspotMapper;


    @PostMapping(value = "/insertHotspot")
    public String insert(@RequestParam("title")String title,
                         @RequestParam("year")String time_year,
                         @RequestParam("month")String time_month,
                         @RequestParam("day")String time_day,
                         @RequestParam("picture")String picture,
                         @RequestParam("content")String content){

        String time = time_year + "-" + time_month + "-" + time_day;
        hotspotMapper.addHotspot(title,time,picture,content);
        return "hotspot";
    }



    @RequestMapping(value = "/hotspot/{pageNum}",method = RequestMethod.GET)
    public String listHotspot(Model model,@PathVariable("pageNum")int pageNum){
        PageInfo<Hotspot> hotspotPageInfo = hotspotService.listPage(pageNum, PAGESIZE);
        model.addAttribute("hotspotPages",hotspotPageInfo);
        System.out.println(hotspotPageInfo);
        List<Hotspot> list = hotspotPageInfo.getList();
        model.addAttribute("list",list);
        return "xinxi";

    }

    /**
     * @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
     *     public String deleteEmployee(@PathVariable("id")Integer id){
     *         employeeDao.delete(id);
     *         System.out.println("删除"+id+"成功");
     *         return "redirect:/employee";
     *     }
     * @return
     */

    @RequestMapping(value = "/hotspot/{id}",method = RequestMethod.DELETE)
    public String deleteByID(@PathVariable("id")int id){
        hotspotService.deleteByID(id);
        System.out.println("删除"+id+"成功");
        return "redirect:/hotspot";
    }
}
