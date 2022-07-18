package com.atschool.hdbasicserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
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


    @RequestMapping("/Fundstable")
    public String login4(){
        return "Fundstable";
    }
    @RequestMapping("/evaluate")
    public String login5(){
        return "evaluate";
    }

    @RequestMapping("/Propertytable")
    public String login6(){
        return "Propertytable";
    }

    @RequestMapping("/Sourcetable")
    public String login7(){
        return "Sourcetable";
    }
    @RequestMapping("/affair")
    public String login8(){
        return "affair";
    }

    @RequestMapping("/Projecttable")
    public String login9(){
        return "Projecttable";
    }

    @RequestMapping("/Fundsxinxi")
    public String login10(){
        return "Fundsxinxi";
    }

    @RequestMapping("/Propertyxinxi")
    public String login11(){
        return "Propertyxinxi";
    }

    @RequestMapping("/Projectxinxi")
    public String login12(){
        return "Projectxinxi";
    }

    @RequestMapping("/Sourcexinxi")
    public String login13(){
        return "Sourcexinxi";
    }
    @RequestMapping("/affxinxi")
    public String login14(){
        return "affxinxi";
    }

    @RequestMapping("/evaxinxi")
    public String login15(){
        return "evaxinxi";
    }

    @RequestMapping("/wenzhang")
    public String login16(){
        return "wenzhang";
    }



}
