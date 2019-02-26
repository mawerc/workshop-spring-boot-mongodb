package ao.co.mawercardoso.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ao.co.mawercardoso.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
