package corejava;

import java.util.Scanner;

public class FindNumOfOccurrencesInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();
        int search = scanner.nextInt();
        System.out.println("Number of occurrences of " + num + " is " + findNumOfOccurrencesInNumber(num, search));
    }

    private static int findNumOfOccurrencesInNumber(long num, int search) {
        int count = 0;
        for (int i=0; num>=10; i++) {
            long lastNum = num%10;
            if (search == lastNum)
                count++;
            num = num/10;
        }
        return count;
    }
}
