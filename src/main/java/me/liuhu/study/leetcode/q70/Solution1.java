package me.liuhu.study.leetcode.q70;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: LiuHu
 * @create: 2020/7/6
 **/
public class Solution1 implements Solution {
    Map<Integer, Integer> cache = new HashMap<>();

    @Override
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (null == cache.get(n - 1)) {
            int _1 = climbStairs(n - 1);
            cache.put(n - 1, _1);
        }
        if (null == cache.get(n - 2)) {
            int _2 = climbStairs(n - 2);
            cache.put(n - 2, _2);
        }
        return cache.get(n - 1) + cache.get(n - 2);
    }
}
