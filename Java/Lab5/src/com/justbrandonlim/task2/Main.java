package com.justbrandonlim.task2;

public class Main {

    public static void main(String[] args) {

        try {
            CircleWithException c1 = new CircleWithException(5);
            c1.getArea();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + ": Radius cannot be negative");
        } catch (Exception e) {
            System.out.println(e + ": area cannot be bigger than 1000");
        }

        try {
            CircleWithException c2 = new CircleWithException(1000);
            c2.getArea();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + ": Radius cannot be negative");
        } catch (Exception e) {
            System.out.println(e + ": area cannot be bigger than 1000");
        } finally {
            System.out.println("this is from finally");
        }

        try {
            CircleWithException c3 = new CircleWithException(-5);
            c3.getArea();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex + ": Radius cannot be negative");
        } catch (Exception e) {
            System.out.println(e + ": area cannot be bigger than 1000");
        } finally {
            System.out.println("this is from finally");
        }
    }
}
