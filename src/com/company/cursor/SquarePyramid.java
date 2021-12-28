package com.company.cursor;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private final double baseWidth;
    private final double baseHeight;
    private double volume;
    private double area;

    public SquarePyramid(Point[] verticles, double baseHeight, double baseWidth) {
        super(verticles);
        this.baseHeight = baseHeight;
        this.baseWidth = baseWidth;
    }

    @Override
    public double getArea() {
        area = 2 * baseHeight * baseWidth + baseWidth * baseWidth;
        return area;
    }

    @Override
    public double getVolume() {
        volume = baseWidth * baseWidth * baseHeight / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" + "verticles=" + Arrays.toString(getVerticles()) + ",baseHeight= " + baseHeight + ", baseWidth=" + baseWidth + ", " +
                "volume=" + volume +
                ", area=" + area +
                '}';
    }
}
