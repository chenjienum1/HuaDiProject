package com.atschool.hdbasicserver.intercepter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {



    /*
    String requestURI=request.getRequestURI();
        log.info("拦截的请求路径：{"+requestURI+"}");
        //登录检查逻辑
        HttpSession session=request.getSession();
        Object loginUser=session.getAttribute("loginUser");
        if (loginUser!=null){
            return true;
        }
        request.setAttribute("msg","请先登录");
        //response.sendRedirect("/");
        request.getRequestDispatcher("/").forward(request,response);
        return false;
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI=request.getRequestURI();
        System.out.println("拦截了"+requestURI+"的请求");
        //检查登录逻辑
        HttpSession session=request.getSession();
        Object loginUser = session.getAttribute("User");
        System.out.println(loginUser);
        if (loginUser!=null){
            return true;
        }
        System.out.println("失败了");
        request.setAttribute("msg","请先登录");
        request.getRequestDispatcher("/login").forward(request,response);
        return false;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
