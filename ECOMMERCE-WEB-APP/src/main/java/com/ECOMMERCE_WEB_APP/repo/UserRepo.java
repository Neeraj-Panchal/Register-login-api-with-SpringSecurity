package com.ECOMMERCE_WEB_APP.repo;

import com.ECOMMERCE_WEB_APP.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);


}
