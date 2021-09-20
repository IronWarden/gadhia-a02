/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
Program 16 - Legal Driving Age
You can test for equality, but you may need to test to see how a number compares to a
known value and display a message if the number is too low or too high.

Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
 If the user is sixteen or older, then the program should display "You are old enough to legally drive."
  If the user is under sixteen, the program should display "You are not old enough to legally drive."

Example Output
What is your age? 15
You are not old enough to legally drive.
Or

What is your age? 35
You are old enough to legally drive.
Constraints
Use a single output statement.
Use a ternary operator to write this program.
If your language doesn’t support a ternary operator, use a regular if/else statement,
and still use a single output statement to display the message.
 */
import java.util.*;
public class Solution16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user
        promptUser();
        // scan input
        int age = in.nextInt();

        // evaluate
        evaluate(age);
    }

    private static void evaluate(int age) {
        // use the ternary operator to make it one statement
        String result = (age < 16) ? "You are not old enough to legally drive." : "You are old enough to legally drive.";
        System.out.printf("%s", result);
    }

    private static void promptUser() {
        System.out.println("What is your age?");
    }
}
