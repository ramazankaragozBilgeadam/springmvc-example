package com.bilgeadam.example.controller;

import com.bilgeadam.example.entity.User;
import com.bilgeadam.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class HomeController {

    /*@Autowired
    private UserService userService;*/

    /*@Autowired
    private IUserService userService;*/

    private final IUserService userService;

    @Autowired
    public HomeController(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){

        Date date=new Date();

        model.addAttribute("serverTime",date);

        System.out.println(userService.getHelloService());
        return "home";
    }


    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String user(User user,Model model){

        System.out.println("User Name: "+user.getUserName());

        model.addAttribute("userName",user.getUserName());

        userService.kaydet(user);

        return "user";
    }

   /* public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }*/
}
