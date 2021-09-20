/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items.
 Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
  Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
Constraints
Keep the input, processing, and output parts of your program separate. Collect the input,
 then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
 */

import java.util.Scanner;

public class Solution10 {
    private static void promptUser() {
        //loop the common output
        for(int i = 1; i < 4; i++) {
            System.out.printf("%nEnter the price of item %d: ", i);
            System.out.printf("%nEnter the quantity of item %d:", i);
        }
    }
    private static double calculateSubtotal(double price1, int quantity1, double price2, int quantity2, double price3, int quantity3)
    {
        // subtotal is equal to the sum of the product for each item
        return (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
    }
    private static double calculateTax(double subtotal) {
        return subtotal * 0.055;
    }
    private static double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public static void main(String[] args) {

        // prompt the user for the price and quantity of the item
        promptUser();

        // get input
        Scanner in = new Scanner(System.in);
        double price1 = in.nextDouble();
        int quantity1 = in.nextInt();
        double price2 = in.nextDouble();
        int quantity2 = in.nextInt();
        double price3 = in.nextDouble();
        int quantity3 = in.nextInt();

        // calculate
        double subtotal = calculateSubtotal(price1, quantity1, price2, quantity2, price3, quantity3);
        double tax = calculateTax(subtotal);
        double total = calculateTotal(subtotal, tax);

        // print the output
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Tax: $%.2f%n", tax);
        System.out.printf("Total: $%.2f", total);
    }

}
