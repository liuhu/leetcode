package me.liuhu.study.leetcode.q64;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/31
 **/
public class Solution1 implements Solution {

    @Override
    public int minPathSum(int[][] grid) {
        for (int i = 1; i < grid.length; i++) {
            grid[i][0] = grid[i][0] + grid[i - 1][0];
        }

        for (int i = 1; i < grid[0].length; i++) {
            grid[0][i] = grid[0][i] + grid[0][i - 1];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[][] grid = new int[][] {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(solution1.minPathSum(grid));
    }
}
