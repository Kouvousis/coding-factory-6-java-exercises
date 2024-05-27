package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Receives  a year from the user and returns
 * if it is a leap year or not
 */
public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        System.out.println("Please insert a year:");
        year = scanner.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0 ) {
            System.out.printf("The year %d is a leap year", year);
        } else {
            System.out.printf("The year %d is not a leap year", year);
        }

    }
}
