package org.example.movie_recommendation_application.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recommendation {

    @Id
    private Long movieId;  // The ID of the movie being recommended
    private Long rec1;     // First recommended movie
    private Long rec2;     // Second recommended movie
    private Long rec3;     // Third recommended movie
    private Long rec4;     // Fourth recommended movie
    private Long rec5;     // Fifth recommended movie

    // Default constructor
    public Recommendation() {}

    // Constructor for easy initialization
    public Recommendation(Long movieId, Long rec1, Long rec2, Long rec3, Long rec4, Long rec5) {
        this.movieId = movieId;
        this.rec1 = rec1;
        this.rec2 = rec2;
        this.rec3 = rec3;
        this.rec4 = rec4;
        this.rec5 = rec5;
    }

    // Getters and Setters
    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getRec1() {
        return rec1;
    }

    public void setRec1(Long rec1) {
        this.rec1 = rec1;
    }

    public Long getRec2() {
        return rec2;
    }

    public void setRec2(Long rec2) {
        this.rec2 = rec2;
    }

    public Long getRec3() {
        return rec3;
    }

    public void setRec3(Long rec3) {
        this.rec3 = rec3;
    }

    public Long getRec4() {
        return rec4;
    }

    public void setRec4(Long rec4) {
        this.rec4 = rec4;
    }

    public Long getRec5() {
        return rec5;
    }

    public void setRec5(Long rec5) {
        this.rec5 = rec5;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "movieId=" + movieId +
                ", rec1=" + rec1 +
                ", rec2=" + rec2 +
                ", rec3=" + rec3 +
                ", rec4=" + rec4 +
                ", rec5=" + rec5 +
                '}';
    }
}
