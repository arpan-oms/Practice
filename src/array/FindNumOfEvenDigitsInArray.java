package array;

// Given an array of integers, return how many of them contain an even number of digits
public class FindNumOfEvenDigitsInArray {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        // Answer should be 2 as only 12 and 7896 contain an even number of digits (2 and 4, respectively)
        System.out.println(findNumbers(arr));
    }


    private static int findNumbers(int[] arr) {
        int countOfEvenDigitNum = 0;
        for (int number: arr) {
            if (number<0) {
                number *= -1;
            }
            int countOfDigits = 0;
            if (number == 0) {
                countOfDigits++;
            }
            for (int i=0; number>0; i++) {
                number = number/10;
                countOfDigits++;
            }
            if (countOfDigits%2 == 0) {
                countOfEvenDigitNum++;
            }
        }
        return countOfEvenDigitNum;
    }
}
