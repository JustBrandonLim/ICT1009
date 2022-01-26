package io.github.justbrandonlim.task2;

public class Dog extends Animal {

    public Dog(String name, int age, String color) {
        super(name, age, color);
        System.out.println("In dog constructor");
    }

    @Override
    public void greetings() {
        System.out.println("Woof woof");
    }

    @Override
    public void printInfo() {
        System.out.print("Dog " + this.name + " is " + this.age + " years old and is of " + this.color  + " color ");
    }
}
