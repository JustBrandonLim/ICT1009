package io.github.justbrandonlim.task2;

public class Task2 {

    public static void main(String[] args) {
        Animal dog = new Dog("Milo", 2, "Brown");
        Animal cat = new Cat("Whiskey", 3, "Brown");
        Animal duck = new Duck("Do", 1, "White");
        Animal pig = new Pig("Po", 10, "Pink");

        dog.printInfo();
        dog.greetings();
        cat.printInfo();
        cat.greetings();
        duck.printInfo();
        duck.greetings();
        pig.printInfo();
        pig.greetings();
    }

}
