package me.liuhu.study.leetcode.q221;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/8/7
 **/
public class Solution1 implements Solution {

    private int max = 0;

    @Override
    public int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dfs(matrix, i, j);
            }
        }
        return max * max;
    }


    public void dfs(char[][] matrix, int row, int column) {
        int r = row;
        int c = column;
        if (matrix[row][column] == '0') {
            return;
        }
        int m = 1;
        max = Math.max(max, m);
        while (r < matrix.length - 1 && c < matrix[0].length - 1) {
            r++;
            c++;
            if (matrix[r][c] != '1') {
                return;
            }
            for (int i = 1; i <= r - row; i++) {
                if (matrix[r][c - i] == '0') {
                    return;
                }
                if (matrix[r - i][c] == '0') {
                    return;
                }
            }
            m++;
            max = Math.max(max, m);
        }
    }

    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        char[][] matrix = new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
//        char[][] matrix = new char[][] {{'1','1'},{'1','1'}};
//        char[][] matrix = new char[][] {{'0','0','0','1','0','1','1','1'},
//                                        {'0','1','1','0','0','1','0','1'},
//                                        {'1','0','1','1','1','1','0','1'},
//                                        {'0','0','0','1','0','0','0','0'},
//                                        {'0','0','1','0','0','0','1','0'},
//                                        {'1','1','1','0','0','1','1','1'},
//                                        {'1','0','0','1','1','0','0','1'},
//                                        {'0','1','0','0','1','1','0','0'},
//                                        {'1','0','0','1','0','0','0','0'}};
        System.out.println( solution.maximalSquare(matrix));

    }
}
