
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
Exercise 12 - Computing Simple Interest
Computing simple interest is a great way to quickly figure out whether an investment has value.
It’s also a good way to get comfortable with explicitly coding the order of operations in your programs.

Create a program that computes simple interest. Prompt for the principal amount,
the rate as a percentage, and the time, and display the amount accrued (principal + interest).

The formula for simple interest is A = P(1 + rt), where P is the principal amount,
r is the annual rate of interest, t is the number of years the amount is invested,
and A is the amount at the end of the investment.

Example Output
Enter the principal: 1500
Enter the rate of interest: 4.3
Enter the number of years: 4
After 4 years at 4.3%, the investment will be worth $1758.
Constraints
Prompt for the rate as a percentage (like 15, not .15). Divide the input by 100 in your program.
Ensure that fractions of a cent are rounded up to the next penny.
Ensure that the output is formatted as money.
 */

import java.util.Scanner;
public class Solution12 {
    private static void promptUser(){
        System.out.println("Enter the principal: ");
        System.out.println("Enter the rate of interest: ");
        System.out.println("Enter the number of years: ");
    }
    private static double calculateInterest(double principalAmount, double interestRate, int numYears) {
        double percentInterest = (interestRate)/100.0;
        double interest = principalAmount*(1 + (percentInterest * numYears));
        return Math.ceil(interest * 100)/100.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt user
        promptUser();
        //scan the input
        double principalAmount = in.nextDouble();
        double interestRate = in.nextDouble();
        int numYears = in.nextInt();

        // calculate the interest
        double investmentAmount = calculateInterest(principalAmount, interestRate, numYears);

        // print the output
        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.1f", numYears, interestRate, investmentAmount);

    }
}
