package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Prints n stars in a vertical line
 */
public class StarsVertical {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please give a number of stars you want to be printed");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

    }
}
