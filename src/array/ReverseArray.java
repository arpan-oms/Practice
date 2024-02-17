package array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = twoPointerMethod(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] twoPointerMethod(int[] arr) {
        for (int start = 0, end = arr.length - 1; start<end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
}
