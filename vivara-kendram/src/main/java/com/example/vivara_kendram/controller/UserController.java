package com.example.vivara_kendram.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Map<String,String>> delete(@PathVariable Long id){
        Map<String,String> response = new HashMap<>();
        
        //check if user exists
        Optional<User> user = service.getUserOptional(id);
        if(user.isEmpty()){
            response.put("status","error");
            response.put("message","User with id " +  id + " not found");
            return ResponseEntity.status(404).body(response);
        }
        service.deleteUser(id);
        response.put("status","success");
        response.put("message", "User with id "+ id + " deleted successfully" );
        return ResponseEntity.ok(response);
    }


    @PutMapping("/{id}")
    public User updatUser(@PathVariable Long id, @RequestBody User user){
        return service.updateUser(id, user);
    }
}