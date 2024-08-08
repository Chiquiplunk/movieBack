package dev.davidlima.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Description of ReviewRepository.
 *
 * @author David Lima
 */

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
