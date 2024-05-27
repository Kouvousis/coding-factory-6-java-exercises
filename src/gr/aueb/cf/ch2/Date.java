package gr.aueb.cf.ch2;

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please give day month and year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();
        year %= 100;
        System.out.printf("The date is %02d/%02d/%02d", day, month, year);
    }
}
