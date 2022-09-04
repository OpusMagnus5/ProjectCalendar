package com.damian.bodzioch.project.calendar.controllers;

import com.damian.bodzioch.project.calendar.model.RegisterForm;
import com.damian.bodzioch.project.calendar.services.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    IRegistrationService registrationService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute("registerForm", new RegisterForm());
        return "/register.html";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String register(@ModelAttribute RegisterForm registerForm){
        try {
            registrationService.formValidation(registerForm);
        } catch (RuntimeException exception){
            return "redirect:/register";
        }
        registrationService.addNewUser(registerForm);
        return "redirect:/login";
    }
}
