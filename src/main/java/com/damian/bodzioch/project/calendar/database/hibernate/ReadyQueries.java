package com.damian.bodzioch.project.calendar.database.hibernate;

import com.damian.bodzioch.project.calendar.database.IReadyQueries;
import com.damian.bodzioch.project.calendar.model.HibernateEtities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReadyQueries implements IReadyQueries {

    @Autowired
    SessionFactory sessionFactory;

    public void persist(HibernateEtities object){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        }catch (Exception exception){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
    }

    public void update(HibernateEtities object){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        }catch (Exception exception){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
    }

    public void delete(HibernateEtities object){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        }catch (Exception exception){
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            session.close();
        }
    }
}
