/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
When working in a global environment, you’ll have to present information in both metric and Imperial units.
 And you’ll need to know when to do the conversion to ensure the most accurate results.

Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
 Then display the area in both square feet and square meters.
Example Output
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters
The formula for this conversion is m2 = f2 × 0.09290304

Constraints
Keep the calculations separate from the output.
Use a constant to hold the conversion factor.
 */
import java.util.*;
public class Solution07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt the user and store the data
        promptUser();
        // scan input
        int length = in.nextInt();
        int width = in.nextInt();

        // area in f2 is length * width
        int areaF2 = length * width;
        //calculate area m2
        double areaM2 = calcArea(areaF2);


        // output
        System.out.printf("You entered the dimensions of %d feet by %d feet.%n", length, width);
        System.out.printf("The area is %n%d square feet%n%.3f square meters",areaF2, areaM2);

    }

    private static double calcArea(int areaF2) {

        // area in m2 is f2 * 0.09290304
        final double conversionFactor = 0.09290304;
        double areaM2 = areaF2 * conversionFactor;
        return areaM2;
    }

    private static void promptUser() {
        System.out.println("What is the length of the room in feet?");

        System.out.println("What is the width of the room in feet?");
    }
}
