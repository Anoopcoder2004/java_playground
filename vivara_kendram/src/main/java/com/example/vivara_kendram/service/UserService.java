package com.example.vivara_kendram.service;

import com.example.vivara_kendram.dto.userDTO;
import com.example.vivara_kendram.entity.User;
import com.example.vivara_kendram.repository.UserRepository;
import org.springframework.stereotype.Service;
// import java.util.List;
// import java.util.Optional;

// @Service
// public class UserService {
//     private final UserRepository repo;

//     public UserService(UserRepository repo){
//         this.repo = repo;

//     }
//     public User createUser(User user){
//         return repo.save(user);
//     }

//     public List <User> getAllUsers(){
//         return repo.findAll();
//     }

//     public User getUser(Long id){

//         return repo.findById(id).orElseThrow();
//     }
//     public void deleteUser(Long id){
//         repo.deleteById(id);
//     }
//     public User updateUser(Long id,User user){
//         User existing = repo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
//         existing.setName(user.getName());
//         existing.setEmail(user.getEmail());
//         return repo.save(existing);
//     }
//     public Optional<User> getUserOptional(Long id){
//         return repo.findById(id);//
//     }
// }

import org.springframework.stereotype.Service;

import com.example.vivara_kendram.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(userDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setAge(0);

        return userRepository.save(user);
    }

    public List<userDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> {
                    userDTO dto = new userDTO();
                    dto.setName(user.getName());
                    return dto;
                })
                .toList();
    }

    public userDTO getUserById(Long id) {
        User user =  userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        
        userDTO dto = new userDTO();
        dto.setName(user.getName());
        return dto;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    public userDTO updateUser(Long id, userDTO dto) {
        User existing = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        existing.setName(dto.getName());
        userRepository.save(existing);
        userDTO response = new userDTO();
        response.setName(existing.getName());
        return response;
    }
}