package me.liuhu.study.leetcode.q518;

/**
 * 518. 零钱兑换 II
 * https://leetcode-cn.com/problems/coin-change-2/
 * 输入: amount = 5, coins = [1, 2, 5]
 * 输出: 4
 * 解释: 有四种方式可以凑成总金额:
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 *
 * @description:
 * @author: LiuHu
 * @create: 2020/7/24
 **/
public class Solution1_2 implements Solution {

    @Override
    public int change(int amount, int[] coins) {
        int[][] d = new int[coins.length + 1][amount + 1];
        // 初始化最基础的case
        for (int i = 0; i < d.length; i++) {
            d[i][0] = 1;
        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                int tmp = j - coins[i - 1];
                if (tmp >= 0) {
                    d[i][j] = d[i - 1][j] + d[i][tmp];
                } else {
                    d[i][j] = d[i - 1][j];
                }
            }
        }
        return d[coins.length][amount];
    }

    public static void main(String[] args) {
        Solution1_2 solution = new Solution1_2();
        System.out.println(solution.change(5, new int[]{1, 2, 5}));
    }
}
