package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.Funds;
import com.atschool.hdbasicserver.mapper.FundsMapper;
import com.atschool.hdbasicserver.service.FundsService;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FundsController {

    private static final int PAGESIZE=5;

    @Autowired
    FundsService fundsService;

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

    @RequestMapping(value = "/Funds/{pageNum}",method = RequestMethod.GET)
    public String listFunds(Model model, @PathVariable("pageNum")int pageNum){
        PageInfo<Funds> fundsPageInfo = fundsService.listPage(pageNum, PAGESIZE);
        model.addAttribute("fundsPages",fundsPageInfo);
        System.out.println(fundsPageInfo);
        List<Funds> list = fundsPageInfo.getList();
        model.addAttribute("list",list);
        return "Fundsxinxi";
    }

    @RequestMapping(value = "/Funds/{pageNum}/{id}",method = RequestMethod.DELETE)
    public String deleteByID(Model model,@PathVariable("id")int id,@PathVariable("pageNum") int pageNum){
        fundsService.deleteByID(id);
        System.out.println("删除"+id+"成功");
        return "redirect:/Funds/"+pageNum;
    }
}
