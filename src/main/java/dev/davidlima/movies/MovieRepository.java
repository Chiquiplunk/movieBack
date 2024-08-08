package dev.davidlima.movies;

import java.util.Optional;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Description of MovieRepository.
 *
 * @author David Lima
 */

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

  Optional<Movie> findMovieByImdbId(String imdbId);
}
