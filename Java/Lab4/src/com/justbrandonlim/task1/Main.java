package com.justbrandonlim.task1;

public class Main {
    public static void main(String[] args) {
        Employee empRef;
        empRef = new Manager("Jasmine", 45, 123, 5);
        empRef.printInfo();

        empRef = new Developer("Aldo", 30, 345, 5, 2);
        empRef.printInfo();

        empRef = new Designer("Chris", 25, 780, 4);
        empRef.printInfo();
    }
}
