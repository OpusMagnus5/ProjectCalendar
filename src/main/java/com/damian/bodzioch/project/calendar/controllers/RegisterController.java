package com.damian.bodzioch.project.calendar.controllers;

import com.damian.bodzioch.project.calendar.model.RegisterForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "/register.html";
    }
}
