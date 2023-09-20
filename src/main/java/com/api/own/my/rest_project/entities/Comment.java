package com.api.own.my.rest_project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Comment {

    @Id
    private Long id;

    private String description;

    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;

    public Comment(String description, Post post, User user) {
        this.description = description;
        this.post = post;
        this.user = user;
    }
}
