package com.damian.bodzioch.project.calendar.services.impl;

import com.damian.bodzioch.project.calendar.database.IUserDAO;
import com.damian.bodzioch.project.calendar.exceptions.LoginAlreadyExists;
import com.damian.bodzioch.project.calendar.exceptions.LoginTooShort;
import com.damian.bodzioch.project.calendar.exceptions.PasswordTooShort;
import com.damian.bodzioch.project.calendar.exceptions.PasswordsDoNotMatch;
import com.damian.bodzioch.project.calendar.model.RegisterForm;
import com.damian.bodzioch.project.calendar.model.User;
import com.damian.bodzioch.project.calendar.services.IRegistrationService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService implements IRegistrationService {

    @Autowired
    IUserDAO userDAO;

    //TODO zmienic na regex
    public void formValidation(RegisterForm registerForm){
        if (registerForm.getLogin().length() < 6){
            throw new LoginTooShort();
        } else if (userDAO.getUserByLogin(registerForm.getLogin()).isPresent()){
            throw new LoginAlreadyExists();
        } else if (registerForm.getPassword().length() < 8){
            throw new PasswordTooShort();
        } else if (!registerForm.getPassword().equals(registerForm.getRepeatPassword())){
            throw new PasswordsDoNotMatch();
        }
    }

    public void addNewUser(RegisterForm registerForm){
        userDAO.persistUser(new User(0, registerForm.getLogin(), encryptPassword(registerForm.getPassword())));
    }

    private String encryptPassword(String password){
        return DigestUtils.md5Hex(password);
    }
}
