package com.damian.bodzioch.project.calendar.controllers;

import com.damian.bodzioch.project.calendar.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String logIn(Model model){
        model.addAttribute("user", new User());
        return "login.html";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String logIn(){
        return "redirect:/login";
    }
}
