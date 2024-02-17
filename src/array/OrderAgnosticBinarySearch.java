package array;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start=0, end=arr.length-1;
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
