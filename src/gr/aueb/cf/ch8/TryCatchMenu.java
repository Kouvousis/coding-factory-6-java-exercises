package gr.aueb.cf.ch8;

import java.util.Scanner;

public class TryCatchMenu {

    public static void main(String[] args) {
        getMenu();
        int choice = getChoice();
        try {
            printChoice(choice);
        } catch (IllegalArgumentException e) {
            System.out.println("Error in choice");
        }
    }

    public static void getMenu() {
        System.out.println("1.Add");
        System.out.println("2.Delete");
        System.out.println("3.Modify");
        System.out.println("4.Create");
        System.out.println("5.Exit");
    }

    public static int getChoice() {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        boolean flag = false;

        while (!flag) {
            if (in.hasNextInt()) {
                choice = in.nextInt();
                flag = true;
            } else {
                System.out.println("Invalid input. Please insert an integer.");
                in.next();
            }
        }
        in.close();
        return choice;
    }

    public static void printChoice(int choice) throws IllegalArgumentException{
        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException();
        }
        System.out.println(choice);
    }
}
