package com.damian.bodzioch.project.calendar.services;

import com.damian.bodzioch.project.calendar.model.DTO.EventsOfDay;

import java.time.LocalDate;
import java.util.List;

public interface IViewService {
    List<EventsOfDay>[] getEventsOfWeekByUser(int userId, LocalDate startDate);
}
