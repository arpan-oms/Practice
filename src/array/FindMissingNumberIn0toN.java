package array;

public class FindMissingNumberIn0toN {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2};
        int n = 4;
        System.out.println(findMissingNumber(arr, n));
    }

    private static int findMissingNumber(int[] arr, int n) {
        arr = cyclicSort(arr);
        for (int i=0; i<=n; i++) {
            if (i == n) {
                return i;
            } else if (arr[i] != i) {
                return  i;
            }
        }
        return -1;
    }

    private static int[] cyclicSort(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (arr[i] > arr.length-1) {
                i++;
                continue;
            }
            if (i != arr[i]) {
                swap(arr, arr[i], i);
            } else {
                i++;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
