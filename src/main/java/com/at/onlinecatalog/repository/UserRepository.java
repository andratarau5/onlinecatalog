package com.at.onlinecatalog.repository;

import com.at.onlinecatalog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Integer, User> {
    Optional<User> findByUsername(String username);

}
