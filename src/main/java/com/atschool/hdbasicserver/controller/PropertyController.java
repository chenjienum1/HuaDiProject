package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Affair;
import com.atschool.hdbasicserver.bean.Funds;
import com.atschool.hdbasicserver.bean.Property;
import com.atschool.hdbasicserver.mapper.EvaluateMapper;
import com.atschool.hdbasicserver.mapper.PropertyMapper;
import com.atschool.hdbasicserver.service.FundsService;
import com.atschool.hdbasicserver.service.PropertyService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PropertyController {

    private static final int PAGESIZE=5;

    @Autowired
    PropertyService propertyService;

    @RequestMapping(value = "/addproperty")
    public String jump(){
        return "Propertytable";
    }

    @PostMapping(value = "/insertProperty")
    public String insert(@RequestParam("town")String town,
                         @RequestParam("village") String village,
                         @RequestParam("name")String name,
                         @RequestParam("unit")String unit,
                         @RequestParam("amount")int amount,
                         @RequestParam("jinZhi")int jinZhi,
                         @RequestParam("year")String time_year,
                         @RequestParam("month")String time_month,
                         @RequestParam("day")String time_day,
                         @RequestParam("principal")String principal){

        String time = time_year + "-" + time_month + "-" + time_day;
        propertyService.addProperty(town,village,name,unit,amount,jinZhi,time,principal);
        return "Propertytable";
    }

    @RequestMapping(value = "/Property/{pageNum}",method = RequestMethod.GET)
    public String listProperty(Model model, @PathVariable("pageNum")int pageNum){
        PageInfo<Property> propertyPageInfo = propertyService.listPage(pageNum, PAGESIZE);
        model.addAttribute("propertyPages",propertyPageInfo);
        System.out.println(propertyPageInfo);
        List<Property> list = propertyPageInfo.getList();
        model.addAttribute("list",list);
        return "Propertyxinxi";
    }

    @RequestMapping(value = "/Property/{pageNum}/{id}",method = RequestMethod.DELETE)
    public String deleteByID(Model model,@PathVariable("id")int id,@PathVariable("pageNum") int pageNum){
        propertyService.deleteByID(id);
        System.out.println("删除"+id+"成功");
        return "redirect:/Property/"+pageNum;
    }

    @RequestMapping("/showpro/{id}")
    public String showMessage(Model model,@PathVariable("id")int id){
        Property property = propertyService.getPropertyByID(id);
        model.addAttribute("Msg",property);
        return "show3z_zc";
    }
}
