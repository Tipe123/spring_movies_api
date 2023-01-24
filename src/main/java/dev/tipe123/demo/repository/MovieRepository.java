package dev.tipe123.demo.repository;

import dev.tipe123.demo.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
//    Automatic queries

    Optional<Movie> findMovieByImdbId(String imdbId);
}
