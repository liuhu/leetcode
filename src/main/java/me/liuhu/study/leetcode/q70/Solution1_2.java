package me.liuhu.study.leetcode.q70;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/7
 **/
public class Solution1_2 implements Solution {


    @Override
    public int climbStairs(int n) {
        int[] cache = new int[n];
        return help(cache, n);
    }

    private int help(int[] cache, int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (cache[n - 1] == 0) {
            cache[n - 1] = help(cache, n - 1);
        }

        if (cache[n - 2] == 0) {
            cache[n - 2] = help(cache, n - 2);
        }

        return cache[n - 1] + cache[n - 2];
    }
}
