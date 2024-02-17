package corejava;

import java.util.Scanner;

public class FindNumOfOccurrencesInArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,4,7,2,5,7,4,7,0,2,1,6,8,5};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Number of occurrences of " + num + " is " + findNumOfOccurrencesInArray(num, array));
    }

    private static int findNumOfOccurrencesInArray(int num, int[] array) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if (num == array[i])
                count++;
        }
        return count;
    }
}
