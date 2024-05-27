package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Menu app with do while
 */
public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following choices:");
            System.out.println("1. Εισαγώγη");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρψση");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση");
            } else if (choice == 5) {
                System.out.println("Έξοδος απο μενού");
            } else {
                System.out.println("Εισάγατε λάθος νούμερο");
            }
        } while (choice != 5);
        System.out.println("Thank you for using our app!");

    }
}
