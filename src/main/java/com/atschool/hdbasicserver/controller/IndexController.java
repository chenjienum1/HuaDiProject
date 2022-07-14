package com.atschool.hdbasicserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/boot")
    public String login2(){
        return "boot";
    }

    @RequestMapping("/xinxi")
    public String login3(){
        return "xinxi";
    }

    @RequestMapping("/Fundstable")
    public String login4(){
        return "Fundstable";
    }
}
