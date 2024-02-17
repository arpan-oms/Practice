package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println((findAllDuplicatesInArray(nums)));
    }

    private static List<Integer> findAllDuplicatesInArray(int[] nums) {
        int i=0;
        List<Integer> duplicateValues = new ArrayList<Integer>();
        while (i<nums.length) {
            int curInd = nums[i] - 1;
            if (nums[i] == i + 1) {
                i++;
            } else if (nums[i]==nums[curInd]) {
                i++;
            } else {
                nums = swap(nums, i, curInd);
            }
        }
        for (int j=0; j<nums.length; j++) {
            if (nums[j] != j+1) {
                duplicateValues.add(nums[j]);
            }
        }
        return duplicateValues;
    }

    private static int[] swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return nums;
    }
}
