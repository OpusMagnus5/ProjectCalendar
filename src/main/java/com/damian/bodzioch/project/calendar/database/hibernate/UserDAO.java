package com.damian.bodzioch.project.calendar.database.hibernate;

import com.damian.bodzioch.project.calendar.database.IUserDAO;
import com.damian.bodzioch.project.calendar.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.NoResultException;
import java.util.Optional;

@Repository
public class UserDAO implements IUserDAO {

    @Autowired
    ReadyQueries readyQueries;

    @Autowired
    SessionFactory sessionFactory;

    public void persistUser(User user){
        readyQueries.persist(user);
    }

    public Optional<User> getUserByLogin(String login){
        Session session = sessionFactory.openSession();
        try {
            Query<User> query = session.createQuery("FROM com.damian.bodzioch.project.calendar.model.User WHERE login = :login");
            query.setParameter("login", login);
            User result = query.getSingleResult();
            session.close();
            return Optional.of(result);
        } catch (NoResultException exception){
            session.close();
            return Optional.empty();
        }
    }
}
