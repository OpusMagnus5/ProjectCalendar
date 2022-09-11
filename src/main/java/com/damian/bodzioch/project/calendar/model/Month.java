package com.damian.bodzioch.project.calendar.model;

public enum Month {
    JANUARY(1,"Styczeń"),
    FEBRUARY(2,"Luty"),
    MARCH(3,"Marzec"),
    APRIL(4,"Kwiecień"),
    MAY(5,"Maj"),
    JUNE(6,"Czerwiec"),
    JULY(7,"Lipiec"),
    AUGUST(8,"Sierpień"),
    SEPTEMBER(9,"Wrzesień"),
    OCTOBER(10,"Październik"),
    NOVEMBER(11,"Listopad"),
    DECEMBER(12,"Grudzień");

    private final int id;
    private final String name;

    Month(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
