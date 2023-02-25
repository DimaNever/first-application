package com.dmdev.level2.practice.figures;

public abstract class Figure {

    public abstract double getArea();

    public boolean isAreaEqual(Figure figure){
        return this.getArea() == figure.getArea();
    }
}
