/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rish Gadhia
 */
import java.util.*;
public class Solution22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user
        promptUser();
        // scan input
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int thirdNumber = in.nextInt();

        // check if they are all different
        int largestNumber = checkNumber(firstNumber, secondNumber, thirdNumber);
        // if its 0 exit
        if(largestNumber == 0) {
            System.exit(0);
        }

        //output
        System.out.printf("The largest number is %d.", largestNumber);

    }

    private static int checkNumber(int firstNumber, int secondNumber, int thirdNumber) {
        // any two that are same number would = 1
        if((firstNumber / secondNumber) == 1) {
            return 0;
        }
        if(secondNumber / thirdNumber ==1) {
            return 0;
        }
        else {
            int[] array = new int[]{firstNumber, secondNumber, thirdNumber};
            for(int i = 0; i < 2; i++) {
                // if an element is greater than one above it is swapped
                if(array[i] > array[i + 1]) {
                    array[i + 1] = array[i];
                }

            }
            // return the largest one
            return array[2];
        }
    }

    private static void promptUser() {
        System.out.println("Enter the first number:");
        System.out.println("Enter the second number:");
        System.out.println("Enter the third number:");
    }

}
