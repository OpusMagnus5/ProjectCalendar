package com.damian.bodzioch.project.calendar.services;

import com.damian.bodzioch.project.calendar.model.RegisterForm;

public interface IRegistrationService {
    void formValidation(RegisterForm registerForm);
    void addNewUser(RegisterForm registerForm);
}
