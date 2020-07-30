package me.liuhu.study.leetcode.q518;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/28
 **/
public class ClimbStair2 {

    /**
     * DP 法
     * @param n
     * @return
     */
    public int climbStairs(int n, int[] steps) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for(int i = 1; i <= n; i++) {
            for (int step : steps) {
                if (i < step) {
                    //dp[i] = dp[i] + 0;
                    continue;
                } else {
                    dp[i] = dp[i] + dp[i - step];
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i]);
        }
        return dp[n];
    }


    public int climbStairs2(int n, int[] steps) {
        int res = 0;
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        for (int step : steps) {
            res = res + climbStairs2(n - step, steps);
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


    public int climbStairs4(int n, int[] steps) {
        int res = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer count = queue.poll();
                for (int step : steps) {
                    int newCount = count - step;
                    if (newCount == 0) {
                        res ++;
                    } else if (newCount > 0) {
                        queue.add(newCount);
                    }
                }
            }
        }
        return res;
    }



    public static void main(String[] args) {
        ClimbStair2 solution2 = new ClimbStair2();
        System.out.println(solution2.climbStairs(5, new int[]{1,2,5}));
        System.out.println(solution2.climbStairs2(5, new int[]{1,2,5}));
        System.out.println(solution2.climbStairs3(5, new int[]{1,2,5}));
        System.out.println(solution2.climbStairs4(5, new int[]{1,2,5}));
    }
}
