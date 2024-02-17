package array;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(findFirstMissingPositive(nums));
    }

    private static int findFirstMissingPositive(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (arr[i]>0 && arr[i]!=i+1) {
                swap(arr, i, arr[i]-1);
            } else {
                i++;
            }
        }
        for (int j=0; j<=arr.length; j++) {
            if (j==arr.length) {
                return j+1;
            }
            if (j+1!=arr[j]) {
                return j+1;
            }
        }
        return -1;
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
