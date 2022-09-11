package com.damian.bodzioch.project.calendar.model.DTO;

import org.apache.tomcat.jni.Local;

import java.time.LocalTime;

public class EventsOfDay {
    private LocalTime startTime;
    private String name;

    public EventsOfDay() {
    }

    public EventsOfDay(LocalTime startTime, String name) {
        this.startTime = startTime;
        this.name = name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public String getName() {
        return name;
    }
}
