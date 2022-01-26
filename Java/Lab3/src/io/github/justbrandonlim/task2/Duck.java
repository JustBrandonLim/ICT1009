package io.github.justbrandonlim.task2;

public class Duck extends Animal {

    public Duck(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In duck constructor");
    }

    @Override
    public void greetings() {
        System.out.println("Quack");
    }

    @Override
    public void printInfo() {
        System.out.print("Duck " + this.name + " is " + this.age + " years old and is of " + this.color + " color ");
    }
}
