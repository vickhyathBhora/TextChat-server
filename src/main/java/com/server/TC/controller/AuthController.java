package com.server.TC.controller;

import org.springframework.web.bind.annotation.*;
import com.server.TC.model.User;
import com.server.TC.repository.UserRepository;
@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "https://textchat-front.onrender.com") // Allow frontend
public class AuthController {
    
 private final UserRepository repo;

    public AuthController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/signup")
    public User signup(@RequestBody User user) {

        System.out.println("=== Signup Data Received ===");
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Confirm Password: " + user.getConfirmPassword());
        System.out.println("============================");
  return repo.save(user);
       
    }
}
