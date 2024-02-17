package array;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println((findDuplicateNumber(nums)));
    }

    private static int findDuplicateNumber(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int curInd = nums[i] - 1;
            if (nums[i] == i + 1) {
                i++;
            } else if (nums[i]==nums[curInd]) {
                return nums[i];
            } else {
                nums = swap(nums, i, curInd);
            }
        }
        return -1;
    }

    private static int[] swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
        return nums;
    }
}
