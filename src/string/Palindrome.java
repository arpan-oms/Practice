package string;
// Check whether a string is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        String str = "abcba";

        //Using array
        char[] array = str.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for (int i= array.length -1; i>=0; i--) {
            reverse.append(array[i]);
        }
        if (str.equals(reverse.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        //Using string function
        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);
        int i=0;
        while (start < end) {
            if (start != end) {
                System.out.println("Not palindrome");
                break;
            } else {
                i++;
                start = str.charAt(i);
                end = str.charAt(str.length() - i);
            }
        }
        if (start >= end) {
            System.out.println("Palindrome");
        }

    }
}
