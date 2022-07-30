package com.string.calculator;

import java.util.Scanner;

public class Main {
    /**
     * Code exercise (String Calculator)Using Test Driven and Object oriented approach
     *
     * create a simple
     *
     * @param args
     */
    public static void main(String[] args) {
        // write your code here
        StringCalculator stringCalculator = new StringCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();
        System.out.println("Enter a delimiter");
        String delimiter = sc.nextLine();
        System.out.println(stringCalculator.calculateIntegerSum(input, delimiter));
    }
}

