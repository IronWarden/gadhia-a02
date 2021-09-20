/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */

import java.util.*;
public class Solution19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user
        promptUser();
        //scan user only scan for double
        for(int i = 0; i < 2; i++) {
            if(in.hasNextInt()) {
                System.out.println("Value is valid");
            }
            else {
                System.out.println("Try again but with numbers");
                System.exit(0);
            }
        }
        double height = in.nextDouble();
        double weight = in.nextDouble();

        //calculate BMI
        double bodyMassIndex = calcBMI(height, weight);
        // print BMI
        System.out.printf("Your BMI is %.1f.", bodyMassIndex);

        // if BMI is between 18.5 and 25 display that the person is at a normal weight
        // if they are below they are underweight
        // if they are above they are overweight

        if(bodyMassIndex < 18.5) {
            System.out.println("\nYou are underweight. You should see your doctor.");
        }
        if(bodyMassIndex > 25) {
            System.out.println("\nYou are overweight. You should see your doctor.");
        }
        else {
            System.out.println("\nYou are within the ideal weight range.");
        }
    }

    private static double calcBMI(double height, double weight) {
        return (weight / (height * height)) * 703;
    }

    private static void promptUser() {
        System.out.println("What is your height in inches?");
        System.out.println("What is your weight in pounds?");
    }
}
