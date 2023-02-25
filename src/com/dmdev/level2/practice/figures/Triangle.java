package com.dmdev.level2.practice.figures;

public class Triangle extends Figure implements WithPerimeter{
    private double side1;
    private double side2;
    private double side3;

       public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getPoluPerimetr(){
        return (side1 + side2 + side3) / 2;
    }


    public double getHeight() {
        return 2 / side1 * Math.sqrt(getPoluPerimetr() * (getPoluPerimetr() - side1) * (getPoluPerimetr() - side2) * (getPoluPerimetr() - side3));
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPoluPerimetr() * (getPoluPerimetr() - side1) * (getPoluPerimetr() - side2) * (getPoluPerimetr() - side3));
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", poluPerimetr=" + getPoluPerimetr() +
                '}';
    }
}
