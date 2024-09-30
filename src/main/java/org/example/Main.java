package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*mortgage calculator used to calculate out how much a monthly payment for
    a loan would be (minus insurance and taxes) as well as how much interest would
    be paid over the life of the loan. Accepts interest rate loan
     length and display expected monthly payment and total interest paid.
    Uses a Compounded interest formula
     */
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the mortgage calculator.\n Please enter the principal of the loan! ");

        Scanner keyboard = new Scanner(System.in);
        float principal = keyboard.nextFloat();

        System.out.println("What is the interest rate you are approved for?");
        float annualInterest = keyboard.nextFloat();
            annualInterest = annualInterest/100;
            double monthlyInterest = annualInterest/12;

        System.out.println("How many years long do you want the loan to be? (Please enter a numerical value)");
        int length = keyboard.nextInt();
        double numberofPayments = length*12;

        double monthlyPayment = (principal * monthlyInterest * Math.pow(1+monthlyInterest,numberofPayments))/(Math.pow(1+ monthlyInterest, numberofPayments)-1);
        double totalPayment = monthlyPayment * numberofPayments;

        System.out.printf("A $%.2f loan at %.2f%% for %d years would have a monthly payment of $%.2f for a total of $%.2f \n ",principal,annualInterest,length,monthlyPayment,totalPayment);



    }
}



