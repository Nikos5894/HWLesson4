package com.company.cursor;

import java.util.Arrays;

public class Sphere extends SpaceShape {
    private final double radius;
    private double area;
    private double volume;

    public Sphere(Point[] verticles, double radius) {
        super(verticles);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = 4 * Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getVolume() {
        volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "Sphere{" + "verticles=" + Arrays.toString(getVerticles()) + ",radius=" + radius + ", " +
                "area=" + area +
                ", volume=" + volume +
                '}';
    }
}
