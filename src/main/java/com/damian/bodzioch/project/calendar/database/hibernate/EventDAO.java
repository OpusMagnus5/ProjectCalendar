package com.damian.bodzioch.project.calendar.database.hibernate;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public class EventDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    ReadyQueries readyQueries;

    //TODO
    public void getEventsOfWeekByUser(int userId, LocalDate startDate){

    }
}
