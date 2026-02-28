package com.disaster.management.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disaster.management.entity.User;
import com.disaster.management.repository.UserRepository;
import com.disaster.management.security.JwtUtil;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*") // ← allow frontend from any origin (good for development)
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    // ────────────────────────────────────────────────
    //                  REGISTER ENDPOINT
    // ────────────────────────────────────────────────
    @PostMapping("/register")
    public ResponseEntity<Map<String, String>> register(@RequestBody User user) {

        Map<String, String> response = new HashMap<>();

        // Basic validation
        if (user.getEmail() == null || user.getPassword() == null) {
            response.put("status", "error");
            response.put("message", "Email and password are required");
            return ResponseEntity.badRequest().body(response);
        }

        // Check if user already exists
        Optional<User> existing = userRepository.findByEmail(user.getEmail());
        if (existing.isPresent()) {
            response.put("status", "error");
            response.put("message", "Email already registered");
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        }

        try {
            // Save the new user (password is plain text – remember to hash later!)
            userRepository.save(user);
            response.put("status", "success");
            response.put("message", "User Registered Successfully!");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("status", "error");
            response.put("message", "Registration failed: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    // ────────────────────────────────────────────────
    //                     LOGIN ENDPOINT
    // ────────────────────────────────────────────────
    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, String> request) {

        Map<String, Object> response = new HashMap<>();

        String email = request.get("email");
        String password = request.get("password");

        // Debug log – will appear in console
        System.out.println("LOGIN ATTEMPT → Email: " + email);

        // Validate input
        if (email == null || email.trim().isEmpty() || password == null || password.trim().isEmpty()) {
            response.put("status", "error");
            response.put("message", "Email and password are required");
            return ResponseEntity.badRequest().body(response);
        }

        // Find user
        Optional<User> userOptional = userRepository.findByEmail(email.trim());

        System.out.println("User found in database: " + userOptional.isPresent());

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            System.out.println("Stored password: " + user.getPassword());

            // Compare passwords (plain text comparison – unsafe in production!)
            if (user.getPassword().equals(password)) {
                try {
                    // Generate JWT
                    String token = jwtUtil.generateToken(email);
                    response.put("status", "success");
                    response.put("message", "Login successful");
                    response.put("token", token);

                    // Optional: add more user info if needed
                    // response.put("user", Map.of("email", user.getEmail(), "role", user.getRole()));

                    System.out.println("LOGIN SUCCESS → Token generated");
                    return ResponseEntity.ok(response);
                } catch (Exception e) {
                    System.out.println("JWT generation failed: " + e.getMessage());
                    response.put("status", "error");
                    response.put("message", "Failed to generate token");
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
                }
            } else {
                System.out.println("LOGIN FAILED → Password mismatch");
                response.put("status", "error");
                response.put("message", "Invalid password");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
            }
        } else {
            System.out.println("LOGIN FAILED → User not found");
            response.put("status", "error");
            response.put("message", "User not found");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }
}