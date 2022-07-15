package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.mapper.FundsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FundsController {

    @Autowired
    FundsMapper fundsMapper;

    @PostMapping(value = "/insertFunds")
    public String insert(@RequestParam("town") String town,
                         @RequestParam("village") String village,
                         @RequestParam("account") int account,
                         @RequestParam("realAccount") int realAccount,
                         @RequestParam("available") boolean available,
                         @RequestParam("comment") String comment,
                         @RequestParam("accountant") String accountant,
                         @RequestParam("functionary") String functionary){
        fundsMapper.addFunds(town,village,account,realAccount,available,comment,accountant,functionary);
        return "Fundstable";
    }

}
