package me.liuhu.study.leetcode.q518;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public class Solution1_1 implements Solution {
    @Override
    public int change(int sum, int[] coins) {
        int[][] d = new int[coins.length+1][sum+1];
        for (int i = 0; i <= coins.length; ++i) d[i][0] = 1;

        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < sum+1; j++) {
                System.out.printf(String.valueOf(d[i][j]));
            }
            System.out.println();
        }

        for (int i = 1; i <= coins.length; ++i) {
            for (int j = 1; j <= sum; ++j) {
                System.out.println("i = " + i + " j = " + j);
                System.out.println("d[i][j-coins[i-1]] => " + "d[" + i + "][" + (j-coins[i-1]) + "] = " + ( j >= coins[i-1] ? d[i][j-coins[i-1]] : 0));
                System.out.println("d[i-1][j] =>" + " d[" + (i - 1) + "][" + j  + "] = " + d[i-1][j]);

                int useCurCoin = j >= coins[i-1] ? d[i][j-coins[i-1]] : 0;
                d[i][j] = d[i-1][j] + useCurCoin;
                System.out.println("d[i][j] => " + "d[" + i + "][" + j +"] = " +d[i][j]);
            }
        }

        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < sum+1; j++) {
                System.out.printf(String.valueOf(d[i][j]));
            }
            System.out.println();
        }

        return d[coins.length][sum];
    }

    public static void main(String[] args) {
        Solution solution = new Solution1_1();
        int r = solution.change(5, new int[]{1,2,5});
        System.out.println(r);
    }
}
