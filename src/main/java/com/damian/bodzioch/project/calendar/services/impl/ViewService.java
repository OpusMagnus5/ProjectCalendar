package com.damian.bodzioch.project.calendar.services.impl;

import com.damian.bodzioch.project.calendar.database.IEventDAO;
import com.damian.bodzioch.project.calendar.database.hibernate.EventDAO;
import com.damian.bodzioch.project.calendar.model.DTO.EventsOfDay;
import com.damian.bodzioch.project.calendar.model.Event;
import com.damian.bodzioch.project.calendar.services.IViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class ViewService implements IViewService {

    @Autowired
    IEventDAO eventDAO;

    public List<EventsOfDay>[] getEventsOfWeekByUser(int userId, LocalDate startDate){
        List<EventsOfDay>[] eventsOfWeek = new ArrayList[7];

        for (int i = 0; i < eventsOfWeek.length; i++){
            List<Event> eventsOfDay = eventDAO.getEventsOfWeekByUser(userId, startDate);
            eventsOfWeek[i] = eventsOfDay.stream()
                    .map(event -> new EventsOfDay(event.getStartTime(), event.getName()))
                    .collect(Collectors.toList());
        }
        return eventsOfWeek;
    }
}
