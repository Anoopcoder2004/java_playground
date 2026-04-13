package com.example.vivara_kendram.mapper;

import com.example.vivara_kendram.dto.userDTO;
import com.example.vivara_kendram.entity.User;

public class UserMapper {
    public static userDTO toDTO(User user){
        userDTO dto = new userDTO();
        dto.setName(user.getName());
        return dto;
    }
    public static User toEntity(userDTO dto){
        User user = new User();
        user.setName(dto.getName());
        return user;
    }
    
}
