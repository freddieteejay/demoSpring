package com.example.demo.data.repository;

import com.example.demo.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {

}
