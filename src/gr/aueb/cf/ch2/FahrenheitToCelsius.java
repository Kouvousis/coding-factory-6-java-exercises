package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts Fahrenheit to Celsius
 */
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fahrenheit = 0;
        int celsius = 0;

        System.out.println("Please insert temperature in Fahrenheit");
        fahrenheit = in.nextInt();
        celsius = 5 * (fahrenheit - 32) / 9;
        System.out.printf("The temperature in Celsius is %d", celsius);

    }
}
