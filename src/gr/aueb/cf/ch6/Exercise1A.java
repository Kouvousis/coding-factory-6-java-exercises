package gr.aueb.cf.ch6;

public class Exercise1A {

    /**
     * Finds the position of the biggest element in the array.
     * @param arr   thw input array.
     * @param low   the starting position of the array.
     * @param high  the ending position of the array.
     * @return      the position of the biggest element value of the array.
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxValue = arr[low];
        int maxPosition = low;
        if (low < 0 || high > arr.length - 1) {
            System.out.println("Error in array dimensions");
            return -1;
        }


        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue ) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    /**
     * Finds the position of the biggest element in the array.
     * @param arr   thw input array.
     * @param low   the starting position of the array.
     * @param high  the ending position of the array.
     * @return      the position of the second biggest element value of the array.
     */
    public static int getSecondBigestElement(int[] arr,int low, int high) {
        int secondBiggestElementPosition = low;
        int maxPosition = getMaxPosition(arr, low, high);
        if (low < 0 || high > arr.length - 1) {
            System.out.println("Error in array dimensions");
            return -1;
        }
        if (maxPosition == low) {
            secondBiggestElementPosition = low + 1;
        }

        for (int i = low; i <= high; i++) {
            if (i != maxPosition && arr[i] > arr[secondBiggestElementPosition]) {
                secondBiggestElementPosition = i;
            }
        }
        return secondBiggestElementPosition;

    }
}
