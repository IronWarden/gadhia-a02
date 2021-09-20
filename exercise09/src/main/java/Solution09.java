/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
Exercise 9 - Paint Calculator
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output
You will need to purchase 2 gallons of paint to cover 360 square feet.
Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints
Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.
 */

import java.util.Scanner;


public class Solution09 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt the user for input
        System.out.println("What is the length and width?");
        // scan the input
        double length = in.nextDouble();
        double width = in.nextDouble();
        double area = length * width;

        calcAmountPaint(area);
    }

    public static void calcAmountPaint(double area ){
        double oneGallonCoverage = 350;
        int amountPaint;
        // to determine if you only need 1 gallon of paint run an if condition
        if(area < oneGallonCoverage) {
            amountPaint = 1;
        }
        else {
            amountPaint = (int)Math.ceil(area / oneGallonCoverage);
        }
        System.out.printf("You will need %d gallons of paint to cover %.1f square feet.", amountPaint, area
        );
    }

}
