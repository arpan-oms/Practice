package corejava;

import java.util.Scanner;

// A number is Armstrong number, if sum of cube of its digits equals the number. For example - 153 -->  (1)^3 + (5)^3 + (3)^3 = 1 + 125 + 27 = 153
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int num = in.nextInt();
        // Print all 3 digits Armstrong numbers
        for (int i=100; i<1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isArmstrong(int num) {

        int sum=0;
        int numCopy = num;
        for (int i=0; numCopy>0; i++) {
            int rem = numCopy % 10;
            sum += rem * rem * rem;
            numCopy = numCopy/10;
        }
        return (sum == num);
    }
}
