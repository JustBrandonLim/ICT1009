package io.github.justbrandonlim.task1;

import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan() {

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date(System.currentTimeMillis());
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = this.annualInterestRate / 1200;
        return (this.loanAmount * monthlyInterestRate) / (1 - (1 / Math.pow(1 + monthlyInterestRate, this.numberOfYears * 12)));
    }

    public double getTotalPayment() {
        return this.getMonthlyPayment() * this.numberOfYears * 12;
    }
}
