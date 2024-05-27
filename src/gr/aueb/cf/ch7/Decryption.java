package gr.aueb.cf.ch7;

import java.util.Scanner;

public class Decryption {

    public static void main(String[] args) {
        String inputString = " ";
        String encryptedString = " ";
        System.out.println("Please insert a encoded string");
        inputString = getString();
        encryptedString = shiftString(inputString);
        System.out.println(encryptedString);
        System.out.println("Your string has been decrypted successfully");
    }

    /**
     * Gets a string from the user
     * @return  The input string from the user
     */
    public static String getString() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        in.close();
        return inputString;
    }

    /**
     * Decodes a string input from the user by shifting the ASCII value one to the right (ASCII VALUE - 1)
     * @param inputString   the string input of the user
     * @return              the input string shifted by one to the right
     */
    public static String shiftString(String inputString) {
        StringBuilder shift = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            char shiftedChar = (char) (c - 1);
            shift.append(shiftedChar);
        }
        return shift.toString();
    }
}
