package corejava;

import java.util.Scanner;

public class CalculatorTillX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i=0, op=' '; op!='x' || op!='X'; i++) {
            System.out.println("Enter operation type: ");
            op = scanner.next().trim().charAt(0);
            if (op=='x' || op=='X') {
                break;
            }
            System.out.println("Enter the two numbers: ");
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (op == '+') {
                System.out.println("Result: " + (first + second));
            } else if (op == '-') {
                System.out.println("Result: " + (first - second));
            } else if (op == '*') {
                System.out.println("Result: " + (first * second));
            } else if (op == '/') {
                System.out.println("Result: " + (first / second));
            } else if (op == '%') {
                System.out.println("Result: " + (first % second));
            } else {
                System.out.println("Invalid operation!");
            }
        }
    }
}
