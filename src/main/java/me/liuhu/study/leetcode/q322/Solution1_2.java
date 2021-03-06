package me.liuhu.study.leetcode.q322;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/27
 **/
public class Solution1_2 implements Solution {

    @Override
    public int coinChange(int[] coins, int amount) {
        int res = dfs(coins, amount, 0, new ArrayList<>());
        return res == 0 ? -1 : res;
    }

    private int dfs(int[] coins, int amount, int level, List<Integer> path) {
        if (amount == 0) {
            System.out.println("方法: " + path);
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
    }
}
