package array;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 10, 9, 6, 3, 89, 71};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter search number: ");
        int searchNum = in.nextInt();
        int index = search(arr, searchNum);
        System.out.println(index);
    }

    private static int search(int[] arr, int searchNum) {
        for(int index = 0; index<arr.length; index++) {
            int current = arr[index];
            if (current == searchNum) {
                return index;
            }
        }
        return -1;
    }

}
