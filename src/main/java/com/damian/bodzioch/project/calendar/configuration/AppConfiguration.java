package com.damian.bodzioch.project.calendar.configuration;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.damian.bodzioch.project.calendar")
public class AppConfiguration {
    @Bean
    public SessionFactory SessionFactory(){
        return new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
    }
}
