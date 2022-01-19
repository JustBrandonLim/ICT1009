package io.github.justbrandonlim.lab2.task1;

import java.util.Scanner;

import io.github.justbrandonlim.lab2.task1.loan.Loan;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter annual interest rate, for example, 8.25:");
		double annualInterestRate = scanner.nextDouble();
		
		System.out.println("Enter number of years as an integer:");
		int numberOfYears = scanner.nextInt();
		
		System.out.println("Enter loan amount, for example, 120000. 95:");
		double loanAmount = scanner.nextDouble();
		
		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		System.out.println("The loan was created.");
		System.out.println("The monthly payment is " + String.format("%.2f", loan.getMonthlyPayment()));
		System.out.println("The total payment is " + String.format("%.2f", loan.getTotalPayment()));
		
		scanner.close();
	}

}
