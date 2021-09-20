/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
/*
Exercise 14 - Tax Calculator
You don’t always need a complex control structure to solve simple problems.
 Sometimes a program requires an extra step in one case, but in all other cases there’s nothing to do.

Write a simple program to compute the tax on an order amount.
The program should prompt for the order amount and the state.
If the state is “WI,” then the order must be charged 5.5% tax. The program should display
the subtotal, tax, and total for Wisconsin residents but display just the total for non-residents.

Example Output
What is the order amount? 10
What is the state? WI
The subtotal is $10.00.
The tax is $0.55.
The total is $10.55.
Or

What is the order amount? 10
What is the state? MN
The total is $10.00

Constraints
Implement this program using only a simple if statement—don’t use an else clause.
Ensure that all money is rounded up to the nearest cent.
Use a single output statement at the end of the program to display the program results.
 */
import java.util.*;
public class Solution14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt user
        promptUser();
        //scan the data
        double orderAmount = in.nextDouble();
        String state = in.next();

        //calculate tax
        double taxAmount = calculateTax(orderAmount);
        double totalAmount = calculateTotal(orderAmount, taxAmount);



        // output with if statement
        String total = "\nThe total is $" +totalAmount;
        if(state.equals("WI"))  {
            String subtotal = "\nThe subtotal is $" + orderAmount;

            String tax = "\nThe tax is $" + taxAmount;
            total = subtotal + tax + total;

        }
        System.out.println(" " + total );

    }

    private static double calculateTotal(double orderAmount, double tax) {
        return orderAmount + tax;
    }

    private static double calculateTax(double orderAmount) {
        double tax;
        tax = 0.055 * orderAmount;
        return Math.ceil(tax * 1000) / 1000.0;
    }

    private static void promptUser() {
        System.out.println("What is the order amount?");
        System.out.println("What is the state?");
    }
}
