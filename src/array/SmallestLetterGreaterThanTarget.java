package array;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char ans = smallestLetterGreaterThanTarget(letters, target);
        System.out.println(ans);
    }

    private static char smallestLetterGreaterThanTarget(char[] arr, char target) {
        int start=0, end= arr.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if (target > arr[mid] || target==arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
