package com.api.own.my.rest_project.repositories;

import com.api.own.my.rest_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

       Optional<User> findByUsername(String username);

}
