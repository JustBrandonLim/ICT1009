package io.github.justbrandonlim.task2;

public class Cat extends Animal {

    public Cat() {}
    public Cat(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In cat constructor");
    }

    @Override
    public void greetings() {
        System.out.println("Meow");
    }

    @Override
    public void printInfo() {
        System.out.print("Dog " + this.name + " is " + this.age + " years old and is of " + this.color + " color ");
    }
}
