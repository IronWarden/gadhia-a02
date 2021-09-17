/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Rishi Gadhia
 */

/*
Your computer knows what the current year is, which means you can incorporate that into your programs.
 You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire.
 It should prompt for your current age and the age you want to retire and display the output as shown in the example
that follows.
Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.

 */
import java.time.LocalDate;
import java.util.*;
public class Solution06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // get the current year
        LocalDate current_date = LocalDate.now();
        int current_Year = current_date.getYear();


        // prompt the user for current age,
        System.out.println("What is your current age?");
        int age = in.nextInt();
        System.out.println("At what age would you like to retire?");
        int ageRetire = in.nextInt();

        // the date of retirement is current year plus ageRetire - age
        int dateRetirement = current_Year + (ageRetire - age);

        // print the output
        System.out.printf("It's %d, so you can retire in %d.", current_Year, dateRetirement);

    }









}
