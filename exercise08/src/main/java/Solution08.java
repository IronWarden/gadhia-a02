/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright Rishi Gadhia
 */
/*
Exercise 8 - Pizza Party
Division isn’t always exact, and sometimes you’ll write programs that will need to deal with
the leftovers as a whole number instead of a decimal.

Write a program to evenly divide pizzas. Prompt for the number of people,
the number of pizzas, and the number of slices per pizza. Ensure that the number of pieces comes out even.
Display the number of pieces of pizza each person should get. If there are leftovers,
show the number of leftover pieces.

Example Output
How many people? 8
How many pizzas do you have? 2
How many slices per pizza? 8
8 people with 2 pizzas (16 slices)
Each person gets 2 pieces of pizza.
There are 0 leftover pieces.
 */

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // prompt the user for input
        promptUser();
        //scan input
        int numPeople = in.nextInt();
        int numPizzas = in.nextInt();
        int slicesPizza = in.nextInt();

        // calculate the assignment using mod and output
        calcPizza(numPeople, numPizzas, slicesPizza);
    }
    private static void calcPizza(int numPeople, int numPizzas, int slicesPizza) {
        int calcPizza;
        int totalSlices = numPizzas * slicesPizza;
        // leftover slices can be calculated with the mod function and 2 cases
        if ((totalSlices % numPeople) == 0) {
            int result = totalSlices / numPeople;
            System.out.printf("%d people with %d pizzas (%d slices)", numPeople, numPizzas, totalSlices);
            System.out.printf("%nEach person gets %d pieces of pizza.%n", result);
            System.out.println("There are 0 leftover slices.");
        } else {
            int remPizza = totalSlices % numPeople;
            // subtract the remainder to get an even division
            calcPizza = (totalSlices - remPizza) / numPeople;
            System.out.printf("%d people with %d pizzas (%d slices)", numPeople, numPizzas, totalSlices);
            System.out.printf("%nEach person gets %d pieces of pizza.%n", calcPizza);
            System.out.printf("There are %d leftover slices.", remPizza);
        }
    }

    private static void promptUser() {
        System.out.println("How many people?");
        System.out.println("How many pizzas do you have?");
        System.out.println("How many slices per pizza?");
    }
}
