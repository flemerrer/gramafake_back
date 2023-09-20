package com.api.own.my.rest_project.controllers;

import com.api.own.my.rest_project.entities.User;
import com.api.own.my.rest_project.entities.dto.NewUser;
import com.api.own.my.rest_project.entities.dto.UserLogin;
import com.api.own.my.rest_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> fetchAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User fetchOne(@PathVariable Long id){
        return userService.getOne(id);
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody NewUser newUser){

        if (userService.getUserByName(newUser.username()).isEmpty()){
            userService.create(newUser);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(409).build();
        }
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody UserLogin userLogin){

        User checkUser= userService.getUserByName(userLogin.username()).get();

        if (checkUser != null && checkUser.getPassword() == userLogin.password()){
            return ResponseEntity.ok().body(userLogin.username());
        } else {
            return ResponseEntity.status(409).build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity updateUser(@PathVariable Long id, NewUser newUser){

        User updateUser = userService.getOne(id);

        if (updateUser != null){
            updateUser.setUsername(newUser.username());
            updateUser.setPassword(newUser.password());
            updateUser.setProfilepic(newUser.profilepic());
            userService.update(updateUser);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteOne(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.notFound().build();
    }


}

