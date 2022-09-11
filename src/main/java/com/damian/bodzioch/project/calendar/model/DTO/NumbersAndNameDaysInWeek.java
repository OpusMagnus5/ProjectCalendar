package com.damian.bodzioch.project.calendar.model.DTO;

import com.damian.bodzioch.project.calendar.model.DaysOfWeek;

public class NumbersAndNameDaysInWeek {
    private int number;
    private DaysOfWeek name;

    public NumbersAndNameDaysInWeek() {
    }

    public NumbersAndNameDaysInWeek(int number, DaysOfWeek name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public DaysOfWeek getName() {
        return name;
    }
}
