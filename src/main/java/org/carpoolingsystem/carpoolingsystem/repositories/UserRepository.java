package org.carpoolingsystem.carpoolingsystem.repositories;

import org.carpoolingsystem.carpoolingsystem.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
