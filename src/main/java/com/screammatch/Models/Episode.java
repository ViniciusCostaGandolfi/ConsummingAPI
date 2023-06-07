package com.screammatch.Models;

public class Episode {
    private String name;
    private int timeInMinutes;

    public Episode(String name, int timeInMinutes) {
        this.name = name;
        this.timeInMinutes = timeInMinutes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

}
