package array;

import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 2, 6, 5};
        System.out.println(findMissingAndDuplicate(nums));
    }

    private static List<Integer> findMissingAndDuplicate(int[] nums) {
        List<Integer> duplicateAndMissingValues = new ArrayList<Integer>();
        int i=0;
        while (i<nums.length) {
            int current = nums[i] - 1;
            if (nums[i] != i + 1 && nums[i] != nums[current]) {
                swap(nums, i, current);
            } else {
                i++;
            }
        }
        for (int j=0; j<nums.length; j++) {
            if (nums[j] != j+1) {
                duplicateAndMissingValues.add(nums[j]);
                duplicateAndMissingValues.add(j+1);
            }
        }
        return duplicateAndMissingValues;
    }

    private static int[] swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return nums;
    }
}
