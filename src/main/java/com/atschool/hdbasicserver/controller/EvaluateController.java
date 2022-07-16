package com.atschool.hdbasicserver.controller;


import com.atschool.hdbasicserver.bean.Evaluate;
import com.atschool.hdbasicserver.bean.Hotspot;
import com.atschool.hdbasicserver.mapper.EvaluateMapper;
import com.atschool.hdbasicserver.service.EvaluateService;
import com.atschool.hdbasicserver.service.HotspotService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class EvaluateController {

    private static final int PAGESIZE=5;

    @Autowired
    EvaluateService evaluateService;
    @Autowired
    EvaluateMapper evaluateMapper;

    @PostMapping(value = "/insertEvaluate")
    public String insert(@RequestParam("title")String title,
                       @RequestParam("kind") String kind,
                       @RequestParam("satisfaction")Integer satisfaction,
                       @RequestParam("year")String time_year,
                       @RequestParam("month")String time_month,
                       @RequestParam("day")String time_day,
                       @RequestParam("evaluate")String evaluate){

        String time = time_year + "-" + time_month + "-" + time_day;
        evaluateMapper.addEvaluate(title,kind,satisfaction,time,evaluate);
        return "evaluate";
    }


    @RequestMapping(value = "/evaluate/{pageNum}",method = RequestMethod.GET)
    public String listEvaluate(Model model, @PathVariable("pageNum")int pageNum){
        PageInfo<Evaluate> evaluatePageInfo = evaluateService.listPage(pageNum, PAGESIZE);
        model.addAttribute("evaluatePages",evaluatePageInfo);
        List<Evaluate> list = evaluatePageInfo.getList();
        model.addAttribute("list",list);
        return "evaluatexinxi";

    }

    @RequestMapping(value = "/evaluate/{pageNum}/{id}",method = RequestMethod.DELETE)
    public String deleteByID(Model model,@PathVariable("id")int id,@PathVariable("pageNum") int pageNum){
        evaluateService.deleteByID(id);
        return "redirect:/evaluate/"+pageNum;
    }



}
