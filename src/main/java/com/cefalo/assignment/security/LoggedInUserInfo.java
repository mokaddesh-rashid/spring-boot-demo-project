package com.cefalo.assignment.security;

import com.cefalo.assignment.model.orm.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LoggedInUserInfo {
    public static String getLoggedInUserName(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

    public static User getLoggedInUser(){
        String br = "dude";
        return new User( getLoggedInUserName());
    }
}
