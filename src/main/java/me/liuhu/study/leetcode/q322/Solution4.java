package me.liuhu.study.leetcode.q322;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/27
 **/
public class Solution4 implements Solution {

    Integer min = Integer.MAX_VALUE;
    @Override
    public int coinChange(int[] coins, int amount) {
        helper(coins, amount, 0);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public void helper(int[] coins, int amount, int step) {
        if (amount == 0) {
            min = Math.min(min, step);
            return;
        }
        if (amount < 0) {
            return;
        }
        for (Integer coin : coins) {
            helper(coins, amount - coin, step + 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution4();
        int[] c = new int[]{1,2,5};

        System.out.println(solution.coinChange(c, -1));
    }
}
