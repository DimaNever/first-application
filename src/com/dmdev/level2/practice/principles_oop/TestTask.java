package com.dmdev.level2.practice.principles_oop;

/**
 * Внимание. При выполнении задания держите в уме принцип инкапсуляции.
 * <p>
 * Создать класс Point, описывающий точку в двумерных координатах.
 * Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y.
 * Добавьте функционал для получения скрытой информации (координаты точки),
 * а получить её можно только с помощью методов доступа (get/set).
 * Создать метод distance, принимающий объект Point и определяющий расстояние до неё.
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
 * В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
 * <p>
 * Создать следующие методы в классе Rectangle:
 * - Высчитывающий площадь прямоугольника
 * - Высчитывающий длину диагонали
 * <p>
 * Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle
 * и применение вышеперечисленных методов.
 */
public class TestTask {
    public static void main(String[] args) {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(7, 3);

        System.out.println(Point.distance(point1,point2));
        System.out.println(Point.distance(point2,point1));

        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println(rectangle.getAreaOfRectangle());
        System.out.println(rectangle.getDiagonalLength());
    }
}
