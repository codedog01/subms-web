package com.lengao.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
/*        System.out.println("进入com.lengao.handler.MyInterceptor的preHandler方法！！！");
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("userName");
        String userName = request.getParameter("userName");
        if (name != null) {
            System.out.println("拦截器放行！");
            return name.equals(userName);
        } else {
            response.sendRedirect(request.getContextPath()+"/error.jsp");
            System.out.println("拦截器拦截成功！，进入错误页面（未登录）");
            return false;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
