package com.justbrandonlim.task1;

import java.util.Scanner;

public class Main implements PlayString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        System.out.println("Input a string");
        System.out.print("Inputted String: ");
        String input = scanner.nextLine();
        System.out.println("backward is: " + main.backwardsString(input).toString());
        scanner.close();
    }

    @Override
    public StringBuilder backwardsString(String s) {
        return new StringBuilder(s).reverse();
    }
}
