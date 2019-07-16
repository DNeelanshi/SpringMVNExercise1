package com.stackroute.exercise1;

import com.stackroute.exercise1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    User user;


//    @ResponseBody
@RequestMapping(value = "/")
public ModelAndView welcome() {
        System.out.println("start");
        System.out.println('s');
        ModelAndView modelAndView = new ModelAndView("welcome.jsp");
        modelAndView.addObject("msg", "Welcome to Stackroute "+user.getName());

        return modelAndView;
    }
}



