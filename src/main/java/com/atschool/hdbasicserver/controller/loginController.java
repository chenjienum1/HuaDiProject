package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.User;
import com.atschool.hdbasicserver.service.LoginService;
import com.atschool.hdbasicserver.service.impl.LoginServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping("/loginUser")
    public String loginUser(@RequestParam("username")String username,@RequestParam("password") String password){
        System.out.println(username+password);
        if (loginService.login(new User(username,password))){
            return "success";
        }else {
            return "false";
        }
    }


}

/**
 * @Controller
 * public class LoginController {
 *
 *     @Autowired
 *     AddUser addUser;
 *
 *     @RequestMapping(value = "login",method = RequestMethod.GET)
 *     public String login(HttpSession session, @Param("username") String username, @Param("password") String password, Model model){
 *         User user = addUser.queryUser(username);
 *         int pass = Integer.parseInt(password);
 *         if (username.equals(user.getUsername())&&pass==user.getPassword()){
 *             model.addAttribute("username",username);
 *             session.setAttribute("loginUser",user);
 *
 *             return "success";
 *         }
 *         return "false";
 *     }
 *     @RequestMapping(value = "registUser",method = RequestMethod.POST)
 *     public String registUser(@Param("username") String username,@Param("password") String password){
 *         int pass=Integer.parseInt(password);
 *         Boolean aBoolean = addUser.addUser(username, pass);
 *         if (!aBoolean){
 *             return "regist_false";
 *         }else {
 *             return "regist_suceess";
 *         }
 *
 *     }
 *
 *     @RequestMapping("regist")
 *     public String regist(){
 *         return "regist";
 *     }
 *
 *     @RequestMapping("log")
 *     public String log(){
 *         return "login";
 *     }
 *
 *
 * }
 */
