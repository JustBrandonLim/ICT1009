package io.github.justbrandonlim.task2;

public class Animal {

    protected String color;
    protected int age;
    protected String name;

    public Animal() {}
    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("In animal constructor");
    }

    public void greetings() {
        System.out.println("Generic greeting");
    }

    public void printInfo() {
        System.out.println("Generic print info");
    }
}
