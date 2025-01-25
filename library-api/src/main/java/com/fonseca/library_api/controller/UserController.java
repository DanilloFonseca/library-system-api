package com.fonseca.library_api.controller;

import com.fonseca.library_api.model.User;
import com.fonseca.library_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> getAllUser(){
        List<User> userList = repository.findAll();
        return userList;
    }
}
