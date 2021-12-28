package com.company.cursor;

public class Main {
    public static void main(String[] args) {
        Point[] point2d = new Point[3];
        point2d[0] = new Point(4, 5);
        point2d[1] = new Point(-1, 3);
        point2d[2] = new Point(0, 6);

        Point[] point3d = new Point[3];
        point3d[0] = new Point(1, 2, 3);
        point3d[1] = new Point(4, 5, 6);
        point3d[2] = new Point(6, 7, 8);


        Circle circle = new Circle(new Point[]{point2d[0]}, 9);
        circle.getArea();
        circle.getPerimeter();

        Triangle triangle = new Triangle(point2d);
        triangle.getPerimeter();
        triangle.getArea();

        Rectangle rectangle = new Rectangle(new Point[]{point2d[1]}, 2, 3.5);
        rectangle.getArea();
        rectangle.getPerimeter();

        SquarePyramid squarePyramid = new SquarePyramid(new Point[]{point3d[0]}, 6, 7.5);
        squarePyramid.getArea();
        squarePyramid.getVolume();

        Cuboid cuboid = new Cuboid(new Point[]{point3d[1]}, 10, 12, 14);
        cuboid.getArea();
        cuboid.getVolume();

        Sphere sphere = new Sphere(new Point[]{point3d[2]}, 13);
        sphere.getArea();
        sphere.getVolume();


        Shape[] figures = new Shape[6];
        figures[0] = triangle;
        figures[1] = circle;
        figures[2] = rectangle;
        figures[3] = squarePyramid;
        figures[4] = cuboid;
        figures[5] = sphere;
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);
        }

    }
}
