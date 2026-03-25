package com.example.rbac.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class TestController {
    
    @GetMapping("/public")
    public String publicAccess() {
        return "✅ Public Content - Anyone can see this!";
    }
    
    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userAccess() {
        return "👤 User Content - This is only for users with USER role!";
    }
    
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminAccess() {
        return "👑 Admin Content - This is only for users with ADMIN role!";
    }
}