package com.example.vivara_kendram.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.vivara_kendram.entity.User;
import com.example.vivara_kendram.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    public final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @PostMapping
    public User create(@RequestBody User user){
        return service.createUser(user);
    }

    @GetMapping
    public List<User> getAll(){
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable Long id){
        return service.getUser(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.deleteUser(id);
    }
}