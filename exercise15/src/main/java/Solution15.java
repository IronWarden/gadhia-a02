/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
/*
Exercise 15 - Password Validation
Passwords are validated by comparing a user-provided value with a known value that’s stored.
 Either it’s correct or it’s not.

Create a simple program that validates user login credentials.
The program must prompt the user for a username and password.
The program should compare the password given by the user to a known password.
If the password matches, the program should display “Welcome!” If it doesn’t match,
the program should display “I don’t know you.”

Example Output
What is the password? 12345
I don't know you.
Or

What is the password? abc$123
Welcome!
Constraints
Use an if/else statement for this problem.
Make sure the program is case sensitive.

 */
import java.util.*;
public class Solution15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //prompt user
        promptUser();
        //username not relevant scan password
        // scan the data
        String password = in.nextLine();

        // compare and output the result
        comparePassword(password);
    }

    private static void comparePassword(String password) {
        if(password.equals("abc$123")) {
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }

    private static void promptUser() {
        System.out.println("What is the password?");
    }
}
