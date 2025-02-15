package org.carpoolingsystem.carpoolingsystem.repositories;

import org.carpoolingsystem.carpoolingsystem.models.Ride;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends MongoRepository<Ride, String> {
}
