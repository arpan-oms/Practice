package input;

import java.util.Scanner;
public class ScannerInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int rollno = input.nextInt();
        //System.out.println("Roll number is " + rollno);

        String name = input.next();
        System.out.println(name);
        System.out.println(input.nextLine());
        System.out.println(input.next());

    }
}
