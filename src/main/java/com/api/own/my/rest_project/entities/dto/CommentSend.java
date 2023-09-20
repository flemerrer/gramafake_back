package com.api.own.my.rest_project.entities.dto;

import lombok.NonNull;

import java.time.LocalDate;

public class CommentSend {

    private final @NonNull String author;

    private final @NonNull String profilePic;

    private final LocalDate date;

    private final String description;

    public CommentSend(@NonNull String author, @NonNull String profilePic, @NonNull String description, @NonNull LocalDate date) {
        this.author = author;
        this.profilePic = profilePic;
        this.description = description;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getProfilepic() {
        return profilePic;
    }

}
