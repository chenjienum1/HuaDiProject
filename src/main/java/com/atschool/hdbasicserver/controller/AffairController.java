package com.atschool.hdbasicserver.controller;


import com.atschool.hdbasicserver.mapper.AffairMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AffairController {

    @Autowired
    AffairMapper affairMapper;

    @PostMapping(value = "/insertAffair")
    public String insert(@RequestParam("title")String title,
                         @RequestParam("year")String time_year,
                         @RequestParam("month")String time_month,
                         @RequestParam("day")String time_day,
                         @RequestParam("picture")String picture,
                         @RequestParam("content")String content){

        String time = time_year + "-" + time_month + "-" + time_day;
        affairMapper.addAffair(title,time,picture,content);
        return "affair";
    }
}
