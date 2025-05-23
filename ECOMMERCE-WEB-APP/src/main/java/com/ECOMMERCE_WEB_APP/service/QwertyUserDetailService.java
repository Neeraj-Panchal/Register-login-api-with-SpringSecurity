package com.ECOMMERCE_WEB_APP.service;

import com.ECOMMERCE_WEB_APP.Entity.UserDETAILS;
import com.ECOMMERCE_WEB_APP.Entity.Users;
import com.ECOMMERCE_WEB_APP.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class QwertyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = userRepo.findByUsername(username);
        if(user == null){
            System.out.println("User not found");
            throw new UsernameNotFoundException(username);
        }

        return new UserDETAILS(user);
    }
}
