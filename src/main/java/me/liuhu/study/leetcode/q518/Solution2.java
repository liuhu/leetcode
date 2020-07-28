package me.liuhu.study.leetcode.q518;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/28
 **/
public class Solution2 {

    /**
     * DP 法
     * @param n
     * @return
     */
    public int climbStairs(int n, int[] steps) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++) {
            for (int coin : steps) {
                if (i < coin) {
                    dp[i] = dp[i] + 0;
                    // continue;
                } else {
                    dp[i] = dp[i] + dp[i - coin];
                }

            }
        }
        return dp[n];
    }


    public int climbStairs2(int n, int[] steps) {
        int res = 0;
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        for (int coin : steps) {
            res = res + climbStairs2(n - coin, steps);
        }

        return res;
    }


    public int climbStairs3(int n, int[] steps) {
        return dfs(steps, n, new ArrayList<>());
    }

    private int dfs(int[] steps, int n, List<Integer> path) {
        if (n == 0) {
            System.out.println("方法: " + path);
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < steps.length; i++) {
            path.add(steps[i]);
            res += dfs(steps, n - steps[i], path);
            path.remove(path.size() - 1);
        }
        return res;
    }


    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.climbStairs(5, new int[]{1,2,5}));
        System.out.println(solution2.climbStairs2(5, new int[]{1,2,5}));
        System.out.println(solution2.climbStairs3(5, new int[]{1,2,5}));

    }
}
