package me.liuhu.study.leetcode.q70;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution1 implements Solution {

    @Override
    public int climbStairs(int n) {
        Map<Integer, Integer> cache = new HashMap<>();
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int _1 = climbStairs(n - 1);
        int _2 = climbStairs(n - 2);
        cache.putIfAbsent(n - 1, _1);
        cache.putIfAbsent(n - 2, _2);

        return cache.get(n - 1) + cache.get(n - 2);
    }
}
