package me.liuhu.study.leetcode.q322;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/27
 **/
public class Solution4 implements Solution {

    Integer min = Integer.MAX_VALUE;
    @Override
    public int coinChange(int[] coins, int amount) {
        List<Integer> coin = new ArrayList<>();
        for(int c : coins) coin.add(c);
        helper(coin, amount, 0);
        return min;
    }

    public void helper(List<Integer> coins, int amount, int step) {
        if (coins.contains(amount)) {
            return;
        }
        if (amount <= 0) {
            return;
        }
        min = Math.min(min, step);
        for (Integer coin : coins) {
            helper(coins, amount - coin, step + 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1();
        int[] c = new int[]{1,2,5};

        System.out.println(solution.coinChange(c, 3));
    }
}
