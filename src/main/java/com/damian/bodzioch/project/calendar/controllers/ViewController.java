package com.damian.bodzioch.project.calendar.controllers;

import com.damian.bodzioch.project.calendar.model.Month;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/view")
public class ViewController {

    @RequestMapping(value = "/week", method = RequestMethod.GET)
    public String showWeek(Model model){
        model.addAttribute("months", Month.values());
        return "week.html";
    }
}
