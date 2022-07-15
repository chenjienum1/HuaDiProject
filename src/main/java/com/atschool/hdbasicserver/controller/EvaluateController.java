package com.atschool.hdbasicserver.controller;


import com.atschool.hdbasicserver.mapper.EvaluateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Date;

@Controller
public class EvaluateController {

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





}
