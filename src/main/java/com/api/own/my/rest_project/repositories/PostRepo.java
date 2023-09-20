package com.api.own.my.rest_project.repositories;

import com.api.own.my.rest_project.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, Long> {

//        List<User> findBy();

}
