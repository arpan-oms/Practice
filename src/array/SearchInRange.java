package array;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int searchNum = 3;
        int startOfRange = 1;
        int endOfRange = 4;
        System.out.println("Index is " + searchInRange(arr, searchNum, startOfRange, endOfRange));
    }

    private static int searchInRange(int[] arr, int searchNum, int startOfRange, int endOfRange) {
        for (int i = startOfRange; i<endOfRange; i++) {
            if (arr[i] == searchNum) {
                return i;
            }
        }
        return -1;
    }
}
