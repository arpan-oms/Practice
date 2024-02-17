package array;

import java.util.Arrays;

// Return array of index of first and last position of element in array
public class FindFirstAndLastPositionInArray {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstPosition = -1, lastPosition = -1;
        firstPosition = getIndexPosition(nums, target, true);
        if (firstPosition != -1) {
            lastPosition = getIndexPosition(nums, target, false);
        }
        return new int[] {firstPosition, lastPosition};
    }

    private static int getIndexPosition(int[] nums, int target, boolean isFirstPosition) {
        int ans = -1, start=0, end=nums.length-1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target == nums[mid]) {
                ans = mid; // potential answer
                if (isFirstPosition) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
