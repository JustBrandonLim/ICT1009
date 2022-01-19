package io.github.justbrandonlim.lab2.task2.bmi;

public class BMI {

	private double weight;
	private double height;
	private double BMI;
	
	public BMI() {}
	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
		this.BMI = (this.weight / Math.pow(this.height, 2)) * 703;
	}
	
	public double getBMI() {
		return this.BMI;
	}
	
	public String getInterpretation() {
		if (this.BMI < 18.5)
			return "Underweight";
		else if (this.BMI >= 18.5 && this.BMI < 25.0)
			return "Normal";
		else if (this.BMI >= 25.0 && this.BMI < 30.0)
			return "Overweight";
		else
			return "Obese";
	}
	
}
