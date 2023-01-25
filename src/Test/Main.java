package Test;

import java.util.Arrays;

public class Main {

    private static int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        returnNamber();
    }

    public static String returnNamber() {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                number = arr[i] + 1;
                System.out.print(number + " ");
            }
        }
        System.out.println();

        int[] arr2 = Arrays.copyOfRange(arr, 4, 8);
        String str2 = Arrays.toString(arr2);
        return str2;

    }
}