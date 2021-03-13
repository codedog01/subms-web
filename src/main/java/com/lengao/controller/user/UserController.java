package com.lengao.controller.user;


import com.lengao.domain.User;
import com.lengao.service.UserService;
import com.lengao.service.imp.UserServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserServiceImp userService;
    
    @RequestMapping("/login.do")
    public ModelAndView login(String userName, String passWord) {
        System.out.println("进入UserController的login方法");
        ModelAndView mv = new ModelAndView();
        Map<String, String> adminMap = new HashMap<>();
        adminMap.put("userName",userName);
        adminMap.put("passWord", passWord);
        User user = userService.login(adminMap);
        System.out.println("信息验证完成！");
        if (!(user==null)) {
            mv.addObject("userName", userName);
            mv.addObject("passWord", passWord);
            
            mv.setViewName("frame");
            System.out.println("验证成功，正在跳转到成功页面!");
        } else {
            mv.setViewName("error");
            System.out.println("登录失败，正在跳转到失败页面!");
        }
        return mv;
    }



}
