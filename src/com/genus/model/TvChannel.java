package com.genus.model;

import java.util.List;

public class TvChannel extends Channel {

    public TvChannel() { }

    public TvChannel(String name, List<TvSerie> tvSeries) {
        super(name, tvSeries);
    }
}
