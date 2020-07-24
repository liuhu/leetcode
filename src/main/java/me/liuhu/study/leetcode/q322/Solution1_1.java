package me.liuhu.study.leetcode.q322;

import java.util.Arrays;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/23
 **/
public class Solution1_1 implements Solution {
    @Override
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        return dfs(coins, amount, coins.length - 1);
    }

    private int dfs(int[] coins, int amount, int level) {
        if (amount == 0) {
            return 0;
        }
        if (level >= 0 && amount > 0) {
            int maxVal = amount / coins[level];
            int minCost = Integer.MAX_VALUE;
            for (int i = 0; i <= maxVal; i++) {
                if (amount >= i * coins[level]) {
                    int res = dfs(coins, amount - i * coins[level], level - 1);
                    if (-1 != res) {
                        minCost = Math.min(minCost, res + i);
                    }
                }
            }
            return (minCost == Integer.MAX_VALUE) ? -1 : minCost;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution1_1();
        int[] c = new int[]{1,2,5};

        System.out.println(solution.coinChange(c, 11));
    }
}
