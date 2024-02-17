package array;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 2, 0};
        int peakIndex = peakIndexInMountainArray(arr);
        int target = 2;
        int indexOfTarget = orderAgnosticBinarySearch(arr, target, 0, peakIndex);
        if (indexOfTarget == -1) {
            indexOfTarget = orderAgnosticBinarySearch(arr, target, peakIndex + 1, arr.length-1);
        }
        System.out.println(indexOfTarget);
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

    private static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];
        while (start<=end) {
            //int mid = (start+end)/2;
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid]>target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid]<target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
