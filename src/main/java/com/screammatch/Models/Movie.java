package com.screammatch.Models;

public class Movie extends Media {
    String director;
    protected int timeInMinutes;

    public Movie(String name, int releaseYear, double score, int numberAllScores, int timeInMinutes, String director) {
        super(name, releaseYear, score, numberAllScores);
        this.director = director;
        this.timeInMinutes = timeInMinutes;
    }

    String getDirector() {
        return this.director;
    }

    void setDirector(String director) {
        this.director = director;
    }

    public double getTimeInMinutes() {
        return this.timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

}