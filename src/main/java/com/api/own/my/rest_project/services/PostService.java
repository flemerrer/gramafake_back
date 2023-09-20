package com.api.own.my.rest_project.services;

import com.api.own.my.rest_project.entities.Post;
import com.api.own.my.rest_project.entities.dto.NewPost;
import com.api.own.my.rest_project.repositories.PostRepo;
import com.api.own.my.rest_project.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;
    @Autowired
    UserRepo userRepo;

    public void create(String username, NewPost newPost) {
        Post createPost = new Post();
        createPost.setPicture(newPost.picture());
        createPost.setDescription(newPost.description());
        createPost.setUser(userRepo.findByUsername(username).get());
        createPost.setDate(LocalDate.now());
        postRepo.save(createPost);
    }

    public Post getOne(Long id) {
        return postRepo.findById(id).get();
    }

    public List<Post> getAll() {
        return postRepo.findAll();
    }

    public void update(Post post) {
        postRepo.save(post);
    }

    public void delete(Long id) {
        postRepo.deleteById(id);
    }

}
