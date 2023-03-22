package com.dmdev.level2.practice.cinema;

import java.util.Comparator;

public class MovieRatingComparator implements Comparator<Film> {



    @Override
    public int compare(Film o1, Film o2) {
        return Double.compare(o1.getRating(), o2.getRating());

    }
}
