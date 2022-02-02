package com.justbrandonlim.task1;

public class Developer extends Employee {
    private int testingCodes;
    private int developingCodes;

    public Developer(String name, int age, int eid, int testingCodes, int developingCodes) {
        super(name, age, eid);
        super.setBaseSalary(3500);
        this.testingCodes = testingCodes;
        this.developingCodes = developingCodes;
    }

    public int getTestingCodes() {
        return testingCodes;
    }

    public int getDevelopingCodes() {
        return developingCodes;
    }

    @Override
    public double calculateSalary() {
        double additionalSalary = ((double)(this.getTestingCodes()) / 100 * 25) + ((double)(this.getDevelopingCodes()) / 100 * 50);
        return this.getBaseSalary() + additionalSalary;
    }

    @Override
    public void printInfo() {
        System.out.println("Name of the employee:" + this.getName() + " is " + this.getAge() + " years old. His employee id is: " + this.getEid() + ". Testing Codes: " + this.getTestingCodes() + " Developing Codes: " + this.getDevelopingCodes() + ". Salary: " + this.calculateSalary());
    }
}
