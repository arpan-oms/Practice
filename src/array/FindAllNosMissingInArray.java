package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNosMissingInArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        int n = 8;
        System.out.println((findAllNosMissingInArray(nums, n)));
    }

    private static List findAllNosMissingInArray(int[] nums, int n) {
        int i=0;
        while (i<nums.length) {
            int current = nums[i] - 1;
            if (nums[current] != nums[i]) {
                nums = swap(nums, i, current);
            } else {
                i++;
            }
        }
        // This is now Sorted array

        List missingNoArray = new ArrayList();
        for (int j=0; j<n; j++) {
            if (nums[j] != j+1) {
                missingNoArray.add(j+1);
            }
        }
        return missingNoArray;
    }

    private static int[] swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return nums;
    }
}
