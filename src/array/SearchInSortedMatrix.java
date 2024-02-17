package array;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10,11,12},
                        {13,14,15,17}};
        int target = 16;
        System.out.println(Arrays.toString(searchInSortedMatrix(arr, target)));
    }

    private static long[] searchInSortedMatrix(int[][] arr, int target) {
        int startOfRow = 0, endOfRow = arr.length - 1;
        int startOfCol = 0, endOfCol = arr[0].length - 1;
        // search for row
        while (startOfRow <= endOfRow) {
            int midOfRow = startOfRow + (endOfRow-startOfRow)/2;
            if (target < arr[midOfRow][startOfCol]) {
                endOfRow = midOfRow - 1;
            } else if (target <= arr[midOfRow][endOfCol]) {
                startOfRow = midOfRow;
                endOfRow = midOfRow;
                break;
            } else {
                startOfRow = midOfRow + 1;
            }
        }

        if (startOfRow != endOfRow) {
            return new long[]{-1,-1};
        }

        //search for column
        while (startOfCol <= endOfCol) {
            int midOfCol = startOfCol + (endOfCol-startOfCol)/2;
            if (target < arr[startOfRow][midOfCol]) {
                endOfCol = midOfCol - 1;
            } else if (target == arr[startOfRow][midOfCol]) {
                startOfCol = midOfCol;
                endOfCol = midOfCol;
                return new long[]{startOfRow,endOfCol};
            } else {
                startOfCol = midOfCol + 1;
            }
        }
        if (startOfCol != endOfCol) {
            return new long[]{-1,-1};
        } else {
            return new long[]{startOfRow,endOfCol};
        }
    }
}
