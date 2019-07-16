package com.stackroute.exercise1;

import com.stackroute.exercise1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    User user;

@Autowired
    public UserController(User user) {
        this.user = user;
    }

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public ModelAndView login() {
        System.out.println("start");
        ModelAndView modelAndView = new ModelAndView("login.jsp");
        modelAndView.addObject("msgg", "Welcome to Stackroute");
        return modelAndView;
    }

    @RequestMapping(value = "/save" , method = RequestMethod.POST)
    public ModelAndView submit(@RequestParam("username") String username, @RequestParam("password") String password) {
        user.setUsername(username);
        user.setPassword(password);
        System.out.println("start1");
        ModelAndView modelAndView = new ModelAndView("welcome.jsp");
        modelAndView.addObject("msg", user.getUsername());
        return modelAndView;
    }

}



