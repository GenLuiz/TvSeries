package com.genus.model;

import java.util.List;

public class StreamingChannel extends Channel {

    public StreamingChannel() {
    }

    public StreamingChannel(String name, List<TvSerie> tvSeries) {
        super(name, tvSeries);
    }
}
