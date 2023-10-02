import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = triangle[n - 1][i];
        }


        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[row][col] = triangle[row][col] + Math.max(dp[row + 1][col], dp[row + 1][col + 1]);
            }
        }

        return dp[0][0];
    }
}