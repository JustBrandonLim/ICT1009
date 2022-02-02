package com.justbrandonlim.task2;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        Shape figref;

        System.out.println("Inside Area for Rectangle.");
        figref = r;
        System.out.println("Area is " + figref.area());

        System.out.println("Inside Area for Triangle.");
        figref = t;
        System.out.println("Area is " + figref.area());

        System.out.println("Inside Area for Circle.");
        figref = c;
        System.out.println("Area is " + figref.area());

        System.out.println("Inside Area for Ellipse.");
        figref = e;
        System.out.println("Area is " + figref.area());

        System.out.println("Inside Area for Square.");
        figref = s;
        System.out.println("Area is " + figref.area());
    }
}
