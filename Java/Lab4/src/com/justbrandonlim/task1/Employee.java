package com.justbrandonlim.task1;

public abstract class Employee {
    private int eid;
    private int age;
    private String name;
    private double baseSalary;

    public Employee(String name, int age, int eid) {
        this.name = name;
        this.age = age;
        this.eid = eid;
        this.baseSalary = baseSalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void orientation() {

    }

    public void printInfo() {}

    public abstract double calculateSalary();
}
