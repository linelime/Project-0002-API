package it.theboys.project0002api.repository;

import it.theboys.project0002api.model.base.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
