package com.pluralsight;

import java.util.Scanner;

/**
 * The PayrollCalculatorWithMethod class provides a simple payroll calculator
 * that prompts the user for their name, work hours, and work rate, then calculates
 * and displays their salary.
 */
public class PayrollCalculatorWithMethod {

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
        String name = promptForName();
        float hours = promptForFloat("hours");
        float rate = promptForFloat("rate");
        float salary = payrollCalculator(hours, rate);
        System.out.println(name + "'s salary is " + salary);
    }


    /**
     * Prompts the user for a float value based on the given option.
     *
     * @param option The type of input to prompt for ("hours" or "rate")
     * @return The float value entered by the user
     */
    private static float promptForFloat(String option) {
        float nextFloat = 0f;
        if (option.equalsIgnoreCase("hours")) {
            System.out.println("Enter your work hours: ");
        } else if (option.equalsIgnoreCase("rate")) {
            System.out.println("Enter your work rate: ");
        }

        try {
            nextFloat = scanner.nextFloat();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nextFloat;
    }

    /**
     * Prompts the user for their name.
     *
     * @return The name entered by the user
     */
    private static String promptForName() {
        String name = "";
        try {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return name;
    }

    /**
     * Calculates the salary based on the given hours and rate.
     * If hours are less than 40, the salary is calculated as rate * hours.
     * If hours are 40 or more, the salary includes overtime pay.
     *
     * @param hours The number of hours worked
     * @param rate The hourly rate
     * @return The calculated salary
     */
    private static float payrollCalculator(float hours, float rate) {
        float salary = 0;

        if (hours < 40) {
            salary = rate * hours;
        } else {
            float overtimeRate = rate * 1.5f;
            float overtimeHours = hours - 40;
            float overSalary = overtimeRate * overtimeHours;
            float regularSalary = rate * 40f;
            salary = overSalary + regularSalary;
        }

        return salary;
    }
}