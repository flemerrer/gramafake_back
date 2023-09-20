package com.api.own.my.rest_project.controllers;

import com.api.own.my.rest_project.entities.Comment;
import com.api.own.my.rest_project.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("/all")
    public List<Comment> fetchAll(){
        return commentService.getAll();
    }

    @GetMapping("/{id}")
    public Comment fetchOne(@PathVariable Long id){
        return commentService.getOne(id);
    }

    @PostMapping("/create")
    public ResponseEntity createComment(@RequestParam Long postId, @RequestParam String username, @RequestBody Comment newComment){

        commentService.create(postId, username, newComment);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOne(@PathVariable Long id){
        commentService.delete(id);
        return ResponseEntity.notFound().build();
    }
    
}

