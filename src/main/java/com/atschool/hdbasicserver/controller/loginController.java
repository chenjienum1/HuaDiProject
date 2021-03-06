package com.atschool.hdbasicserver.controller;

import com.atschool.hdbasicserver.bean.User;
import com.atschool.hdbasicserver.service.LoginService;
import com.atschool.hdbasicserver.service.impl.LoginServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class loginController {

    @Autowired
    LoginServiceImpl loginService;

    @RequestMapping(value = "/loginUser",method = RequestMethod.PUT)
    public String loginUser(HttpServletRequest request,HttpSession session, @RequestParam("username")String username, @RequestParam("password") String password){
        System.out.println(username+password);
        boolean ifExist = loginService.ifExist(username);
        if (!ifExist){
            session.setAttribute("msg","用户或密码错误");
            return "redirect:login";
        }
        User u=new User(username,password);
        if (loginService.login(u)){
            session.setAttribute("User",u);
            session.removeAttribute("msg");
            return "redirect:index";
        }else {
            session.setAttribute("msg","用户名或密码错误");
            return "redirect:login";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("User");
        return "redirect:index";
    }




}

/**
 * //1.获取请求的参数
 *         String username=request.getParameter("username");
 *         String password=request.getParameter("password");
 *         //2.调用userService.login()登录处理业务
 *         User loginUser = userService.login(new User(null, username, password, null));
 *         //如果等于null，说明登录失败!
 *         if (loginUser==null){
 *             //把错误信息，和会先的表单项信息，保存到Request域中，这样请求转发后这些数据还在，这样就能把数据回显到.jsp页面中。
 *             request.setAttribute("msg","用户名或密码错误！");
 *             request.setAttribute("username",username);
 *             //跳回登录页面
 *             request.getRequestDispatcher("/pages/user/login.jsp").forward(request,response);
 *         }else {
 *             //登录成功
 *             //跳到login_success.html
 *             request.getRequestDispatcher("/pages/user/login_success.jsp").forward(request,response);
 *         }
 */
