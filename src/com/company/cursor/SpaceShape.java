package com.company.cursor;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    public SpaceShape(Point[] verticles) {
        super(verticles);
    }


}

