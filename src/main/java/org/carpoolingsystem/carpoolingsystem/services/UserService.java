package org.carpoolingsystem.carpoolingsystem.services;

import org.carpoolingsystem.carpoolingsystem.models.User;
import org.carpoolingsystem.carpoolingsystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user, String role) {
        if ("DRIVER".equalsIgnoreCase(role)) {
            user.setRole(1); // Driver
        } else if ("RIDER".equalsIgnoreCase(role)) {
            user.setRole(2); // Rider
        }
        userRepository.save(user);
    }

    public String authenticate(User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return "Login successful!";
        }
        return "Invalid credentials!";
    }
}
