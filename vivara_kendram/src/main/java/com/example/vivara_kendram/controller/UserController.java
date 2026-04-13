package com.example.vivara_kendram.controller;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;


import com.example.vivara_kendram.dto.userDTO;
import com.example.vivara_kendram.entity.User;
import com.example.vivara_kendram.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// @RequestMapping("/users")
// public class UserController {

//     public final UserService service;

//     public UserController(UserService service){
//         this.service = service;
//     }

//     @PostMapping
//     public User create(@RequestBody User user){
//         return service.createUser(user);
//     }

//     @GetMapping
//     public List<User> getAll(){
//         return service.getAllUsers();
//     }

//     @GetMapping("/{id}")
//     public User getOne(@PathVariable Long id){
//         return service.getUser(id);
//     }

//     @DeleteMapping("/{id}")
//     public ResponseEntity<Map<String,String>> delete(@PathVariable Long id){
//         Map<String,String> response = new HashMap<>();

//         //check if user exists
//         Optional<User> user = service.getUserOptional(id);
//         if(user.isEmpty()){
//             response.put("status","error");
//             response.put("message","User with id " +  id + " not found");
//             return ResponseEntity.status(404).body(response);
//         }
//         service.deleteUser(id);
//         response.put("status","success");
//         response.put("message", "User with id "+ id + " deleted successfully" );
//         return ResponseEntity.ok(response);
//     }

//     @PutMapping("/{id}")
//     public User updatUser(@PathVariable Long id, @RequestBody User user){
//         return service.updateUser(id, user);
//     }
// }

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@Valid @RequestBody userDTO dto) {
        return userService.createUser(dto);
    }

    @GetMapping
    public List<userDTO> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public userDTO getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        String userName = userService.getUserById(id).getName();
        userService.deleteUser(id);
        return "user " + userName + "deleted successfully";
    }

   @PutMapping("/{id}")
   public userDTO updateUser(@PathVariable Long id,@Valid @RequestBody userDTO dto){
        return userService.updateUser(id, dto);
   }    

}
