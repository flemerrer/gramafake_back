package com.api.own.my.rest_project.services;

import com.api.own.my.rest_project.entities.Comment;
import com.api.own.my.rest_project.entities.dto.CommentSend;
import com.api.own.my.rest_project.repositories.CommentRepo;
import com.api.own.my.rest_project.repositories.PostRepo;
import com.api.own.my.rest_project.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    PostRepo postRepo;

    public void create(Long postId, String username, Comment newComment) {
        Comment createComment = new Comment();
        createComment.setDescription(newComment.getDescription());
        createComment.setUser(userRepo.findByUsername(username).get());
        createComment.setPost(postRepo.findById(postId).get());
        createComment.setDate(LocalDate.now());
        commentRepo.save(createComment);
    }

    public Comment getOne(Long id) {
        return commentRepo.findById(id).get();
    }

    public List<CommentSend> getAll() {
        return commentRepo.findAll().stream().map(comment -> comment.toDto()).toList();
    }

    public void update(Comment comment) {
        commentRepo.save(comment);
    }

    public void delete(Long id) {
        commentRepo.deleteById(id);
    }

}
