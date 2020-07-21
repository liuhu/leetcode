package me.liuhu.study.leetcode.q200;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/21
 **/
public class Solution1 implements Solution {

    @Override
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == '1') {
                    count ++;
                    dfs(grid, row, column);
                }
            }
        }
        return count;
    }


    private void dfs(char[][] grid, int row, int column) {
        if (grid[row][column] == '0') {
            return;
        }

        grid[row][column] = '0';

        if (row - 1 >= 0) {
            dfs(grid, row - 1, column);
        }

        if (row + 1 < grid.length) {
            dfs(grid, row + 1, column);
        }

        if (column - 1 >= 0) {
            dfs(grid, row, column - 1);
        }

        if (column + 1 < grid[0].length) {
            dfs(grid, row, column + 1);
        }
    }


    public static void main(String[] args) {
        int [][] a = new int[2][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;

        a[1][0] = 4;
        a[1][1] = 5;
        a[1][2] = 6;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println(a[i][j]);
            }
        }

        System.out.println();
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a);
    }
}
