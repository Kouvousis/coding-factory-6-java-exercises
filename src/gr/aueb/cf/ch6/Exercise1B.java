package gr.aueb.cf.ch6;

import java.util.Scanner;

public class Exercise1B {

    public static void main(String[] args) {
        int arr[] = inputArray();
        System.out.println("The input array contains no more than three even values: " + hasNoMoreThanThreeEvenElements(arr));
        System.out.println("The input array contains no more than three odd values: " + hasNoMoreThanThreeOddElements(arr));
        System.out.println("The input array contains no more than three consecutive same numbers " + hasNoMoreThanThreeConsecutiveNumbers(arr));
        System.out.println("The input array contains no more than three consecutive numbers ending in the same number " + hasNoMoreThanThreeConsecutiveEndingNumbers(arr));
        System.out.println("The input array contains no more than three consecutive numbers ending in the same tens " + hasNoMoreThanThreeConsecutiveEndingTens(arr));


    }

    public static int[] inputArray() {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Please insert six integers between 1 and 49");
        for(int i = 0; i <= arr.length- 1; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        return arr;
    }

    public static boolean hasNoMoreThanThreeEvenElements(int arr[]){
        int count = 0;
        boolean flag = true;
        for(int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        if (count > 3) {
            flag = false;
        }
        return flag;
    }

    public static boolean hasNoMoreThanThreeOddElements(int arr[]){
        int count = 0;
        boolean flag = true;
        for(int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        if (count > 3) {
            flag = false;
        }
        return flag;
    }

    public static boolean hasNoMoreThanThreeConsecutiveNumbers(int[] arr) {
        int count = 0;
        boolean flag = true;;
        for(int i = 1; i <= arr.length - 1; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
            }
        }
        if (count >= 3) {
            flag = false;
        }
        return flag;
    }

    public static boolean hasNoMoreThanThreeConsecutiveEndingNumbers(int[] arr) {
        int count = 0;
        boolean flag = true;;
        for(int i = 1; i <= arr.length - 1; i++) {
            if ((arr[i - 1] % 10) == (arr[i] % 10)) {
                count++;
            }
        }
        if (count >= 3) {
            flag = false;
        }
        return flag;
    }

    public static boolean hasNoMoreThanThreeConsecutiveEndingTens(int[] arr) {
        int count = 0;
        boolean flag = true;;
        for(int i = 1; i <= arr.length - 1; i++) {
            if ((arr[i - 1] / 10) == (arr[i] / 10)) {
                count++;
            }
        }
        if (count >= 3) {
            flag = false;
        }
        return flag;
    }
}
