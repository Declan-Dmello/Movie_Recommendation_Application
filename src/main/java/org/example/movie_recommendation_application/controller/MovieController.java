package org.example.movie_recommendation_application.controller;

import org.example.movie_recommendation_application.model.Movie;
import org.example.movie_recommendation_application.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    // 1. Homepage
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // The  Search page
    @GetMapping("/search")
    public String showSearchPage() {
        return "search";
    }

    // 3. Recommend page (results from search)
    @GetMapping("/recommend")
    public String recommend(@RequestParam("query") String query, Model model) {
        Movie movie = movieService.getMovieByTitle(query);
        if (movie == null) {
            model.addAttribute("notFound", true);
            return "search";
        }

        List<Movie> recommendedMovies = movieService.getMoviesByIds(movie.getId());

        model.addAttribute("selectedMovie", movie);
        model.addAttribute("recommendedMovies", recommendedMovies); // Keep this as recommendedMovies
        return "recommend";
    }

    // 4. New endpoint to handle recommendations by movie ID
    @GetMapping("/recommendations")
    public String getRecommendationsByMovieId(@RequestParam("movieId") Long movieId, Model model) {
        // Get the selected movie
        Movie selectedMovie = movieService.getMovieById(movieId);
        if (selectedMovie == null) {
            return "redirect:/";
        }

        // Get recommendations for this movie
        List<Movie> recommendedMovies = movieService.getMoviesByIds(movieId);

        model.addAttribute("selectedMovie", selectedMovie);
        model.addAttribute("recommendedMovies", recommendedMovies);

        return "recommend";
    }
}