package com.api.own.my.rest_project.entities.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDate;

@RequiredArgsConstructor
@Accessors(fluent = true) @Getter
public class NewPost {

    private final @NonNull String picture;

    private final @NonNull String description;

}
