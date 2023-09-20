package com.api.own.my.rest_project.repositories;

import com.api.own.my.rest_project.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {

//        List<User> findBy();

}
