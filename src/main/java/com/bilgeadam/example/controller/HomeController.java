package com.bilgeadam.example.controller;

import com.bilgeadam.example.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class HomeController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(Model model){

        Date date=new Date();

        model.addAttribute("serverTime",date);

        return "home";
    }


    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String user(User user,Model model){

        model.addAttribute("userName",user.getUserName());

        return "user";
    }

}
