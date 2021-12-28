package com.company.cursor;

import java.util.Arrays;

public class Circle extends PlaneShape {
    private double perimeter;
    private double area;
    private final double radius;

    public Circle(Point[] verticles, double radius) {
        super(verticles);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getArea() {

        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" + "verticles=" + Arrays.toString(getVerticles()) + "," +
                "radius" + radius + " /" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
