package org.example;

import java.util.Scanner;

public class CalculatorTwo {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the CD calculator.\n Please enter the initial deposit: ");
        Scanner keyboard = new Scanner(System.in);
        double deposit = keyboard.nextDouble();

        System.out.println("Great, now enter the annual interest rate: ");
        double annualInterest = keyboard.nextDouble();
        annualInterest = annualInterest/100;

        System.out.println("Lastly, please enter the length of your CD in years: ");
        double length = keyboard.nextDouble();

        //Compound Interest formula
        int compoundPerYear = 365;
        double totalAmount = deposit * Math.pow(1+(annualInterest/compoundPerYear),compoundPerYear*length);
        // Interest earned
        double totalInterest = totalAmount-deposit;
        //Display
        System.out.printf("After %.2f years, your initial deposit of  $%.2f will have earned $%.2f. \n", length,deposit,totalInterest,totalAmount);
    }



    }

