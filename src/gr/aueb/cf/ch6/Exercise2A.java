package gr.aueb.cf.ch6;

public class Exercise2A {

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 22, 4};
        System.out.println(searchPosition(arr, 10));
        printEven(arr);
        System.out.println();
        traverse(mappingDouble(arr));
        System.out.println();
        System.out.println("The array contains at least one even value: " + oneEvenExists(arr));
        System.out.println("The values of the array are all even: " + isAllEven(arr));
    }


    /**
     * Searches for the position of an element within the array.
     * @param arr       the input array.
     * @param element   the element we are searching for.
     * @return          the position of the element or -1 if it does not exist.
     */
    public static int searchPosition(int[] arr, int element) {
        int pos = -1;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == element) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.printf("No element with the value %d was found\n ", element);
        }
        return pos;
    }


    /**
     * Filters the array and prints the even elements.
     * @param arr   the input array.
     */
    public static void printEven(int[] arr) {
        for(int i = 0; i <= arr.length -1; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    /**
     * Creates a new array with values double of the input array
     * @param arr   the input array.
     * @return      an array with double the values of the original.
     */
    public static int[] mappingDouble(int[] arr) {
        int[] arrDouble = new int[arr.length];
        for(int i = 0; i <= arr.length -1; i++) {
            arrDouble[i] = arr[i] * 2;
        }

        return arrDouble;
    }

    /**
     * Traverses the array and prints the elements.
     * @param arr   the input array.
     */
    public static void traverse(int[] arr) {
        for(int i =0; i <= arr.length -1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Searches  if the array contains at least one even value.
     * @param arr   the input array.
     * @return      true if one even value exists.
     */
    public static boolean oneEvenExists(int[] arr) {
        boolean evenExists = false;
        for(int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                evenExists = true;
            }
        }
        return evenExists;
    }

    /**
     * Checks if all the values of the array are even.
     * @param arr   the input array.
     * @return      true if all values of the array are even.
     */
    public static boolean isAllEven(int[] arr) {
        boolean allEven = true;
        for(int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                allEven = false;
            }
        }
        return allEven;
    }
}
