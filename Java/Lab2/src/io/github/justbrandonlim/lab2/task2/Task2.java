package io.github.justbrandonlim.lab2.task2;

import java.util.Scanner;

import io.github.justbrandonlim.lab2.task2.bmi.BMI;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your weight in pounds:");
		double weight = scanner.nextDouble();
		
		System.out.println("Enter your height in inches:");
		double height = scanner.nextDouble();
		
		BMI bmi = new BMI(weight, height);
		
		System.out.println("The BMI is " + String.format("%.2f", bmi.getBMI()));
		
		System.out.println(bmi.getInterpretation());
		
		scanner.close();
	}
	
}
