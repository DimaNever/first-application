package com.dmdev.level2.practice.figures;

public class Square extends Figure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    public double getSide() {
        return side;
    }
}
