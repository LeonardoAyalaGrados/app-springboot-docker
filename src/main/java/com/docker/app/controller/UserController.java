package com.docker.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.docker.app.entity.User;
import com.docker.app.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
    private UserRepository userRepository;

    @GetMapping("/list")
    public List<User> findAllUser(){
        return userRepository.findAll();
    }

    @PostMapping("/save")
    public User userSave(@RequestBody User user){
        return userRepository.save(user);
    }

}
