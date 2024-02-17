package array;

public class SplitArrayMinimizeLargestSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;
        System.out.println(splitArray(nums, m));
    }

    private static int splitArray(int[] nums, int m) {
        int start = 0, end = 0;
        for (int currentNumber: nums) {
            start = Math.max(start, currentNumber);
            end += currentNumber;
        }

        // Binary search
        while (start<end) {
            // possible answer
            int mid = start + (end - start)/2;

            // calculate number of pieces of subarray
            int sum = 0, pieces = 1;
            for (int currentNumber: nums) {
                if (sum + currentNumber > mid) {
                    // create a new subarray
                    pieces++;
                    sum = currentNumber;
                } else {
                    sum+=currentNumber;
                }
            }

            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // here start==end
    }
}
