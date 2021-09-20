/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
import java.util.*;
public class Solution18 {
    public static final String CELSIUS = "Celsius";
    public static final String FAHRENHEIT = "Fahrenheit";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user
        promptUser();
        // scan input

        String choice = in.next();
        // create method that takes each case and returns a string
        String useChoice = scanChoice(choice);

        // make a case for each possible return
        if(useChoice.equals(FAHRENHEIT)){
            System.out.println("Your choice: C\nPlease enter the temperature in Fahrenheit:");
            int fahrenheit = in.nextInt();
            int degreeCelsius = calcCelsius(fahrenheit);
            System.out.printf("%nThe temperature in Celsius is %d.", degreeCelsius);


        }
        if(useChoice.equals(CELSIUS)){
            System.out.println("Your choice: F\nPlease enter the temperature in Celsius:");
            int celsius = in.nextInt();
             int degreeFahrenheit = calcFahrenheit(celsius);
            System.out.printf("%nThe temperature in Fahrenheit is %d.", degreeFahrenheit);

        }

    }

    private static int calcFahrenheit(int celsius) {
        return (celsius * 9/5) + 32;
    }

    private static int calcCelsius(int fahrenheit) {
        return (fahrenheit - 32)* 5/9;
    }

    private static String scanChoice(String choice) {
        if(choice.equals("F")) {
            return CELSIUS;
        }
        if(choice.equals("C")) {
            return FAHRENHEIT;
        }
        if(choice.equals("f")) {
            return CELSIUS;
        }
        if(choice.equals("c")) {
            return FAHRENHEIT;
        }
        else {
            return "Invalid input";
        }
    }

    private static void promptUser() {
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
    }
}
