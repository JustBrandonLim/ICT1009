package com.justbrandonlim.task1;

public class Manager extends Employee {
    private int handlingEmployees;

    public Manager(String name, int age, int eid, int handlingEmployees) {
        super(name, age, eid);
        super.setBaseSalary(5000);
        this.handlingEmployees = handlingEmployees;
    }

    public int getHandlingEmployees() {
        return handlingEmployees;
    }

    @Override
    public double calculateSalary() {
        double additionalSalary = ((double)(this.getHandlingEmployees()) / 100) * 75;
        return (this.getBaseSalary() + additionalSalary);
    }

    @Override
    public void printInfo() {
        System.out.println("Name of the employee:" + this.getName() + " is " + this.getAge() + " years old. His employee id is: " + this.getEid() + ". Handling: " + this.getHandlingEmployees() + ". Salary: " + this.calculateSalary());
    }
}
