package com.damian.bodzioch.project.calendar.database;

import com.damian.bodzioch.project.calendar.model.User;

import java.util.Optional;

public interface IUserDAO {
    Optional<User> getUserByLogin(String login);
    void persistUser(User user);
}
