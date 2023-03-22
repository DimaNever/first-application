package com.dmdev.level2.practice.cinema;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Cinema2 {

    private Map<Integer, Set<Film>> filmLibrary = new TreeMap<>();

    //    public void addNewFilm(Film film) {
//        if (!(filmLibrary.containsKey(film.getYear()))) {
//            Set<Film> filmList = new LinkedHashSet<>();
//            filmList.add(film);
//            filmLibrary.put(film.getYear(), filmList);
//        } else {
//            for (Map.Entry<Integer, Set<Film>> entry : filmLibrary.entrySet()) {
//                Set<Film> value = entry.getValue();
//                for (Film filmVal : value) {
//                    if (filmVal.getId() == film.getId()) {
//                        System.out.println("The film is already in the cinema");
//                        return;
//                    } else if (entry.getKey() == film.getYear()) {
//                        Set<Film> filmList = entry.getValue();
//                        filmList.add(film);
//                        filmLibrary.put(film.getYear(), filmList);
//                    }
//                }
//            }
//        }
//    }
    public void addNewFilm(Film film) {
        Set<Film> filmList = filmLibrary.getOrDefault(film.getYear(), new LinkedHashSet<>());

        System.out.println(filmList.add(film));
        filmLibrary.put(film.getYear(), filmList);
    }


    public List<Film> getFilmsOfYear(int year) {
        List<Film> films = new LinkedList<>();
        if (!filmLibrary.containsKey(year)) {
            System.out.println("There are no films for the given year");
            return films;
        } else {
            filmLibrary.get(year);
            for (Map.Entry<Integer, Set<Film>> entry : filmLibrary.entrySet()) {
                if (year == entry.getKey()) {
                    Set<Film> filmSet = entry.getValue();
                    films.addAll(filmSet);
                }
            }
        }
        return films;
    }


    public List<Film> getFilmsOfYearAndMonth(int year, int month) {
        List<Film> films = new LinkedList<>();
        if (!filmLibrary.containsKey(year)) {
            System.out.println("No films for this year and month");
            return films;
        }

        for (Map.Entry<Integer, Set<Film>> entry : filmLibrary.entrySet()) {
            Set<Film> value = entry.getValue();
            for (Film film : value) {
                if (year == entry.getKey() && month == film.getMonth()) {
                    films.add(film);
                }
            }
        }

        if (films.isEmpty()) {
            System.out.println("No films for this year and month");
        }
        return films;
    }

    public List<Film> getFilmsOfGenre(Genre genre) {
        List<Film> films = new ArrayList<>();
        for (Set<Film> filmSet : filmLibrary.values()) {
            for (Film film : filmSet) {
                if (genre.equals(film.getGenre())) {
                    films.add(film);
                }
            }
        }

        if (films.isEmpty()) {
            System.out.println("This genre is not in the cinema");
        }
        return films;
    }

    public List<Film> topList() {
        Set<Film> films = new TreeSet<>(Comparator.comparing(Film::getRating).thenComparing(Film::getId).reversed());
//        Collection<Set<Film>> values = filmLibrary.values();
//        films.addAll(values);  // как реализовать?
        for (Set<Film> filmSet : filmLibrary.values()) {
            films.addAll(filmSet);
        }
        return new ArrayList<>(films).subList(0, 9);
    }

    @Override
    public String toString() {
        return "Cinema2{" +
                "filmLibrary=" + filmLibrary +
                '}';
    }
}
