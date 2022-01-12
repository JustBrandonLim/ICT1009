package me.brandon.lab1.task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("Enter the amount in USD");
			float usd = scanner.nextFloat();
			
			if (usd < 0)
				break;
			else
				System.out.println("The final amount in SGD " + usd * 1.35 );
		}
		
		scanner.close();
	}

}
