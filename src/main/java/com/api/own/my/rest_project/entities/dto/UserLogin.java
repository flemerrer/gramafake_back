package com.api.own.my.rest_project.entities.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import lombok.NonNull;

@RequiredArgsConstructor
@Accessors(fluent = true) @Getter
public class UserLogin {

    private final @NonNull String username;

    private final @NonNull String password;

}
