package com.justbrandonlim.task1;

public class Designer extends Employee {
    private int noOfDesigns;

    public Designer(String name, int age, int eid, int noOfDesigns) {
        super(name, age, eid);
        super.setBaseSalary(2500);
        this.noOfDesigns = noOfDesigns;
    }

    public int getNoOfDesigns() {
        return noOfDesigns;
    }

    @Override
    public double calculateSalary() {
        double additionalSalary = (double)(this.getNoOfDesigns()) / 100 * 50;
        return this.getBaseSalary() + additionalSalary;
    }

    @Override
    public void printInfo() {
        System.out.println("Name of the employee:" + this.getName() + " is " + this.getAge() + " years old. His employee id is: " + this.getEid() + ". No of designs done: " + this.getNoOfDesigns() + ". Salary: " + this.calculateSalary());
    }
}
