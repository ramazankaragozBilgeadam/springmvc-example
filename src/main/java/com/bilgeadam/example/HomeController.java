package com.bilgeadam.example;

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

}
