package com.api.own.my.rest_project.services;

import com.api.own.my.rest_project.entities.User;
import com.api.own.my.rest_project.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public void create(User user) {
        userRepo.save(user);
    }

    public User getOne(Long id) {
        return userRepo.findById(id).get();
    }

    public Optional<User> getUserByName(String username){
        return userRepo.findByUsername(username);
    }

    public List<User> getAll() {
        return userRepo.findAll();
    }

    public void update(User user) {
        userRepo.save(user);
    }

    public void delete(Long id) {
        userRepo.deleteById(id);
    }

}
