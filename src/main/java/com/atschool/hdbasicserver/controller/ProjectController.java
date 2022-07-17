package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Affair;
import com.atschool.hdbasicserver.bean.Project;
import com.atschool.hdbasicserver.mapper.EvaluateMapper;
import com.atschool.hdbasicserver.mapper.ProjectMapper;
import com.atschool.hdbasicserver.service.ProjectService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProjectController {

    private static final int PAGESIZE=5;

    @Autowired
    ProjectService projectService;

    @Autowired
    ProjectMapper projectMapper;

    @PostMapping(value = "/insertProject")
    public String insert(@RequestParam("town")String town,
                         @RequestParam("village") String village,
                         @RequestParam("company")String company,
                         @RequestParam("area")int area,
                         @RequestParam("cost")int cost,
                         @RequestParam("beginYear")String beginYear,
                         @RequestParam("beginMonth")String beginMonth,
                         @RequestParam("beginDay")String beginDay,
                         @RequestParam("completeYear")String completeYear,
                         @RequestParam("completeMonth")String completeMonth,
                         @RequestParam("completeDay")String completeDay,
                         @RequestParam("manager")String manager){

        String beginTime = beginYear + "-" + beginMonth + "-" + beginDay;
        String completeTime = completeYear + "-" + completeMonth + "-" + completeDay;
        projectMapper.addProject(town,village,company,area,cost,beginTime,completeTime,manager);
        return "Projecttable";
    }

    @RequestMapping(value = "/project/{pageNum}",method = RequestMethod.GET)
    public String listAffair(Model model, @PathVariable("pageNum")int pageNum){
        PageInfo<Project> projectPageInfo = projectService.listPage(pageNum,PAGESIZE);
        model.addAttribute("projectPages",projectPageInfo);
        List<Project> list = projectPageInfo.getList();
        model.addAttribute("list",list);
        return "Projectxinxi";
    }


    @RequestMapping(value = "/project/{pageNum}/{id}",method = RequestMethod.DELETE)
    public String deleteByID(Model model,@PathVariable("id")int id,@PathVariable("pageNum")int pageNum){
        projectService.deleteByID(id);
        return "redirect:/project/"+pageNum;
    }

}
