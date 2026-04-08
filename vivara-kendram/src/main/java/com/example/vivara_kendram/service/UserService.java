package com.example.vivara_kendram.service;

import com.example.vivara_kendram.entity.User;
import com.example.vivara_kendram.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;

    }
    public User createUser(User user){
        return repo.save(user);
    }

    public List <User> getAllUsers(){
        return repo.findAll();
    }

    public User getUser(Long id){
        return repo.findById(id).orElseThrow();
    }
    public void deleteUser(Long id){
        repo.deleteById(id);
    }
}
