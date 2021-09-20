/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Rishi Gadhia
 */


import java.util.*;
public class Solution23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // prompt user
        System.out.println("Is the car silent when you turn the key?");
        String s1 = in.nextLine();
        // use diagram to branch all the cases into two main sections
        if(s1.equals("y")) {
            System.out.println("Are the battery terminals corroded?");
            String s2 = in.nextLine();
            batteryOption(s2);

        }
        if(s1.equals("n")) {
            System.out.println("Does the car make a slicking noise?");
            String s3 = in.nextLine();
            slickingNoise(s3);

        }

    }

    private static void slickingNoise(String s3) {
        Scanner in = new Scanner(System.in);
        if(s3.equals("y")) {
            System.out.println("Replace the battery.");
            //stop
            System.exit(0);
        }

        else {
            System.out.println("Does the car crank up but fail to start?");
            String s4 = in.nextLine();
            if(s4.equals("y")) {
                System.out.println("Check spark plug connections.");
                //stop
                System.exit(0);
            }
            System.out.println("Does the engine start and then die?");
            String s5 = in.nextLine();
            if(s5.equals("y")) {
                System.out.println("Does you car have fuel injection?");
                String s6 = in.next();
                if (s6.equals("y")) {
                    System.out.println("Get it in for service.");
                    //stop
                    System.exit(0);
                }
                else{
                    System.out.println("Check to ensure the choke is opening and closing.");
                    //stop
                    System.exit(0);
                }
            }
            else{
                System.out.println("This should not be possible.");
                //stop
                System.exit(0);
            }
        }


    }

    private static void batteryOption(String s2) {
            if(s2.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else{
                System.out.println("Replace cables and try again.");
            }
            System.exit(0);
    }


}
