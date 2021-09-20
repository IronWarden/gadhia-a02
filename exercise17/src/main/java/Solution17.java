/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
import java.util.*;
public class Solution17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // promp the user
        promptUser();
        // scan
        // prevent non-numeric values
        for(int i = 0; i < 4; i++){
            if(in.hasNextInt()) {
                System.out.println("Value is valid");
            }
            else{
                System.out.println("Invalid input");
               System.exit(0);
            }
        }
        int gender = in.nextInt();
        int alcoholConsumed = in.nextInt();
        int weight = in.nextInt();
        int hoursLastDrink = in.nextInt();

        // determine if male or female
         double r = determineGender(gender);

         //calculate the BAC
       double bloodAlcohol =  calcBAC(r, alcoholConsumed, weight, hoursLastDrink);
       // print it
        System.out.printf("Your BAC is %.6f%n", bloodAlcohol);

       // compare the BAC
       if(bloodAlcohol > 0.08) {
           System.out.println("It is not legal for you to drive.");
       }
       else {
           System.out.println("It is legal for you to drive.");
       }
    }

    private static double determineGender(int gender) {
        double r;
        if (gender == 1) {
            r = 0.73;
        }
        else {
            r = 0.66;
        }
        return r;
    }

    private static double calcBAC(double r, int alcoholConsumed, int weight, int hoursLastDrink) {
        return (alcoholConsumed * 5.14/ weight * r) - .015 * hoursLastDrink;

    }

        private static void promptUser () {
            System.out.println("Enter a 1 if you are male or a 2 if you are female:");
            System.out.println("How many ounces of alcohol did you have?");
            System.out.println("What is your weight, in pounds?");
            System.out.println("How many hours has it been since your last drink?");
        }

}

