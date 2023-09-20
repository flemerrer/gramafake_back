package com.api.own.my.rest_project.repositories;

import com.api.own.my.rest_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<User, Long> {

//        List<User> findBy();

}
