package com.damian.bodzioch.project.calendar.database;

import com.damian.bodzioch.project.calendar.model.HibernateEtities;

public interface IReadyQueries {
    void persist(HibernateEtities object);
    void update(HibernateEtities object);
    void delete(HibernateEtities object);
}
