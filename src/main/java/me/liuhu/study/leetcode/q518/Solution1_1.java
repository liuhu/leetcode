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
    public int change(int amount, int[] coins) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), amount, coins, 0);
        System.out.println(result);
        return result.size();
    }


    private void dfs(List<List<Integer>> result, List<Integer> path, int amount, int[] coins, int level) {
        if (amount == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (amount > 0 && level < coins.length) {
            int max = amount / coins[level];
            for (int i = 0; i <= max; i++) {
                if (amount >= i * coins[level]) {
                    for (int j = 0; j < i; j++) {
                        path.add(coins[level]);
                    }
                    dfs(result, path, amount - i * coins[level], coins, level + 1);
                    for (int j = 0; j < i; j++) {
                        path.remove(path.size() - 1);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution1_1();
        int r = solution.change(23, new int[]{1,2,5});
        System.out.println(r);
    }
}
