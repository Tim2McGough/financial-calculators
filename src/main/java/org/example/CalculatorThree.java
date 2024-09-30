package org.example;

import java.util.Scanner;

public class CalculatorThree {
    public static void main(String[] args) {


        System.out.println("Hello, welcome to the Annuity calculator.\n Please enter the monthly payout: ");
        Scanner keyboard = new Scanner(System.in);
        // User enters monthly payout
        double monthlyPayout = keyboard.nextDouble();
        // User enters annual interest rate
        System.out.println("Enter the annual interest rate as a percentage i.e. 5 for 5%: ");
        double annualInterest = keyboard.nextDouble();
        double monthlyInterest = annualInterest/100/12; // First convert to decimal then divide by months in year

        // User enters Years to payout
        System.out.println("Enter the number of years allotted for payout: ");
        int years = keyboard.nextInt();
        int period = 12*years;

        double presentValue = monthlyPayout * (1-(1/Math.pow(1+monthlyInterest,period)))/monthlyInterest;

        System.out.printf("The present value of the annuity is: $%.2f\n",presentValue );
        }

    }
