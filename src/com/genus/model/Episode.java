package com.genus.model;

import java.sql.Date;

public class Episode {

    private String name;
    private int episodeNumber;
    private String airingDate;
    private String summary;

    private TvSerie tvSerie;
    private Season season;

    public Episode() { }

    public Episode(String name, int episodeNumber, String airingDate, String summary, TvSerie tvSerie, Season season) {
        this.name = name;
        this.episodeNumber = episodeNumber;
        this.airingDate = airingDate;
        this.summary = summary;
        this.tvSerie = tvSerie;
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

    public TvSerie getTvSerie() {
        return tvSerie;
    }
    public void setTvSerie(TvSerie tvSerie) {
        this.tvSerie = tvSerie;
    }

    public Season getSeason() {
        return season;
    }
    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return String.format("%s - S%sE%s - %s", tvSerie.getName(), season.getSeasonNumber(), episodeNumber, name);
    }
}
