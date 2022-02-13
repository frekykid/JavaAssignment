package com.company.objs;

public class Movie {

    private int movieID;
    private String movieName;
    private String language;

    public Movie(int movieID, String movieName) {
        this.movieID = movieID;
        this.movieName = movieName;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Movie(int movieID, String movieName, String language) {
        this.movieID = movieID;
        this.movieName = movieName;
        this.language = language;
    }
}
