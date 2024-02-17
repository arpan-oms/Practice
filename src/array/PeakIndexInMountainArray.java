package array;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 2, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start=0, end=arr.length-1;
        while (start<end) {
            int mid = start + (end - start)/2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1; // possible answer
            } else {
                end  = mid; // possible answer
            }
        }
        return  start; // or return end
    }
}
