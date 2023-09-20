package com.api.own.my.rest_project.entities.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import lombok.NonNull;

@RequiredArgsConstructor
@Accessors(fluent = true) @Getter
public class NewUser {

    private final String username;

    private final String password;

    private final String profilepic;

}
