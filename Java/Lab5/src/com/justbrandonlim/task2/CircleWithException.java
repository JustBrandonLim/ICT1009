package com.justbrandonlim.task2;

public class CircleWithException {

    private double radius;

    public CircleWithException(double radius) throws IllegalArgumentException {
        if (radius < 0)
            throw new IllegalArgumentException();
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) throws IllegalArgumentException {
        if (radius < 0)
            throw new IllegalArgumentException();
        this.radius = radius;
    }

    public double getArea() throws Exception {
        double area = Math.PI * Math.pow(this.getRadius(), 2);
        if (area > 1000)
            throw new Exception();
        return area;
    }

    public double getDiameter() {
        return 2 * Math.PI * this.getRadius();
    }
}
