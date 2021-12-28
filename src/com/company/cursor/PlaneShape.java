package com.company.cursor;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(Point[] verticles) {
        super(verticles);
    }


}
