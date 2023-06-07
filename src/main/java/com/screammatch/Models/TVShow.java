package com.screammatch.Models;

import java.util.List;

public class TVShow extends Media {

    private List<Season> seasons;

    public TVShow(String name, int releaseYear, double score, int numberAllScores, List<Season> seasons) {
        super(name, releaseYear, score, numberAllScores);
        this.seasons = seasons;
    }

    // Getter e setter para o atributo seasons

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
