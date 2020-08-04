package me.liuhu.study.leetcode.q63;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/4
 **/
public class Solution1 implements Solution {
    @Override
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;
        if (1 == obstacleGrid[0][0]) {
            return 0;
        }
        int[][] dp = new int[row][column];
        for (int i = 1; i < row; i++) {
            if (1 == obstacleGrid[i][0]) {
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 0; i < column; i++) {
            if (1 == obstacleGrid[0][i]) {
                break;
            }
            dp[0][i] = 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                int t = obstacleGrid[i][j];
                if (t == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[row - 1][column - 1];
    }
}
