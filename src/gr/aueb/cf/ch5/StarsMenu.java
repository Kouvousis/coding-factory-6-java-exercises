package gr.aueb.cf.ch5;

import java.util.Scanner;

public class StarsMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int choice = 0;

        do {
            System.out.println("Παρακαλώ εισάγετε των αριθμό n");
            n = in.nextInt();
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
            System.out.println("6. Έξοδος από το πρόγραμμα");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    horizontal(n);
                    break;
                case 2:
                    vertical(n);
                    break;
                case 3:
                    square(n);
                    break;
                case 4:
                    oneToN(n);
                    break;
                case 5:
                    ntoOne(n);
                    break;
                case 6:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Σφάλμα επιλογής");
            }
        } while (choice != 6);
        System.out.println("Thank you for using our app");

    }

    public static void horizontal(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void vertical(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void  square(int n) {
        for (int i =1; i <= n; i++) {
            horizontal(n);
            System.out.println();
        }
    }

    public static void oneToN(int n) {
        for (int i = 1; i <= n; i++) {
            horizontal(i);
            System.out.println();
        }
    }

    public static void ntoOne(int n) {
        for (int i = 1; i <= n; i++) {
            horizontal(n - i +1);
            System.out.println();
        }
    }
}
