package com.api.own.my.rest_project;

import com.api.own.my.rest_project.entities.User;
import com.api.own.my.rest_project.entities.dto.NewUser;
import com.api.own.my.rest_project.repositories.UserRepo;
import com.api.own.my.rest_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestProjectFrancoisLmApplication implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(RestProjectFrancoisLmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
