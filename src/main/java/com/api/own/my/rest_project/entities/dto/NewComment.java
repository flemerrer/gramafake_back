package com.api.own.my.rest_project.entities.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Accessors(fluent = true) @Getter
public class NewComment {

    private final @NonNull String description;

}
