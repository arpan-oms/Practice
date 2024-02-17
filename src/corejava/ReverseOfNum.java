package corejava;

import input.ScannerInput;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int newNum = 0;
        for (int i=0; num>0; i++) {
            int lastnum = num%10;
            newNum = newNum*10 + lastnum;
            num = num/10;
        }
        System.out.println("Reverse is " + newNum);
    }
}
