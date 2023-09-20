package com.api.own.my.rest_project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class Post {

    @Id
    private Long id;

    private String picture;

    private String description;

    private LocalDate date;

    @OneToOne
    User user;

    @OneToMany
    List<Comment> commentList;

    public Post(String picture, String description, User user) {
        this.picture = picture;
        this.description = description;
        this.user = user;
        this.date = LocalDate.now();
    }
}
