package com.damian.bodzioch.project.calendar.model.DTO;

import com.damian.bodzioch.project.calendar.model.DaysOfWeek;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class CommonInfoAboutToday {
    private final int dayOfTheWeek;
    private final int dayOfTheMonth;
    private final int numberOfMonth;
    private final int longOfTheMonth;
    private final NumbersAndNameDaysInWeek[] numbersAndNameDaysInWeeks = new NumbersAndNameDaysInWeek[7];

    public CommonInfoAboutToday() {
        this.dayOfTheMonth = LocalDate.now().getDayOfMonth();
        this.dayOfTheWeek = LocalDate.now().getDayOfWeek().get(ChronoField.DAY_OF_WEEK);
        this.numberOfMonth = LocalDate.now().getMonthValue();
        this.longOfTheMonth = LocalDate.now().lengthOfMonth();
        for (int i = 0; i < 7; i++) {
            this.numbersAndNameDaysInWeeks[i] =
                    new NumbersAndNameDaysInWeek(this.dayOfTheMonth - this.dayOfTheWeek + 1 + i, DaysOfWeek.values()[i]);
        }
    }

    public int getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public int getDayOfTheMonth() {
        return dayOfTheMonth;
    }

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    public int getLongOfTheMonth() {
        return longOfTheMonth;
    }

    public NumbersAndNameDaysInWeek[] getNumbersAndNameDaysInWeeks() {
        return numbersAndNameDaysInWeeks;
    }
}
