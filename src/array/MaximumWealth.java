package array;

public class MaximumWealth {
    public static void main(String[] args) {
        //int[][] accounts = {{1,5}, {7,3}, {3,5}};
        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        System.out.println("Maximum wealth: " + maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int[] row: accounts) {
            int totalWealth = 0;
            for (int col: row) {
                totalWealth += col;
            }
            if (totalWealth > maximumWealth) {
                maximumWealth = totalWealth;
            }
        }
        return maximumWealth;
    }
}
