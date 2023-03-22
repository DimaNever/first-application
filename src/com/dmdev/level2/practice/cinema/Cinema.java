package com.dmdev.level2.practice.cinema;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import static java.util.Collections.emptySet;

public class Cinema {

    private static final int TOP_CAPACITY = 10;
    private final Map<Integer, Set<Film>> cinemaMovies = new TreeMap<>();

    public void addMovie(Film... movies) {
        for (Film movie : movies) {
            var moviesByYear = cinemaMovies.getOrDefault(movie.getYear(), new LinkedHashSet<>());
            moviesByYear.add(movie);
            cinemaMovies.put(movie.getYear(), moviesByYear);
        }
    }

    public Set<Film> getMoviesBy(Integer year) {
        return cinemaMovies.getOrDefault(year, emptySet());
    }

    public Set<Film> getMoviesBy(Integer year, int month) {
        var result = new HashSet<Film>();
        var moviesByYear = cinemaMovies.getOrDefault(year, emptySet());
        for (Film movie : moviesByYear) {
            if (movie.getMonth() == month) {
                result.add(movie);
            }
        }

        return result;
    }

    public Set<Film> getMoviesBy(Genre genre) {
        var result = new HashSet<Film>();
        for (Set<Film> moviesByYear : cinemaMovies.values()) {
            for (Film movie : moviesByYear) {
                if (movie.getGenre() == genre) {
                    result.add(movie);
                }
            }
        }

        return result;
    }

    public List<Film> getTopMovies() {
        var topMovies = new ArrayList<Film>();
        for (Set<Film> moviesByYear : cinemaMovies.values()) {
            topMovies.addAll(moviesByYear);
        }
        topMovies.sort(new MovieRatingComparator().reversed());

        var topMoviesSize = Math.min(TOP_CAPACITY, topMovies.size());
        return topMovies.subList(0, topMoviesSize);
    }
}

