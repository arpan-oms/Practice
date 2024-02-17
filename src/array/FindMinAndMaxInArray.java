package array;

public class FindMinAndMaxInArray {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int min=arr[0], max=arr[0];
        for (int i=1; i<arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
