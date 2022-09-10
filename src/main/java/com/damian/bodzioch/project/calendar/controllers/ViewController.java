package com.damian.bodzioch.project.calendar.controllers;

import com.damian.bodzioch.project.calendar.model.DTO.CommonInfoAboutToday;
import com.damian.bodzioch.project.calendar.model.Month;
import com.damian.bodzioch.project.calendar.services.IViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

@Controller
@RequestMapping(value = "/view")
public class ViewController {
    @Autowired
    IViewService viewService;

    @RequestMapping(value = "/week", method = RequestMethod.GET)
    public String showWeek(Model model){
        model.addAttribute("months", Month.values());
        model.addAttribute("commonInfoAboutToday", new CommonInfoAboutToday());
        return "week.html";
    }
}
