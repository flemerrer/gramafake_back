package com.api.own.my.rest_project.entities;

import com.api.own.my.rest_project.entities.dto.CommentSend;
import com.api.own.my.rest_project.entities.dto.PostSend;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private LocalDate date;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;

    public Comment(String description, Post post, User user) {
        this.description = description;
        this.post = post;
        this.user = user;
        this.date = LocalDate.now();
    }

    public CommentSend toDto() {
        CommentSend commentDTO = new CommentSend(this.user.getUsername(), this.user.getProfilePic(), this.getDescription(), this.getDate());
        return commentDTO;
    }
}
