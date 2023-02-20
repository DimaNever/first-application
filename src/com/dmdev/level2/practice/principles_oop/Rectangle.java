package com.dmdev.level2.practice.principles_oop;

public class Rectangle {

    private Point leftUpperCorne;
    private Point rightLowerCorner;

    public Rectangle(Point leftUpperCorne, Point rightLowerCorner) {
        this.leftUpperCorne = leftUpperCorne;
        this.rightLowerCorner = rightLowerCorner;
    }

    public Point getLeftUpperCorne() {
        return leftUpperCorne;
    }

    public void setLeftUpperCorne(Point leftUpperCorne) {
        this.leftUpperCorne = leftUpperCorne;
    }

    public Point getRightLowerCorner() {
        return rightLowerCorner;
    }

    public void setRightLowerCorner(Point rightLowerCorner) {
        this.rightLowerCorner = rightLowerCorner;
    }

    public double getAreaOfRectangle() {
        return Math.abs((getLeftUpperCorne().getX() - getRightLowerCorner().getX())
                * (getLeftUpperCorne().getY() - getRightLowerCorner().getY()));
    }

    public double getDiagonalLength() {
        return Point.distance(leftUpperCorne, rightLowerCorner);
    }


}
