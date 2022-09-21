package com.damian.bodzioch.project.calendar.database.hibernate;

import com.damian.bodzioch.project.calendar.model.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class EventDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    ReadyQueries readyQueries;

    public List<Event> getEventsOfWeekByUser(int userId, LocalDate startDate){
        Session session = sessionFactory.openSession();
        List<Event> events = new ArrayList<>();
        try{
            Query query = session.createQuery("FROM com.damian.bodzioch.project.calendar.model.Event " +
                    "WHERE user_id = :userId AND startDate = :startDate");
            query.setParameter("userId", userId);
            query.setParameter("startDate",startDate);
            events = query.getResultList();
            session.close();
            return events;
        }catch (NoResultException e){
            session.close();
            return events;
        }
    }
}
