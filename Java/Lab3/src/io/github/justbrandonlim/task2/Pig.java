package io.github.justbrandonlim.task2;

public class Pig extends Animal {

    public Pig(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In pig constructor");
    }

    @Override
    public void greetings() {
        System.out.println("Oink");
    }

    @Override
    public void printInfo() {
        System.out.print("Pig " + super.name + " is " + this.age + " years old and is of " + this.color + " color ");
    }
}
