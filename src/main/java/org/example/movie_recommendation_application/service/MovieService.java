package org.example.movie_recommendation_application.service;

import org.example.movie_recommendation_application.model.Movie;
import org.example.movie_recommendation_application.model.Recommendation;
import org.example.movie_recommendation_application.repository.MovieRepository;
import org.example.movie_recommendation_application.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private RecommendationRepository recommendationRepository;

    public Movie getMovieByTitle(String title) {
        return movieRepository.findByOriginalTitleIgnoreCase(title).orElse(null);
    }

    public List<Movie> getMoviesByIds(Long movieId) {
        Recommendation rec = recommendationRepository.findByMovieId(movieId).stream().findFirst().orElse(null);
        if (rec == null) return List.of();

        List<Long> ids = List.of(rec.getRec1(), rec.getRec2(), rec.getRec3(), rec.getRec4(), rec.getRec5());
        return movieRepository.findAllById(ids);
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
    }



}
