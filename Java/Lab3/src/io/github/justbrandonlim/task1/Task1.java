package io.github.justbrandonlim.task1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter circle radius:");

        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        System.out.println("Enter length of rectangle:");

        double length = scanner.nextDouble();

        System.out.println("Enter the breadth of rectangle:");

        double breadth = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(breadth, length);

        System.out.println("A circle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());

        scanner.close();
    }

}
