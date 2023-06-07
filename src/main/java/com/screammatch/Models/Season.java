package com.screammatch.Models;

import java.util.List;

public class Season {
    protected String name;
    protected List<Episode> episodes;
    protected int timeInMinutes;

    public Season(String name, List<Episode> episodes) {
        this.name = name;
        this.episodes = episodes;
        this.calculateTimeInMinutes();
    }

    private void calculateTimeInMinutes() {
        int minutes = 0;
        for (Episode episode : episodes) {
            minutes += episode.getTimeInMinutes();
        }
        this.timeInMinutes = minutes;
    }

    public String getName() {
        return name;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpsisodes(List<Episode> episodes) {
        this.episodes = episodes;
        this.calculateTimeInMinutes();
    }

}
