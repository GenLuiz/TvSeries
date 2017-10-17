package com.genus.model;

import java.sql.Date;

public class Episode {

    private String name;
    private int episodeNumber;
    private String airingDate;
    private String summary;
    private Season season;

    public Episode() { }

    public Episode(String name, int episodeNumber, String airingDate, String summary, Season season) {
        this.name = name;
        this.episodeNumber = episodeNumber;
        this.airingDate = airingDate;
        this.summary = summary;
        this.season = season;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }
    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getAiringDate() {
        return airingDate;
    }
    public void setAiringDate(String airingDate) {
        this.airingDate = airingDate;
    }

    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }


    public Season getSeason() {
        return season;
    }
    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return String.format("S%sE%s - %s", season.getSeasonNumber(), episodeNumber, name);
    }
}
