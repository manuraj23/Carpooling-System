package org.carpoolingsystem.carpoolingsystem.services;

import org.carpoolingsystem.carpoolingsystem.models.Driver;
import org.carpoolingsystem.carpoolingsystem.models.Rider;
import org.carpoolingsystem.carpoolingsystem.repositories.DriverRepository;
import org.carpoolingsystem.carpoolingsystem.repositories.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private RiderRepository riderRepository;

    public String registerDriver(Driver driver) {
        if (driverRepository.findByEmail(driver.getEmail()).isPresent()) {
            return "Email already exists!";
        }
        driverRepository.save(driver);
        return "Signup successful!";
    }

    public String registerRider(Rider rider) {
        if (riderRepository.findByEmail(rider.getEmail()).isPresent()) {
            return "Email already exists!";
        }
        riderRepository.save(rider);
        return "Signup successful!";
    }

    public Optional<Driver> loginDriver(String email, String password) {
        return driverRepository.findByEmail(email).filter(driver -> driver.getPassword().equals(password));
    }

    public Optional<Rider> loginRider(String email, String password) {
        return riderRepository.findByEmail(email).filter(rider -> rider.getPassword().equals(password));
    }
}