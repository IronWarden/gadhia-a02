
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
Exercise 11 - Currency Conversion
At some point, you might have to deal with currency exchange rates, and you’ll need to ensure your
calculations are as precise as possible.

Write a program that converts currency. Specifically, convert euros to U.S. dollars.
Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro.
 Print out the new amount in U.S. dollars.

The formula for currency conversion is derived from c_to / c_from = rate where

c_to is the amount in U.S. dollars.
c_from is the amount in euros.
rate is the per-unit current exchange rate from c_from to c_to.
Example Output
How many euros are you exchanging? 81
What is the exchange rate? 1.3751
81 euros at an exchange rate of 1.3751 is
111.39 U.S. dollars.
Constraints
Ensure that fractions of a cent are rounded up to the next penny.
Use a single output statement.
 */

import java.util.Scanner;

public class Solution11 {
    private static void promptUser(){
        System.out.println("How many euros are you exchanging?");
        System.out.println("What is the exchange rate?");
    }
    private static double conversion(double euros, double exchangeRate){
        // convert euros to USD by multiplying it by the exchange rate
        double usd = euros * exchangeRate;
        // fractions of a cent are rounded to the next penny
        return Math.ceil(usd * 100)/100.0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt the user
        promptUser();
        // scan the input
        double euros = in.nextDouble();
        double exchangeRate = in.nextDouble();

        // convert
        double usd = conversion(euros, exchangeRate);

        // print the output
        System.out.printf("%.2f Euros at an exchange rate of %f is%n%.2f U.S. dollars.", euros, exchangeRate, usd);

    }

}
