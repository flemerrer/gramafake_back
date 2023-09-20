package com.api.own.my.rest_project.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    private String username;

    private String password;

    private String profilePic;

    @OneToMany
    List<Post> postList;

    @OneToMany
    List<Comment> commentList;

    public User(String username, String password, String profilePic) {
        this.username = username;
        this.password = password;
        this.profilePic = profilePic;
    }

}
