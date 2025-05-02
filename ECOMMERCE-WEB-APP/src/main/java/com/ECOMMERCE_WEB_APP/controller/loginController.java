

package com.ECOMMERCE_WEB_APP.controller;

import com.ECOMMERCE_WEB_APP.Entity.User;
import jakarta.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {
    private List<User> users = new ArrayList(List.of(
            new User("Neeraj", "neeraj"),
            new User("Karan", "karan")));

    @GetMapping({"/"})
    public String login(HttpServletRequest request) {
        return "Welcome to home page  |  " + request.getSession().getId();
    }

    @GetMapping({"/users"})
    public List<User> getUsers() {
        return this.users;
    }

    @GetMapping({"csrf-token"})
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken)request.getAttribute("_csrf");
    }

    @PostMapping({"/users"})
    public User addUsers(@RequestBody User user) {
        this.users.add(user);
        return user;
    }
}
