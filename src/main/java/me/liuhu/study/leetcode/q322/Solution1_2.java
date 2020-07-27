package me.liuhu.study.leetcode.q322;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/27
 **/
public class Solution1_2 implements Solution {

    Integer min = Integer.MAX_VALUE;
    @Override
    public int coinChange(int[] coins, int amount) {
        return dfs(coins, amount, 0, new ArrayList<>());
    }

    private int dfs(int[] coins, int amount, int level, List<Integer> path) {
        if (amount == 0) {
            System.out.println("方法: " + path);
            min = Math.min(min, path.size());
            return 1;
        }
        if (amount < 0) {
            return 0;
        }
        int res = 0;
        for (int i = level; i < coins.length; i++) {
            path.add(coins[i]);
            res += dfs(coins, amount - coins[i], i, path);
            path.remove(path.size() - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution1_2 solution = new Solution1_2();
        int[] c = new int[]{1,2,5};
        System.out.println("组合方式总数: " + solution.coinChange(c, 5));
        System.out.println("最小次数: " + solution.min);
    }
}
