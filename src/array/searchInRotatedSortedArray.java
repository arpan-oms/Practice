package array;

public class searchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 2, 4, 5, 7, 8, 9};
        int target = 7;
        int pivot = findPivotInSortedArray(arr);
        int searchIndex = -1;
        if (arr[0] > target) {
            searchIndex = binarySearch(arr, target, pivot + 1, arr.length - 1);
        } else {
            searchIndex = binarySearch(arr, target, 0, pivot);
        }
        System.out.println("Search index: " + searchIndex);

        // find rotation count in rotated array
        System.out.println("Rotation count: " + (pivot + 1));
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target>arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]){
                end = mid - 1;
            } else {
                return  mid;
            }
        }
        return -1;
    }

    private static int findPivotInSortedArray(int[] arr) {
        int pivot = -1;
        int secondMax = arr[arr.length - 1];
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (mid<end && arr[mid] > arr[mid+1]) {
                pivot = mid;
                return pivot;
            } else if (mid>start && arr[mid - 1] > arr[mid]) {
                pivot = mid - 1;
                return pivot;
            } else if (arr[mid] > secondMax) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return pivot;
    }
}
