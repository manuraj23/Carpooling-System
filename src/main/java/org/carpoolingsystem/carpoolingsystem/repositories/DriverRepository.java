package org.carpoolingsystem.carpoolingsystem.repositories;

import org.carpoolingsystem.carpoolingsystem.models.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface DriverRepository extends MongoRepository<Driver, String> {
    Optional<Driver> findByEmail(String email);
}
