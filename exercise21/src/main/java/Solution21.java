/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */
import java.util.*;
public class Solution21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user
        System.out.println("Please enter the number of the month: ");
        // scan input
        int month = in.nextInt();

        // method to find month name
       String monthName =  findMonth(month);

        //output
        System.out.printf("The name of the month is %s.", monthName);

    }

    private static String findMonth(int month) {
        String monthName;
        switch (month) {
            case 1:  monthName = "January";
                break;
            case 2:  monthName = "February";
                break;
            case 3:  monthName = "March";
                break;
            case 4:  monthName = "April";
                break;
            case 5:  monthName = "May";
                break;
            case 6:  monthName = "June";
                break;
            case 7:  monthName = "July";
                break;
            case 8:  monthName = "August";
                break;
            case 9:  monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
            default: monthName = "Invalid month";
                break;
        }
        return monthName;
    }

}
