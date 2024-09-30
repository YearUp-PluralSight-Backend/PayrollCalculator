package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your work hours: ");
        float hours = scanner.nextFloat();

        System.out.println("Enter your work rate: ");
        float rate = scanner.nextFloat();


        float salary  = 0;
        if (hours < 40) {
            salary = rate * hours;
        } else {
            float overtimeRate = rate * 1.5f;
            System.out.println("overtimeRate: " + overtimeRate);
            float overtimeHours = hours - 40;
            System.out.println("overtimeHours: " + overtimeHours);
            float overSalary =  (overtimeRate * overtimeHours);
            System.out.println("overSalary: " + overSalary);
            float regularSalary = (rate * 40f);
            System.out.println("regularSalary: " + regularSalary);
            salary = overSalary + regularSalary;

        }


        System.out.println(name + "'s salary is + " + salary);



    }
}
