package array;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    private static int[] cyclicSort(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (i != arr[i] - 1) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }
}
