package org.example.movie_recommendation_application.repository;

import org.example.movie_recommendation_application.model.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    List<Recommendation> findByMovieId(Long movieId);  // Fetch recommendations for a given movie ID
}
