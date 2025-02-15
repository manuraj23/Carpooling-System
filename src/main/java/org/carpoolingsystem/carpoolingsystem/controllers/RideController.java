package org.carpoolingsystem.carpoolingsystem.controllers;

import org.carpoolingsystem.carpoolingsystem.models.Ride;
import org.carpoolingsystem.carpoolingsystem.repositories.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rides")
@CrossOrigin(origins = "http://localhost:8080") // Allow frontend access
public class RideController {

    @Autowired
    private RideRepository rideRepository;

    @PostMapping
    public Ride createRide(@RequestBody Ride ride) {
        return rideRepository.save(ride);
    }

    @GetMapping
    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }
}
