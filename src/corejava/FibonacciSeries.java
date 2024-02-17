package corejava;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fibonacciSeries(num);
    }

    private static void fibonacciSeries(int num) {
        int first = 0;
        int second = 1;
        int sum = 0;
        if (num >= 0) {
            sum += first;
            System.out.print(first + " ");
        }
        if (num >= 1) {
            sum += second;
            System.out.print(second + " ");
        }

        for (int i=2; i<=num; i++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
        }
        System.out.println();
        System.out.println("Fibonacci number : " + sum);
    }
}
