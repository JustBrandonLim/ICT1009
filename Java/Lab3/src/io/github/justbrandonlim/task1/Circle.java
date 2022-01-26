package io.github.justbrandonlim.task1;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, this.radius);
    }

    public double getDiameter() {
        return 2 * this.radius;
    }
}
