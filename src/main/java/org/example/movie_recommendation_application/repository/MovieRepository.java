package org.example.movie_recommendation_application.repository;

import org.example.movie_recommendation_application.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findByOriginalTitleIgnoreCase(String originalTitle);
}
