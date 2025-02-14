package org.carpoolingsystem.carpoolingsystem.repositories;

import org.carpoolingsystem.carpoolingsystem.models.Rider;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface RiderRepository extends MongoRepository<Rider, String> {
    Optional<Rider> findByEmail(String email);
}
