package com.guilherme.cursomc.services;

import com.guilherme.cursomc.security.UserSS;
import org.springframework.security.core.context.SecurityContextHolder;

public class UserService {

    public static UserSS authenticated() {
        try {
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch(Exception ex){
            return null;
        }
    }
}
