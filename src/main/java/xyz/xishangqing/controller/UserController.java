package xyz.xishangqing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import xyz.xishangqing.entiy.User;
import xyz.xishangqing.service.Userservice;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Userservice userservice;
    String tips = "";
    @RequestMapping("/addUser")
    public ModelAndView addUser(User user){
        ModelAndView mv = new ModelAndView();
        int res = userservice.addUser(user);
        if(res > 0 ){
            tips = user.getName()+"注册成功";
        }else{

        }
        mv.addObject("tips", tips);
        mv.setViewName("result");
        return mv;

    }
}
