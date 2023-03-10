package com.dmdev.level2.practice.figures;

/**
 * Создать иерархию классов, описывающих геометрические фигуры на плоскости.
 * <p>
 * - Можно пользоваться результатами предыдущего ДЗ.
 * - В иерархии должно быть не менее 10 классов/интерфейсов и хотя бы 2 уровня вложенности.
 * - Продемонстрировать переопределение методов в иерархии.
 * - Продемонстрировать добавление собственных методов в классах-наследниках (можно с помощью интерфейсов).
 * <p>
 * Например, расчёт диагонали в прямоугольнике, расчёт высоты в треугольнике.
 * <p>
 * - При разработке иерархии держать в уме принцип инкапсуляции, выбирать корректные имена классов и методов,
 * пользоваться преимуществами полиморфизма.
 * - Отдавайте предпочтение интерфейсам, а не абстрактным классам.
 * - При переопределении методов обязательно использовать аннотацию @Override
 * - Не создавать лишних классов в системе (полностью дублирующих или не содержащих назначения)
 * - Каждый класс должен выполнять своё назначение.
 * <p>
 * - Создать общие методы:
 * 1. Рассчитывающий площадь фигуры.
 * 2. Принимающий в качестве параметра фигуру и определяющий, равны ли площади текущей и полученной фигуры.
 * <p>
 * - Создать класс ShapeUtils со статическими методами:
 * 1. Определяющим, является ли фигура прямоугольником.
 * 2. Определяющим, является ли фигура треугольником.
 * <p>
 * - Для каждого неабстрактного класса переопределить метод toString() класса для представления информации
 * о классах в строковой форме.
 * <p>
 * В этом задании нет одного правильного решения, подойдите к нему творчески.
 */
public class FigureTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        Circle circle = new Circle(100);
        Triangle triangle = new Triangle(10, 10, 10);
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(triangle);
        System.out.println(ShapeUtils.isRectangle(circle));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(circle.isAreaEqual(rectangle));
        System.out.println();
        System.out.println(triangle.getHeight());
    }
}
