package com.genus.model;

import java.util.List;

public abstract class Channel {

    private String name;
    private List<TvSerie> tvSeries;

    public Channel() { }

    public Channel(String name, List<TvSerie> tvSeries) {
        this.name = name;
        this.tvSeries = tvSeries;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<TvSerie> getTvSeries() {
        return tvSeries;
    }
    public void setTvSeries(List<TvSerie> tvSeries) {
        this.tvSeries = tvSeries;
    }
}
