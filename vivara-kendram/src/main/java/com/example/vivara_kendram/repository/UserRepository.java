package com.example.vivara_kendram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vivara_kendram.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}