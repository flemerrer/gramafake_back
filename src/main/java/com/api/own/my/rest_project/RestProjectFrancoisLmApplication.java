package com.api.own.my.rest_project;

import com.api.own.my.rest_project.entities.Comment;
import com.api.own.my.rest_project.entities.Post;
import com.api.own.my.rest_project.entities.User;
import com.api.own.my.rest_project.entities.dto.NewUser;
import com.api.own.my.rest_project.repositories.CommentRepo;
import com.api.own.my.rest_project.repositories.PostRepo;
import com.api.own.my.rest_project.repositories.UserRepo;
import com.api.own.my.rest_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class RestProjectFrancoisLmApplication implements CommandLineRunner {

    @Autowired
    UserRepo userRepo;

    @Autowired
    PostRepo postRepo;

    @Autowired
    CommentRepo commentRepo;

    public static void main(String[] args) {
        SpringApplication.run(RestProjectFrancoisLmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        if (userRepo.findByUsername("pascal").isEmpty()) {
            userRepo.save(new User("pascal", "pascal", "https://post.medicalnewstoday.com/wp-content/uploads/sites/3/2020/03/GettyImages-1092658864_hero-1024x575.jpg"));
            Post post = new Post("https://img.freepik.com/free-photo/assortment-leaves-flowers-white-background_24972-2180.jpg?w=740&t=st=1695214431~exp=1695215031~hmac=d60116fa4783d7c4b0c72a0769b7745964272be050edc12f595b6bc327758623",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", userRepo.findByUsername("pascal").get());
            post.setDate(LocalDate.now());
            postRepo.save(post);
            Post post2 = new Post("https://img.freepik.com/free-photo/assortment-leaves-flowers-white-background_24972-2180.jpg?w=740&t=st=1695214431~exp=1695215031~hmac=d60116fa4783d7c4b0c72a0769b7745964272be050edc12f595b6bc327758623",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.", userRepo.findByUsername("pascal").get());
            post2.setDate(LocalDate.now());
            postRepo.save(post2);
            Comment com1 = new Comment("this is a comment", postRepo.findById(1L).get(), userRepo.findById(1L).get());
            com1.setDate(LocalDate.now());
            commentRepo.save(com1);
        }
    }
}
