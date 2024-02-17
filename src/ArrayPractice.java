import java.lang.reflect.Array;
import java.time.Clock;

public class ArrayPractice {

    public static void main(String[] args) {
        oneDArray(10);
        int[][] arr = twoDArray(2, 3);
        searchValue(arr, 2);
        sortArray(arr);
    }

    private static void oneDArray(int max) {
        int[] arr = new int[max];
        for (int i=0; i<max; i++) {
            arr[i] = i+1;
        }
        System.out.println("Displaying 1-D array output::");
        for (int i=0; i<max; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[][] twoDArray(int maxRow, int maxCol) {
        int[][] arr = new int[maxRow][maxCol];
        for (int i=0; i<maxRow; i++) {
            for (int j=0; j<maxCol; j++) {
                arr[i][j] = j;
            }
        }
        System.out.println("Displaying 2-D array output::");
        for (int i=0; i<maxRow; i++) {
            for (int j=0; j<maxCol; j++) {
                System.out.println(arr[i][j]);
            }
        }
        return arr;
    }

    private static void searchValue(int[][] arr, int num) {
        for (int i=0; i< arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (arr[i][j] == num) {
                    System.out.println("i:" + i + ",j:" + j);
                    break;
                }
            }
        }
    }

    private static void sortArray(int[][] arr) {

    }
}
