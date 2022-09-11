package com.damian.bodzioch.project.calendar.model;

public enum DaysOfWeek {
    MONDAY(1, "Pn.", "Poniedziałek"),
    TUESDAY(2, "Wt.", "Wtorek"),
    WEDNESDAY(3, "Śr.", "Środa"),
    THURSDAY(4, "Czw.", "Czwartek"),
    FRIDAY(5, "Pt.", "Piątek"),
    SATURDAY(6, "Sob.", "Sobota"),
    SUNDAY(7, "Niedz.", "Niedziela");

    private final int number;
    private final String shortcut;
    private final String name;

    DaysOfWeek(int number, String shortcut, String name) {
        this.number = number;
        this.shortcut = shortcut;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getShortcut() {
        return shortcut;
    }

    public String getName() {
        return name;
    }
}
