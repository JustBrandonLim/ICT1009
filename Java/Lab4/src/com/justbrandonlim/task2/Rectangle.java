package com.justbrandonlim.task2;

public class Rectangle implements Shape {

    private double dim1, dim2;

    public Rectangle(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    @Override
    public double area() {
        return this.dim1 * this.dim2;
    }
}
