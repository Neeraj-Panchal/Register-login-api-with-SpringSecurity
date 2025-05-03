package com.ECOMMERCE_WEB_APP.service;

import com.ECOMMERCE_WEB_APP.Entity.Users;
import com.ECOMMERCE_WEB_APP.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private JWTService jwtService;

    @Autowired
    @Lazy
    private AuthenticationManager authenticationManager;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    // Register new user with password encoding
    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));  // Encode the password before saving
        return repo.save(user);  // Save the user to DB
    }

    // Verify the user credentials
    public String verify(Users user) {
        // Fetch user from DB using the username
        Users dbUser = repo.findByUsername(user.getUsername());

        System.out.println("DB User: " + dbUser);
        System.out.println("Password Matches: " + encoder.matches(user.getPassword(), dbUser.getPassword()));

        // If user exists and password matches
        if (dbUser != null && encoder.matches(user.getPassword(), dbUser.getPassword())) {
            // Generate JWT token
            return jwtService.generateToken(dbUser.getUsername());
        }

        // If authentication fails
        return "Login failed, try again";
    }
}
