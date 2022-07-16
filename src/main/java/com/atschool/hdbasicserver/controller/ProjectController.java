package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.mapper.EvaluateMapper;
import com.atschool.hdbasicserver.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {

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

}
