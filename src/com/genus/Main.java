package com.genus;

import com.genus.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Season> seasons = new ArrayList<>();

        Genre genre = new Genre("Sci-fi");

        Season season = new Season();
        season.setSeasonName("The Empire Rises");
        season.setSeasonNumber(1);

        seasons.add(season);

        TvSerie tvSerie = new TvSerie();
        tvSerie.setGenre(genre);
        tvSerie.setName("Star Wars");
        tvSerie.setSeasons(seasons);

        List<TvSerie> tvSeries = new ArrayList<>();

        tvSeries.add(tvSerie);

        TvChannel tvChannel = new TvChannel();
        tvChannel.setName("Walt Disney");
        tvChannel.setTvSeries(tvSeries);

        Episode episode = new Episode();
        episode.setAiringDate("15/12/2017");
        episode.setEpisodeNumber(1);
        episode.setName("Darth Genus");
        episode.setSeason(season);
        episode.setTvSerie(tvSerie);
        episode.setSummary("Who is Darth Genus? check this episode and find out who is disturbing the force");

        List<Episode> episodes = new ArrayList<>();
        episodes.add(episode);

        season.setEpisodes(episodes);

        System.out.println("Check the newest episode!");
        System.out.println(episode);

    }
}
