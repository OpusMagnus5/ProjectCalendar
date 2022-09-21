package com.damian.bodzioch.project.calendar.database;

import com.damian.bodzioch.project.calendar.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface IEventDAO {
    List<Event> getEventsOfWeekByUser(int userId, LocalDate startDate);
}
