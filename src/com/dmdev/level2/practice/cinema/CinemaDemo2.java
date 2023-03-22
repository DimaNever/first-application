package com.dmdev.level2.practice.cinema;

import static com.dmdev.level2.practice.cinema.Genre.ACTION;
import static com.dmdev.level2.practice.cinema.Genre.COMEDY;
import static com.dmdev.level2.practice.cinema.Genre.DRAMA;
import static com.dmdev.level2.practice.cinema.Genre.FANTASY;

/**
 * Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id), Год издания, Месяц издания, Жанр и Рейтинг;
 * - Кинотеатр, где есть всего лишь одно единственное поле: отсортированный ассоциативный массив,
 * где ключом является год издания, а значением - все фильмы, выпустившиеся в этом году.
 * <p>
 * Добавить функционал в кинотеатр таким образом, чтобы можно было:
 * - добавлять в него новый фильм
 * - получить все фильмы по переданному году
 * - получить все фильмы по переданному году и месяцу
 * - получить все фильмы по переданному жанру
 * - получать ТОП-10 фильмов отсортированные по Рейтингу в порядке убывания
 * <p>
 * Учесть следующее:
 * - в кинотеатре фильмы должны храниться в порядке их добавления в него
 * (т.е. предусмотреть порядок значения ассоциативного массива)
 * - не должен добавляться фильм, если такой уже есть в кинотеатре
 * Продемонстрировать работу кинотеатра в отдельном классе.
 */
public class CinemaDemo2 {

    public static void main(String[] args) {
        Film film1 = new Film(6, 1998, 5, COMEDY, 9.5);
        Film film2 = new Film(2, 2006, 6, DRAMA, 9.5);
        Film film3 = new Film(3, 2020, 1, ACTION, 7.7);
        Film film4 = new Film(4, 1986, 6, COMEDY, 8.0);
        Film film5 = new Film(5, 2002, 12, ACTION, 6.3);
        Film film6 = new Film(8, 2012, 10, DRAMA, 7.1);
        Film film7 = new Film(1, 1998, 3, ACTION, 8.2);
        Film film8 = new Film(10, 2008, 8, COMEDY, 8.8);
        Film film9 = new Film(15, 2015, 5, ACTION, 6.0);
        Film film10 = new Film(20, 2017, 7, ACTION, 8.3);
        Film film11 = new Film(50, 2005, 6, COMEDY, 8.7);
        Film film12 = new Film(6, 1998, 9, ACTION, 7.5);

        Film film17 = new Film(6, 1998, 5, COMEDY, 9.5);

        Cinema2 cinema2 = new Cinema2();
        cinema2.addNewFilm(film1);
        cinema2.addNewFilm(film2);
        cinema2.addNewFilm(film3);
        cinema2.addNewFilm(film4);
        cinema2.addNewFilm(film5);
        cinema2.addNewFilm(film6);
        cinema2.addNewFilm(film7);
        cinema2.addNewFilm(film8);
        cinema2.addNewFilm(film9);
        cinema2.addNewFilm(film10);
        cinema2.addNewFilm(film11);
        cinema2.addNewFilm(film12);

        System.out.println(cinema2);
        System.out.println(cinema2.getFilmsOfYear(1998));
        System.out.println(cinema2.getFilmsOfYear(1999));
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(cinema2.getFilmsOfYearAndMonth(2020, 1));
        System.out.println(cinema2.getFilmsOfYearAndMonth(2020, 2));
        System.out.println("****************************************************************************");
        System.out.println(cinema2.getFilmsOfGenre(ACTION));
        System.out.println(cinema2.getFilmsOfGenre(FANTASY));
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(cinema2.topList());
        System.out.println("****************************************************************************");
        cinema2.addNewFilm(film17);
    }
}
