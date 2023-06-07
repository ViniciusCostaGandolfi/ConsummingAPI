package com.screammatch.Models;

public class Media {
    protected String name;
    protected int releaseYear;
    protected double score;
    protected int numberAllScores;

    public Media(String name, int releaseYear, double score, int numberAllScores) {
        this.name = name;
        this.numberAllScores = numberAllScores;
        this.releaseYear = releaseYear;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getNumberAllScores() {
        return this.numberAllScores;
    }

    public void setNumberAllScores(int numberAllScores) {
        this.numberAllScores = numberAllScores;
    }

}
