package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.service.HotspotService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HotspotController {

    private static final int PAGESIZE=5;

    @Autowired
    HotspotService hotspotService;

    @RequestMapping(value = "/hotspot",method = RequestMethod.GET)
    public String listHotspot(Model model){
        int pageNum=1;
        PageInfo<Hotspot> hotspotPageInfo = hotspotService.listPage(pageNum, PAGESIZE);
        model.addAttribute("pages",hotspotPageInfo);
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

    @RequestMapping(value = "/hotspot/{title}",method = RequestMethod.DELETE)
    public String deleteByTitle(@PathVariable("title")String title){
        hotspotService.deleteByTitle(title);
        System.out.println("删除"+title+"成功");
        return "redirect:/hotspot";
    }
}
