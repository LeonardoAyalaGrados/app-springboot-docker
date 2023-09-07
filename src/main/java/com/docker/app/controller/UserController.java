package com.docker.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
