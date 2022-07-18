package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Property;
import com.atschool.hdbasicserver.bean.Resource;
import com.atschool.hdbasicserver.mapper.PropertyMapper;
import com.atschool.hdbasicserver.mapper.ResourceMapper;
import com.atschool.hdbasicserver.service.PropertyService;
import com.atschool.hdbasicserver.service.ResourceService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Source;
import java.util.List;

@Controller
public class ResourceController {

    private static final int PAGESIZE=5;

    @Autowired
    ResourceService resourceService;

    @RequestMapping(value = "/addresource")
    public String jump(){
        return "Sourcetable";
    }

    @PostMapping(value = "/insertResource")
    public String insert(@RequestParam("town")String town,
                         @RequestParam("village") String village,
                         @RequestParam("variety")String variety,
                         @RequestParam("position")String position,
                         @RequestParam("area")int area,
                         @RequestParam("charger")String charger){

        resourceService.addResource(town,village,variety,position,area,charger);
        return "Sourcetable";
    }

    @RequestMapping(value = "/Resource/{pageNum}",method = RequestMethod.GET)
    public String listResource(Model model, @PathVariable("pageNum")int pageNum){
        PageInfo<Resource> resourcePageInfo = resourceService.listPage(pageNum, PAGESIZE);
        model.addAttribute("resourcePages",resourcePageInfo);
        System.out.println(resourcePageInfo);
        List<Resource> list = resourcePageInfo.getList();
        model.addAttribute("list",list);
        return "Sourcexinxi";
    }

    @RequestMapping(value = "/Resource/{pageNum}/{id}",method = RequestMethod.DELETE)
    public String deleteByID(Model model,@PathVariable("id")int id,@PathVariable("pageNum") int pageNum){
        resourceService.deleteByID(id);
        System.out.println("删除"+id+"成功");
        return "redirect:/Resource/"+pageNum;
    }


    @RequestMapping("/showres/{id}")
    public String showMessage(Model model,@PathVariable("id")int id){
        Resource resource = resourceService.getResourceByID(id);
        model.addAttribute("Msg",resource);
        return "showresource";
    }
}
