package com.damian.bodzioch.project.calendar.controllers;

import com.damian.bodzioch.project.calendar.model.DTO.CommonInfoAboutToday;
import com.damian.bodzioch.project.calendar.model.DaysOfWeek;
import com.damian.bodzioch.project.calendar.model.Month;
import com.damian.bodzioch.project.calendar.services.IViewService;
import com.damian.bodzioch.project.calendar.session.SessionObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalTime;

@Controller
@RequestMapping(value = "/view")
public class ViewController {
    @Resource
    SessionObject sessionObject;

    @Autowired
    IViewService viewService;

    //TODO
    @RequestMapping(value = "/week", method = RequestMethod.GET)
    public String showWeek(Model model){
        model.addAttribute("months", Month.values());
        model.addAttribute("daysOfWeek", DaysOfWeek.values());
        model.addAttribute("commonInfoAboutToday", new CommonInfoAboutToday());
        model.addAttribute("eventsOfWeek",
                viewService.getEventsOfWeekByUser(sessionObject.getUser().getId(), LocalDate.now()));
        return "week.html";
    }
}
