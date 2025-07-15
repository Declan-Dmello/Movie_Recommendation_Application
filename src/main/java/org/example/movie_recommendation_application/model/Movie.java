package org.example.movie_recommendation_application.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Transient;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "original_title")
    private String originalTitle;

    private String genres;
    private String overview;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "poster_path")
    private String posterPath;


    @Column(name = "vote_average")
    private double voteAverage;

    private String director;
    private String actor;

    // Default constructor
    public Movie() {}

    // Constructor - core database fields
    public Movie(String originalTitle, String genres, String overview,
                 String releaseDate, String posterPath, double voteAverage,
                 String director, String actor) {
        this.originalTitle = originalTitle;
        this.genres = genres;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.posterPath = posterPath;
        this.voteAverage = voteAverage;
        this.director = director;
        this.actor = actor;
    }

    // Full constructor including transient fields
    public Movie(String imdbId, String originalTitle, String genres, String overview,
                 String releaseDate, String posterPath, String productionCompanies,
                 double voteAverage, String director, String actor) {
        this.originalTitle = originalTitle;
        this.genres = genres;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.posterPath = posterPath;
        this.voteAverage = voteAverage;
        this.director = director;
        this.actor = actor;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", originalTitle='" + originalTitle + '\'' +
                ", genres='" + genres + '\'' +
                ", overview='" + overview + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", posterPath='" + posterPath + '\'' +
                ", voteAverage=" + voteAverage +
                ", director='" + director + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
}