package com.pluralsight;

import java.util.Scanner;

/**
 * The PayrollCalculator class provides a simple payroll calculator
 * that prompts the user for their name, work hours, and work rate, then calculates
 * and displays their salary.
 */
public class PayrollCalculator {

    // Scanner object to read user input
    static Scanner scanner = new Scanner(System.in);

    /**
     * The main method is the entry point of the application.
     * It prompts the user for their name, work hours, and work rate,
     * then calculates and displays their salary.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your work hours: ");
        float hours = scanner.nextFloat();

        System.out.println("Enter your work rate: ");
        float rate = scanner.nextFloat();

        float salary = 0;
        if (hours < 40) {
            salary = rate * hours;
        } else {
            float overtimeRate = rate * 1.5f;
            System.out.println("overtimeRate: " + overtimeRate);
            float overtimeHours = hours - 40;
            System.out.println("overtimeHours: " + overtimeHours);
            float overSalary = overtimeRate * overtimeHours;
            System.out.println("overSalary: " + overSalary);
            float regularSalary = rate * 40f;
            System.out.println("regularSalary: " + regularSalary);
            salary = overSalary + regularSalary;
        }

        System.out.println(name + "'s salary is " + salary);
    }
}