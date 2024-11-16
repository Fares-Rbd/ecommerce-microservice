package com.fares.user_microservice.repositories;

import com.fares.user_microservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Additional query methods can be defined here, if needed
    User findByEmail(String email);
}