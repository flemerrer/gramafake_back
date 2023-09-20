package com.api.own.my.rest_project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class User {

    @Id
    private Long id;

    private String pseudo;

    private String password;

    private String profilepic;

    @OneToMany
    List<Post> postList;

    @OneToMany
    List<Comment> commentList;

    public User(String pseudo, String password, String profilepic) {
        this.pseudo = pseudo;
        this.password = password;
        this.profilepic = profilepic;
    }

}
