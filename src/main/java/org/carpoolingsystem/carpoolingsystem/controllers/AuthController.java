package org.carpoolingsystem.carpoolingsystem.controllers;

import org.carpoolingsystem.carpoolingsystem.models.Driver;
import org.carpoolingsystem.carpoolingsystem.models.Rider;
import org.carpoolingsystem.carpoolingsystem.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/driver/signup")
    public ResponseEntity<String> registerDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(authService.registerDriver(driver));
    }

    @PostMapping("/rider/signup")
    public ResponseEntity<String> registerRider(@RequestBody Rider rider) {
        return ResponseEntity.ok(authService.registerRider(rider));
    }

    @PostMapping("/driver/login")
    public ResponseEntity<String> loginDriver(@RequestParam String email, @RequestParam String password) {
        return authService.loginDriver(email, password)
                .map(driver -> ResponseEntity.ok("Login successful!"))
                .orElse(ResponseEntity.badRequest().body("Invalid credentials"));
    }

    @PostMapping("/rider/login")
    public ResponseEntity<String> loginRider(@RequestParam String email, @RequestParam String password) {
        return authService.loginRider(email, password)
                .map(rider -> ResponseEntity.ok("Login successful!"))
                .orElse(ResponseEntity.badRequest().body("Invalid credentials"));
    }
}
